package services.impl

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import play.api.libs.json.Json
import play.api.libs.json.Json.toJsFieldJsValueWrapper
import services.APIService
import utils.Config

class APIServiceImpl extends APIService with Config {

  def getAPIDescription(): scala.concurrent.Future[String] = {
    val json = Json.obj(
      "blog" -> conf("blog.user.name"),
      "text" -> "title text",
      "links" -> "list of links")
    
    Future(json.toString)
  }
}