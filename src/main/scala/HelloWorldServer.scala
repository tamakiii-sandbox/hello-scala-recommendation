import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import scala.io.StdIn

object HelloWorldServer {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem(Behaviors.empty, "HelloWorldSystem")
    implicit val executionContext = system.executionContext

    val route = Routes.helloWorldRoute

    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)

    println(s"Server now online. Please navigate to http://localhost:8080/hello\nPress RETURN to stop...")
    StdIn.readLine()
    sys.addShutdownHook {
      bindingFuture
        .flatMap(_.unbind())
        .onComplete(_ => system.terminate())
    }
  }
}
