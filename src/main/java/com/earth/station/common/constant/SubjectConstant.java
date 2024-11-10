package com.earth.station.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description SubjectConstant
 * @Author yeyu
 * @Date 2020/5/23
 */
public interface SubjectConstant {
    /**
     * 测震
     */
    Integer TEST_EQ = 1;

    /**
     * 强震
     */
    Integer STRONG_EQ = 2;

    /**
     * 地磁
     */
    Integer TM = 3;

    /**
     * 流体
     */
    Integer LIQUID = 4;

    /**
     * GNSS
     */
    Integer GNSS = 5;

    /**
     * 重力
     */
    Integer GRAVITY = 6;

    /**
     * 形变
     */
    Integer DEFORMATION = 7;

    /**
     * 辅助
     */
    Integer AID = 8;

    Map<Integer, String> SUBJECT_MAPPING = new HashMap<Integer, String>(){
        {
            put(0, "所有");
            put(TEST_EQ, "测震");
            put(STRONG_EQ, "强震");
            put(TM, "地磁");
            put(LIQUID, "流体");
            put(GNSS, "GNSS");
            put(AID, "辅助");
            put(DEFORMATION, "形变");
            put(GRAVITY, "重力");
        }
    };
}