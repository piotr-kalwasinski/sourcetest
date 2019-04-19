package sourcetest

import enums.RequestStatus
import enums.RequestType

import java.time.LocalDateTime

class RequestHistory {

    LocalDateTime created
    RequestType requestType
    String requestParam
    RequestStatus requestStatus
    LocalDateTime requestStart
    LocalDateTime requestFinished
    String fetchResult


    static constraints = {
    }
}
