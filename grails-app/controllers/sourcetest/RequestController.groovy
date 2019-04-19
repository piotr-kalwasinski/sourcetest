package sourcetest

class RequestController {

    def index() {
        ["requestHistory": RequestHistory.findAll(sort:"created",order: "desc")]
    }

    def retrieveByZipCode() {
        println params.zipCode
    }

    def retrieveByCorners() {
        println params.corners

    }


}
