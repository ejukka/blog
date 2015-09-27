package controllers

import play.api._
import play.api.mvc._
import injector.ServiceInjector
import scala.concurrent.ExecutionContext.Implicits.global

object Rest extends Controller with ServiceInjector {

  lazy val restService = getRestService

  def test = Action.async { implicit request =>
      restService.connect("http://www.hel.fi/palvelukarttaws/rest/v2/organization/") map (future =>
        Ok(future))
    }
}