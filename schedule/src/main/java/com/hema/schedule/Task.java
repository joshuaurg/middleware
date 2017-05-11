package com.hema.schedule;

import java.util.concurrent.FutureTask;

/**
 * Created by dcx on 17/5/11.
 */
public class Task {

    private Integer    cycleNumber; // 遍历环形队列的圈数

    private FutureTask futureTask;  // 异步线程执行句柄


    public Task(Integer cycleNumber, FutureTask futureTask) {
        this.cycleNumber = cycleNumber;
        this.futureTask = futureTask;
    }

    public Integer getCycleNumber() {
        return cycleNumber;
    }

    public void setCycleNumber(Integer cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    public FutureTask getFutureTask() {
        return futureTask;
    }

    public void setFutureTask(FutureTask futureTask) {
        this.futureTask = futureTask;
    }
}
