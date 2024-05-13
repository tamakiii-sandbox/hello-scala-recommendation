lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-scala-recommendation",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.4.1",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
