libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
