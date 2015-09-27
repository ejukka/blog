package junit

import org.junit.Test
import utils.Config
import org.junit.Assert

class ConfigTest extends Config {

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