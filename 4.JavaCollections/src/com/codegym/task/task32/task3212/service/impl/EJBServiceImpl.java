package com.codegym.task.task32.task3212.service.impl;

import com.codegym.task.task32.task3212.service.Service;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }

}
