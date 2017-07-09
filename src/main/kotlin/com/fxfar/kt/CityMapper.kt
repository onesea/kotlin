package com.fxfar.kt

import org.mybatis.spring.SqlSessionTemplate
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired

@Component
class CityMapper {

  @Autowired
  private val sqlSessionTemplate: SqlSessionTemplate? = null

  fun selectCityById(id: Long): City {
    return this.sqlSessionTemplate!!.selectOne<City>("selectCityById", id)
  }

  fun selectCityByName(name: String): City? {
    return this.sqlSessionTemplate!!.selectOne<City>("selectCityByName", name)
  }
}
