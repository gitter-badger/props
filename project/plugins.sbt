resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.13")

//addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.0")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")
