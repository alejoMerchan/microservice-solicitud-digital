package com.sura.solicituddigital.app

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.typesafe.config.{ConfigFactory, Config}

/**
 * Created by abelmeos on 2016/11/29.
 */
trait Core {

  implicit lazy val system = ActorSystem("system-core-solicituddigital")
  implicit lazy val materializer = ActorMaterializer()
  implicit lazy val executionContext = system.dispatcher
  implicit lazy val conf:Config = ConfigFactory.load()

}

trait CoreActors{

  this:Core =>


}
