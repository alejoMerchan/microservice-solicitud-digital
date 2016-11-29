package com.sura.solicituddigital.app


import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.io.IO
import akka.stream.ActorMaterializer
import com.typesafe.config.{ConfigFactory, Config}

/**
 * Created by abelmeos on 2016/11/29.
 */
object Boot extends App with Core with Api{

  Http().bindAndHandle(routes,"",8080)

}
