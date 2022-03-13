package com.lxd.niukework.HashMapKeyObject;

public class People{
    private String name;
    private int age;

    public People(){
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj)return true;
        if(obj == null||getClass()!=obj.getClass()){
            return false;
        }
        People p = (People)obj;
        if(name!=null?!name.equals(p.name):p.name!=null){
            return false;
        }
        if (age!=0?age!=(p.age):p.age!=0){
            return false;
        }
        return true;
    }

    public int hashCode() {
        return name!=null&&age!=0?name.hashCode()+
                ((Integer)age).hashCode():0;
    }
}
