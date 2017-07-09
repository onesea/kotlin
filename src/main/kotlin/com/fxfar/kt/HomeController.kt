package com.fxfar.kt

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

@Controller
@RequestMapping(value = "/")
class HomeController {
  @Autowired
  private val cityMapper: CityMapper? = null

  @RequestMapping(value = "")
  internal fun index() : String {
    println(this.cityMapper!!.selectCityByName("shenzhen"))
    return "index"
  }
}
