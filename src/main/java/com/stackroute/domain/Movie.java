package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor;

    public void setActor(Actor act) {
        this.actor = act;
    }
    public void printActor() {
        System.out.println(actor.getName());
        System.out.println(actor.getGender());
        System.out.println(actor.getAge());
    }
}
