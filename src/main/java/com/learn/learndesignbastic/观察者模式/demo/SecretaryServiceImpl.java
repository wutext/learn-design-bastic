package com.learn.learndesignbastic.观察者模式.demo;

import com.learn.learndesignbastic.观察者模式.example.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * com.learn.learndesignbastic.观察者模式.demo
 *
 * @Author wujiyao
 * @create 2021 2021/7/15 10:59
 */
public class Secretary {

    private List<Observer> stockServers = new ArrayList<>();
    private String action;

    public Secretary() {
    }

    public Secretary(String action) {
        this.action = action;
    }

    public void addStock(Observer stockServer) {
        stockServers.add(stockServer);
    }

    public void sendMsg() {
        for (Observer stockServer : stockServers) {
            stockServer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
