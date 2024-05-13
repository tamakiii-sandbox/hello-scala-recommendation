import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.model.StatusCodes
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RoutesSpec extends AnyWordSpec with Matchers with ScalatestRouteTest {
  "Routes" should {
    "return a 'Hello, World!' response for GET requests at the root path" in {
      Get() ~> Routes.helloWorldRoute ~> check {
        status shouldBe StatusCodes.OK
        responseAs[String] shouldBe "Hello, World!"
      }
    }
  }
}
