package module

import com.tzavellas.sse.guice.ScalaModule
import services.mock.MockRestService
import services.RestService
import services.impl.RestServiceImpl

class ProductionModule extends ScalaModule {

  def configure() {
    bind[RestService].to[RestServiceImpl]
  }
}