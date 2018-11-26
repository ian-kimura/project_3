import java.awt.event.KeyEvent;

public class Keyboard {
	int x;
	int y;
	EZImage picture;

	Keyboard() {
		x = 1024; // X Cord
		y = 786; // Y Cord
		picture = EZ.addImage("keyboard.png", x, y);
		picture.scaleBy(1.5);
		System.out.println(2 * picture.getXCenter() + " " + 2 * picture.getYCenter());

	}

	int keys() {		//Checks which keys are being pressed
		int mouseX = EZInteraction.getXMouse();
		int mouseY = EZInteraction.getYMouse();
		if (EZInteraction.wasMouseLeftButtonReleased() == true) {
		//	System.out.println(mouseX);
		//	System.out.println(mouseY);

			if (mouseX > 151 && mouseX <= 256 && mouseY > 203 && mouseY < 578) {
				System.out.println("First Key");
				return 1; 
			} 
			else if (mouseX > 256 && mouseX <= 361 && mouseY > 203 && mouseY < 578) {
				System.out.println("Second Key");
				return 2;
			}
			else if (mouseX > 361 && mouseX <= 460 && mouseY > 203 && mouseY < 578) {
				System.out.println("Third Key");
				return 3;
			} 
			else if (mouseX > 460 && mouseX <= 572 && mouseY > 203 && mouseY < 578) {
				System.out.println("Fourth Key");
				return 4; 
			}
			else if (mouseX > 572 && mouseX <= 676 && mouseY > 203 && mouseY < 578) {
				System.out.println("Fifth Key");
				return 5; 
			}
			else if (mouseX > 676 && mouseX <= 782 && mouseY > 203 && mouseY < 578) {
				System.out.println("Sixth Key");
				return 6;
			} 
			else if (mouseX > 782 && mouseX <= 883 && mouseY > 203 && mouseY < 578) {
				System.out.println("Seventh Key");
				return 7; 
			}
			}
		return 0; 

		}

	}


