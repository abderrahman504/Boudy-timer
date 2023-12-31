package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App 
{
	static LocalDateTime start;
	public static String mode = "";
	public App()
	{
		//Set up the app window
		JFrame frm = new JFrame("Boudie's timer");
		frm.setSize(270, 200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setStartTime();
		frm.add(new Screen(frm));
		frm.setVisible(true);
		//Set the start time to app launch time
		
	}

    public static void main(String[] args) 
	{
		//Start the App
		SwingUtilities.invokeLater(new AppThread());
    }

	public static void setStartTime() {start = LocalDateTime.now();}

	public static LocalDateTime getStartTime() {return start;}
}



class AppThread implements Runnable
{
	//Create the App window
	public void run(){new App();}
}

