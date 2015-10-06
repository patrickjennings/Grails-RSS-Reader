package testserver

class RssFeedController {

    def index() {
        redirect( action: "list", params: params )
    }

    def create() { }

    def save() {
        def feed = new RssFeed( params )

        if( !feed.validate( ["feed"] ) ) {
            render "Not a valid URL"
            return
        }

        def rss = new XmlSlurper().parse( feed.feed )

        feed.title = rss.channel.title

        feed.save()

        rss.channel.item.each {
            def link = new Link( title: it.title.text(), link: it.link.text(), feed: feed )
            link.save(flush: true, failOnError: true)
        }

        redirect( view: "show", id: feed.id )
    }

    def show( Long id ) {
        def feed = RssFeed.get( id )

        if( !feed ) {
            render "Not found"
            return
        }

        def criteria = Link.createCriteria()

        def links = criteria.list {
            eq( 'feed', feed )
        }

        [ feed: feed, links: links ]
    }

    def list() {
        [ feeds: RssFeed.list() ]
    }
}
