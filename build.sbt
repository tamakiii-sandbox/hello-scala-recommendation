lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-scala-recommendation",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.4.1",

    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.5.3",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.8.5",
      "com.typesafe.akka" %% "akka-stream" % "2.8.5",
      "com.typesafe.akka" %% "akka-testkit" % "2.8.5" % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % "10.5.3" % Test,
      "org.scalatest" %% "scalatest" % "3.2.18" % Test,
    )
  )
