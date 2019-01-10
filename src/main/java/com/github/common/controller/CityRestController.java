package com.github.common.controller;

import com.github.common.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.common.service.CityService;

/**
 * Created by bysocket on 07/02/2017.
 */
//@RestController
//    先使用springMvc，暂不使用restful
@Controller
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {

        City cityByName = cityService.findCityByName(cityName);
        return cityByName;
    }

}
