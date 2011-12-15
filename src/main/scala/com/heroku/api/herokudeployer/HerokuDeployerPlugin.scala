package com.heroku.api.herokudeployer

import sbt._
import Keys._

import com.heroku.herokudeployer.HerokuDeployer

object HerokuDeployerPlugin extends Plugin {

  override lazy val settings = Seq(commands += herokuDeployCommand)

  lazy val herokuDeployCommand =
    Command.command("heroku-deploy") { (state: State) =>

      val args: Array[String] = Array(System.getProperty("user.dir"))

      HerokuDeployer.main(args);

      state
  }

}
