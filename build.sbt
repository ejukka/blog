val name = "blog"
val version = "1.0-SNAPSHOT"

val appDependencies = Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "bootstrap" % "3.0.3",
  "com.tzavellas" % "sse-guice" % "0.7.1",
  "com.google.inject" % "guice" % "3.0",
  "se.radley" %% "play-plugins-salat" % "1.5.0"
)

val main = play.Project(name, version, appDependencies).settings(
  routesImport += "se.radley.plugin.salat.Binders._",
  templatesImport += "org.bson.types.ObjectId",
  resolvers += Resolver.sonatypeRepo("snapshots")
)

play.Project.playScalaSettings
