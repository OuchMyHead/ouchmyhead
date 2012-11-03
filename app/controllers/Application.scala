package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    val email = Play.current.configuration.getString("contact.email").getOrElse( "mathieson10@gmail.com" )
    Ok(views.html.index( email ))
  }
  
}