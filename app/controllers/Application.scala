package controllers

import play.api._
import play.api.mvc._
import utils.Config

object Application extends Controller with Config {

  def index = Action {
    Ok(views.html.index(conf("blog.user.name")))
  }
}