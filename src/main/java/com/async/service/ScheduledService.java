package com.async.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author 郑超
 * @create 2021/5/15
 */
@Service
public class ScheduledService {

    // ? 代表任意，只能用在日期和星期上; * 随意
    // 秒 分 时 日 月 周几
    @Scheduled(cron = "0 * * * * 0-7")
    public void hello() {
        System.out.println("我被执行了！");
    }

}
