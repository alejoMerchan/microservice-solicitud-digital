package com.sura.solicituddigital.app

import com.sura.solicituddigital.service.SolicitudDigitalService

/**
 * Created by abelmeos on 2016/11/29.
 */
trait Api {

   val routes = new SolicitudDigitalService().route


}
