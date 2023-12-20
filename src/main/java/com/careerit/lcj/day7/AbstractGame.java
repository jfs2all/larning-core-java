package com.careerit.lcj.day7;

public abstract class AbstractGame implements Game {

    @Override
    public void start() {
        System.out.println("The game : "+this.getClass().getSimpleName()+" is started");
    }

    @Override
    public void stop() {
        System.out.println("The game : "+this.getClass().getSimpleName()+" is stopped");
    }

}
