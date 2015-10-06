package testserver

import grails.converters.JSON

class HelloController {

    def index() {
    }

    def json() {
        render Link.list() as JSON
    }
}
