import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

object Routes {
  def helloWorldRoute: Route =
    pathEndOrSingleSlash {
      complete("Hello, World!")
    }
}
