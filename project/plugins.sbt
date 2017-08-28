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
addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.4.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.17")
addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "0.1.10")
addSbtPlugin("org.scala-sbt" % "sbt-contraband" % "0.3.0")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.1")
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.10")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.0")
addSbtPlugin("com.github.cuzfrog" % "sbt-tmpfs" % "0.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.2-RC2")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.1")
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "4.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.9.0")
addSbtPlugin("de.heikoseeberger" % "sbt-fresh" % "3.1.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")
addSbtPlugin("org.duhemm" % "sbt-errors-summary" % "0.6.0")
addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.6.2")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "3.0.1")
addSbtPlugin("de.heikoseeberger" % "sbt-groll" % "6.0.0")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "2.0.0")
addSbtPlugin("io.spray" % "sbt-boilerplate" % "0.6.1")
addSbtPlugin("com.lightbend.sbt" % "sbt-aspectj" % "0.11.0")
addSbtPlugin("ch.jodersky" % "sbt-jni" % "1.3.0-M1")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "2.0.0")
addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.1.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sql" % "0.7")
addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.0")
addSbtPlugin("org.xerial.sbt" % "sbt-jcheckstyle" % "0.2.0")
addSbtPlugin("com.markatta" % "sbt-taglist" % "1.4.0")
addSbtPlugin("io.gatling" % "gatling-sbt" % "2.2.2")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.12-rc6")
libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.2"
