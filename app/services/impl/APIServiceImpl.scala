package services.impl

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import services.APIService

class APIServiceImpl extends APIService {

  def getAPIDescription(): scala.concurrent.Future[String] = {
    Future("api")
  }
}