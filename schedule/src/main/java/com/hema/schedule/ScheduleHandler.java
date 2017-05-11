package com.hema.schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.FutureTask;

/**
 * Created by dcx on 17/5/11.
 */
public class ScheduleHandler {

    private int currentIndex = 1;
    private static final int slots = 3600;
    private List<Set<Task>> tasks = new ArrayList<Set<Task>>(slots);

    /**
     * 添加定时任务到环形队列
     * @param afterSeconds 经过多少秒之后触发
     * @param t 执行的任务
     * @return
     */
    public void add(long afterSeconds, FutureTask t){
        int cycleNum = (int)afterSeconds / slots;
        int  slot = currentIndex + (int)(afterSeconds % slots);
        if (slot > slots){
            slot = slot - slots;
        }
        Task task = new Task(cycleNum,t);
        tasks.get(slot).add(task);
    }

    /**
     * 添加定时任务到环形队列
     * @param date 任务执行的日期
     * @param task 执行的任务
     * @return
     */
    public boolean add(Date date, FutureTask task){


        return true;
    }

    // 从环形队列中移除一个定时任务

    public static void main(String[] args){


    }
}
