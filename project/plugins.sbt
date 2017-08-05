addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0-M1")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")
addSbtPlugin("org.foundweekends.conscript" % "sbt-conscript" % "0.5.2")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.27")
addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.2.3")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")
addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.2.1")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")
addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.6.0")

// https://github.com/thesamet/sbt-protoc/issues/32
// addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.12-rc5")
libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.1"
