package com.robertp.projectOne;

class CappuccinoMaker extends CoffeeMaker {
    
    public CappuccinoMaker(int maxVolumeOz) {
        super(maxVolumeOz);
        this.milk = "whole";
    }
    
    public CappuccinoMaker makeCappuccino(String beans) {
        super.brew(beans);
        System.out.println("Smooth.");
        return this;
    }
    
    public void brew(String beans) {
    	super.brew(beans);
            System.out.println("Frothy!!!");
        }
                      
        public void clean(){
            System.out.println("Cleaning the froth!");
        }
}
