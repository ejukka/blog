package module

import com.tzavellas.sse.guice.ScalaModule
import services.mock.MockRestService
import services.RestService

class TestModule extends ScalaModule {

  def configure() {
    bind[RestService].to[MockRestService]
  }
}