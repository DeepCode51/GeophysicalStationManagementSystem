package com.earth.station.controller;

import com.earth.station.model.Station;
import com.earth.station.service.StationService;
import java.util.List;
import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description StationController
 * @Author yeyu
 * @Date 2020/5/23
 */
@Controller
@RequestMapping("/station")
public class StationController extends BaseController{
    private static final Logger LOG = Logger.getLogger(StationController.class);

    @Resource
    private StationService stationService;

    /**
     * 查询 所有站点
     * @param name 名称 模糊查询
     * @param subject  存在该学科的站点
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView list(String name, Integer subject) {
        List<Station> list = stationService.search(name, subject);
        ModelAndView mav = new ModelAndView("station/list");
        mav.addObject("list", list);
        mav.addObject("name", name);
        mav.addObject("subject", subject);
        return mav;
    }

    /**
     * 站台添加页面
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "station/add";
    }

    /**
     * 添加站台
     * @param station
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Object add(Station station) {
        try {
            stationService.save(station);
            return success(null);
        }catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return fail("系统错误!");
    }

    /**
     * 更新页面
     * @param id 要更新的记录ID
     * @return
     */
    @RequestMapping("/updatePage")
    public ModelAndView updatePage(Integer id) {
        ModelAndView mav = new ModelAndView("station/update");
        mav.addObject("entity", stationService.getById(id));
        return mav;
    }

    /**
     * 更新站台
     * @param station
     * @return
     */
    @ResponseBody
    @RequestMapping("/update")
    public Object update(Station station) {
        try {
            stationService.update(station);
            return success(null);
        }catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return fail("更新失败!");
    }


    /**
     * 删除站台
     * @param id 站台ID
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public Object delete(Integer id) {
        try {
            stationService.delete(id);
            return success(null);
        }catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return fail("更新失败!");
    }
}