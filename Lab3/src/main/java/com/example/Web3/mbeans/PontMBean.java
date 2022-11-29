package com.example.Web3.mbeans;

import com.example.Web3.entity.Result;

public interface PontMBean {

    void addPoint(Result result);
    long getCountOfPoints();
    long getCountOfMissPoints();
}
