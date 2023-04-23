package com.training.springboot.model;

public class Visitor {
    private Integer count;

    public Visitor(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public Visitor setCount(Integer count) {
        this.count = count;
        return this;
    }
}
