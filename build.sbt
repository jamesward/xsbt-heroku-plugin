organization := "com.heroku"

name := "xsbt-heroku-plugin"

sbtPlugin := true

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

// Check to see if the user set $M2_HOME to the location of their local Maven repository
val localMvnRepo = Option(System.getenv("M2_HOME")) orElse 
                   Option("file://" + System.getProperty("user.home") + "/.m2/repository") 
				   get
resolvers ++= Seq("Local Maven Repository" at localMvnRepo)

libraryDependencies ++= Seq(
  "com.heroku.api" % "heroku-api" % "0.1-SNAPSHOT",
  "com.heroku.api" % "heroku-http-finagle" % "0.1-SNAPSHOT",
  "com.heroku.api" % "heroku-json-jackson" % "0.1-SNAPSHOT",
  "com.heroku" % "herokudeployer" % "0.1-SNAPSHOT",
  "org.eclipse.jgit" % "org.eclipse.jgit" % "1.1.0.201109151100-r",
  "commons-io" % "commons-io" % "2.1"
)
