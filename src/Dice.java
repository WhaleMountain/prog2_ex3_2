package jp.ac.uryukyu.ie.ex3.pair09;
public class Dice{
    private int value;
    
    public Dice(){
	play();
    }

    public int getValue(){
	return this.value;
    }

    public void setValue(int value){
	this.value=value;
    }

    public void play(){
	this.value=(int)(Math.random()*6)+1;
    }
}