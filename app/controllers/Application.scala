package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index2 = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def index = Action {
    Ok(views.html.index2())
  }
  
  def blog = Action {
    Ok(views.html.hello())
  }
  
   def blog2 = Action {
    Ok(views.html.blog())
  }

}