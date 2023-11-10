package com.robertp.projectOne;

public class CoffeeMaker {
    protected int maxVolumeOz;
    protected String milk;
    
    public CoffeeMaker(int maxVolumeOz) {
        this.maxVolumeOz = maxVolumeOz;
    }
                
    public int getMaxVolumeOz() {
        return this.maxVolumeOz;
    }
    
    public int getMaxServings() {
        return this.maxVolumeOz / 8;
    }
    
    public void brew(String beans) {
    	String msg = String.format("Brewing coffee with these type of beans: %s",beans);
    	System.out.println(msg);
    }
}