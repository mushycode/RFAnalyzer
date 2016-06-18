package com.mantz_it.rfanalyzer;

import java.util.*;

public class WindowSlider extends TimerTask{

	//public int windowLength = 1; //Mhz
	//public int startFrequency = 1; //Mhz
	//public int endFrequency = 4; //Mhz
	//public int windowStartFrequency = startFrequency;
	//public int windowEndFrequency = windowStartFrequency + windowLength;
	//public int interval = 100; //Milliseconds
    private MainActivity activity;

    WindowSlider(MainActivity activity){
        this.activity = activity;
    }
/**
	public static void main(String[] a){
		WindowSlider newTask = new WindowSlider();
		Timer timer = new Timer();
		timer.schedule(newTask, 10, 30*newTask.interval);
	}**/

	public void run(){
		//System.out.println("Ran for startFrequency of "+this.surface.getVirtualFrequency());
		//System.out.println("Ran for endFrequency of "+this.windowEndFrequency);
		this.updateWindow();
	}
	public void updateWindow(){
		this.activity.changeFrequency(this.activity.analyzerSurface.getVirtualFrequency()+
				100,true,this.activity.analyzerSurface.getVirtualSampleRate());
		//this.windowEndFrequency += this.windowLength;
		if(this.activity.analyzerSurface.getVirtualFrequency() > 60000) System.exit(0);
	}
}

