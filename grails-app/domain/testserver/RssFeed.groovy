package testserver

class RssFeed {
    String feed
    String title

    static constraints = {
        feed url: true
    }
}
