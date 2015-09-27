name := "blog"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
) 

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "bootstrap" % "3.0.3",
  "com.tzavellas" % "sse-guice" % "0.7.1",
  "com.google.inject" % "guice" % "3.0"
)


play.Project.playScalaSettings
