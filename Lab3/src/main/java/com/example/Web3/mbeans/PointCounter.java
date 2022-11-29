package com.example.Web3.mbeans;

import com.example.Web3.entity.Result;

public class PointCounter implements PontMBean {
    private long countOfPoints;
    private long countOfMissPoints;

    @Override
    public void addPoint(Result result) {
        countOfPoints++;
        if (!result.isResult()) countOfMissPoints++;
    }

    @Override
    public long getCountOfPoints() {
        return countOfPoints;
    }

    @Override
    public long getCountOfMissPoints() {
        return countOfMissPoints;
    }
}
