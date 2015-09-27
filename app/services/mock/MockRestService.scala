package services.mock

import services.RestService
import play.api.libs.ws.WS
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class MockRestService extends RestService { 

     def connect(name: String): scala.concurrent.Future[String] = {
       Future("this is mock response")
   }
}