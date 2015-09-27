package injector

import com.google.inject.Guice
import com.google.inject.Injector
import play.Logger
import play.Play
import utils.Config
import module.TestModule
import module.ProductionModule
import services.RestService
import play.Logger

trait ServiceInjector extends Config {

  lazy val injector = getInjector
  
  def getRestService(): RestService = {
    val restService = injector.getInstance(classOf[RestService])
    restService
  }
  
  private def getInjector(): Injector = {
    Logger.debug(""+conf("test.application"))
   if (Play.isTest || conf("test.application") == "test") {
     Logger.info("Starting application in test mode...")
     Guice.createInjector(new TestModule())
   } else {
     Logger.info("Starting application in production mode...")
     Guice.createInjector(new ProductionModule())
   } 
   }

}