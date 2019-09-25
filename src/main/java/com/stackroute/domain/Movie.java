package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Movie {
    private Actor actor;
    @Autowired
    @Qualifier("actor3")
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display(){
        System.out.println(this.actor.getName()+","+this.actor.getGender()+","+this.actor.getAge());
    }
}
