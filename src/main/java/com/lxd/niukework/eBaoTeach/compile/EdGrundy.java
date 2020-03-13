package com.lxd.niukework.eBaoTeach.compile;


class Box{
    private int iVolume;
    Box(int iVolume){
        this.iVolume = iVolume;
    }


    public void finalize(){
        System.out.println("finalizing a Box");
    }
}

public class EdGrundy {
    boolean stop = false;
    public static void main(String[] args){
        new EdGrundy();//Comlilation but no output at runtime
    }
    EdGrundy(){
        while(stop=false){
            new Box(99);
        }
    }
}
