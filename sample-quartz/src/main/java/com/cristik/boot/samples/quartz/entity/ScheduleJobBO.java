package com.cristik.boot.samples.quartz.entity;


/**
 * Created by GMY on 2016/11/21.
 */
public class ScheduleJobBO extends ScheduleJob {

    public static final String JOB_PARAM_KEY = "jobParam";

    private Integer cronId;

    public Integer getCronId() {
        return cronId;
    }

    public void setCronId(Integer cronId) {
        this.cronId = cronId;
    }

    public static String getJobParamKey() {
        return JOB_PARAM_KEY;
    }



}
