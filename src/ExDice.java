package jp.ac.uryukyu.ie.ex3.pair09;
public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

    public ExDice(int minValue,int maxValue){
	this.minValue=minValue;
	this.maxValue=maxValue;
	play();
    }

    @Override
    public void play(){
	int tmp=maxValue-minValue+1;
	setValue((int)(Math.random()*tmp)+minValue);
    }

}
