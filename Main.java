import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		/*
		Sound board Keyboard 
			On and off switch 
			Keys play sounds 
			Different sounds - Switch or something for change in keyboard sounds 
			Effects for key pressing 
			File writing to save a history - Print history at end 
			Example play through 
		*/
		int x = 1024;														//initializes the screen and the background color.  
		int y = 786;
		EZ.initialize(x, y);
		EZ.setBackgroundColor(new Color(255,230,230));
		
		//EZ Sounds
		
		EZSound keyboard1 = EZ.addSound("keynumber1.wav");
		EZSound keyboard2 = EZ.addSound("keynumber2.wav");
		EZSound keyboard3 = EZ.addSound("keynumber3.wav");
		EZSound keyboard4 = EZ.addSound("keynumber4.wav");
		EZSound keyboard5 = EZ.addSound("keynumber5.wav");
		EZSound keyboard6 = EZ.addSound("keynumber6.wav");
		EZSound keyboard7 = EZ.addSound("keynumber7.wav");
		
		Keyboard keyboard = new Keyboard();	
		PowerButton powerButton = new PowerButton();
		
		boolean gamePlay = true;
		int showOnOff = -1; 
		int keyNumber; //Keys left to right, 1 - 7
		
		while(gamePlay == true) { 
			showOnOff = powerButton.checkButtonStatus(showOnOff);
			if (showOnOff == 1) {
				keyNumber = keyboard.keys();
				if(keyNumber == 1) { 
					//play sound
					keyboard1.play();
				}
				if(keyNumber == 2) { 
					//play sound
					keyboard2.play();
				}
				if(keyNumber == 3) { 
					//play sound
					keyboard3.play();
				}
				if(keyNumber == 4) { 
					//play sound
					keyboard4.play();
				}
				if(keyNumber == 5) { 
					//play sound
					keyboard5.play();
				}
				if(keyNumber == 6) { 
					//play sound
					keyboard6.play();
				}
				if(keyNumber == 7) { 
					//play sound
					keyboard7.play();
				}
			}
			
			EZ.refreshScreen();
		
		
		
		}
	}

}
