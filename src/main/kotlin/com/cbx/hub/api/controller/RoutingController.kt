package com.cbx.hub.api.controller

import com.cbx.hub.routing.service.RoutingService
import org.springframework.beans.factory.annotation.Autowired

class RoutingController {
    @Autowired
    lateinit var routingService: RoutingService
}
