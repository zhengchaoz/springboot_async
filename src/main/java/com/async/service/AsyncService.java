package com.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author 郑超
 * @create 2021/5/15
 */
@Service
public class AsyncService {

    @Async// 告诉springboot这个方法需要异步执行
    public void hello() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
