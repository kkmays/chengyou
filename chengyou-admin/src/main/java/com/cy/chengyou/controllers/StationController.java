package com.cy.chengyou.controllers;

import com.cy.chengyou.datas.StationData;
import com.cy.chengyou.pojos.StationPojo;
import com.cy.chengyou.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/station")
public class StationController {
    @Autowired
    private StationService stationService;

    /**
     * 通过id查询火车站点信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById/{id}")
    public StationData findById(@PathVariable String id) {
        return stationService.findById(id);
    }

    /**
     * 查询站点
     * @param stationPojo
     * @return
     */
    @RequestMapping(value = "/findStation")
    public List<StationData> findStation(StationPojo stationPojo) {
        return stationService.findStation(stationPojo);
    }
}
