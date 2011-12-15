organization := "com.heroku"

name := "xsbt-heroku-plugin"

sbtPlugin := true

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers ++= Seq("Local Maven Repository" at "file://" + System.getProperty("user.home") + "/.m2/repository")

libraryDependencies ++= Seq(
  "com.heroku.api" % "heroku-api" % "0.1-SNAPSHOT",
  "com.heroku.api" % "heroku-http-finagle" % "0.1-SNAPSHOT",
  "com.heroku.api" % "heroku-json-jackson" % "0.1-SNAPSHOT",
  "com.heroku" % "herokudeployer" % "0.1-SNAPSHOT",
  "org.eclipse.jgit" % "org.eclipse.jgit" % "1.1.0.201109151100-r",
  "commons-io" % "commons-io" % "2.1"
)
