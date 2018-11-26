import java.awt.event.KeyEvent;

public class PowerButton {
	int x;
	int y;
	EZImage redButton;
	EZImage greenButton;

	PowerButton() {
		x = 1024; // X Cord
		y = 786; // Y Cord
		redButton = EZ.addImage("RedButton.png", 1750, 200);
		redButton.scaleBy(.8);
		greenButton = EZ.addImage("GreenButton.png", 1750, 200);
		greenButton.scaleBy(.8);
		greenButton.hide();

		// color value -1 is Red Button
		// color value 1 is Green Button

	}

	int checkButtonStatus(int show) {
		
		
		// Shows the correct On/Off button color 
		// if show = 1, the Red Button is shown
		// if show = -1, the Green Button is shown

		if (EZInteraction.wasMouseLeftButtonReleased() == true) {
			int mouseX = EZInteraction.getXMouse();
			int mouseY = EZInteraction.getYMouse();
		//	System.out.println(mouseX);
		//	System.out.println(mouseY);
			if (mouseX > 833 && mouseX < 934 && mouseY > 42 && mouseY < 143) {
				if (show == 1) {
					redButton.show();
					greenButton.hide();
				}
				if (show == -1) {
					redButton.hide();
					greenButton.show();
				}
				show = -show;

			}
		}

		return show;
	}
}
