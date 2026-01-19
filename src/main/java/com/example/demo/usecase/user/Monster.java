package com.example.demo.usecase.user;

public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "モンスター名"+this.name;
    }

    @Override
    public boolean equals(Object o) {
        if(o==this) return true;
        if(o==null) return false;
        if(!(o instanceof Monster)) return false;
        Monster argMonster = (Monster)o;
        return this.name.equals(argMonster.name);
    }
}
