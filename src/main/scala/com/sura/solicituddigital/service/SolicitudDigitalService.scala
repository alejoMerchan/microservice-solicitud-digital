package com.sura.solicituddigital.service


import akka.http.scaladsl.model.{ContentTypes}
import akka.http.scaladsl.model.HttpEntity
import akka.http.scaladsl.server.{Route, Directives}


/**
 * Created by abelmeos on 2016/11/29.
 */
class SolicitudDigitalService extends Directives{

  val route:Route  =
    path("soldigital"){
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`,
          "<h1>Say hello to akka-http</h1>"))
      }
    }

}
