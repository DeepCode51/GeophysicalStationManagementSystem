package com.earth.station.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.earth.station.common.constant.SubjectConstant;
import com.earth.station.model.Subject;
import com.earth.station.service.StationService;
import com.earth.station.service.SubjectService;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description SubjectController
 * @Author yeyu
 * @Date 2020/5/23
 */
@Controller
@RequestMapping("/subject")
public class SubjectController extends BaseController{
    private static final Logger LOG = Logger.getLogger(SubjectController.class);

    @Resource
    private SubjectService subjectService;
    @Resource
    private StationService stationService;


    @RequestMapping("/addPage")
    public ModelAndView addPage(Integer stationId, Integer type) {
        ModelAndView mav = new ModelAndView("subject/add");
        mav.addObject("stationId", stationId);
        mav.addObject("type", type);
        return mav;
    }


    @ResponseBody
    @RequestMapping("/add")
    public Object add(Subject subject) {
        try {
            subjectService.save(subject);
            return success(null);
        }catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return fail("添加失败!");
    }

    @RequestMapping("/list")
    public ModelAndView list(Integer id) {
        ModelAndView mav = new ModelAndView("subject/list");
        Subject subject = subjectService.getById(id);
        mav.addObject("subject", subject);
        mav.addObject("station", stationService.getById(subject.getStationId()));
        return mav;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public Object delete(Integer id) {
        try {
            subjectService.deleteById(id);
            return success(null);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return fail("删除失败!");
    }

    @RequestMapping("/updatePage")
    public ModelAndView updatePage(Integer id) {
        ModelAndView mav = new ModelAndView("subject/update");
        mav.addObject("subject", subjectService.getById(id));
        return mav;
    }

    @ResponseBody
    @RequestMapping("/update")
    public Object update(Subject subject) {
        try {
            subjectService.update(subject);
            return success(null);
        }catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return fail("更新失败!");
    }


    @ResponseBody
    @RequestMapping("/findAll")
    public Object findAll(){
        JSONArray arr = new JSONArray();
        SubjectConstant.SUBJECT_MAPPING.forEach((k, v) -> {
            arr.add(new String[]{k.toString(), v});
        });
        return arr;
    }
}