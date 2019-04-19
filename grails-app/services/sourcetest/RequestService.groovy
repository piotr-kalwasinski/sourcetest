package sourcetest

import grails.gorm.transactions.Transactional
import org.springframework.scheduling.annotation.Async

@Transactional
class RequestService {

    @Async
    def retrieveRequest(requestParam) {

        print "request to soap $requestParam"

    }
}
