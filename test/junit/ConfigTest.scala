package junit

import org.junit.Test
import utils.Config
import org.junit.Assert
import org.specs2.mutable._
import play.api.test._
import play.api.test.Helpers._
import play.api.mvc.Controller
import play.api.mvc.SimpleResult._
import play.api.libs.json.Json._
import play.api.Play
import utils.Config

class ConfigTest extends Specification with Config {
  running(FakeApplication(additionalConfiguration = inMemoryDatabase())) {

    @Test def getConfigNotFound() {
      val notFound = conf("testi")
      Assert.assertNotNull(notFound)
      Assert.assertEquals("notFound", notFound)
    }

    @Test def getConfigFound() {
      val found = conf("test.application")
      Assert.assertNotNull(found)
      Assert.assertEquals("not-test", found)
    }
  }
}