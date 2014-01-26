name := "blog"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
) 

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1",
  //"org.webjars" % "bootstrap" % "2.3.1"
    "org.webjars" % "bootstrap" % "3.0.3"
)


play.Project.playScalaSettings
