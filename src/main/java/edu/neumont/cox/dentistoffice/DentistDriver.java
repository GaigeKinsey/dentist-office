package edu.neumont.cox.dentistoffice;

import edu.neumont.cox.dentistoffice.controller.DentistController;
import edu.neumont.cox.dentistoffice.view.UserInteraction;

public class DentistDriver {
	public static void main(String[] args) {
		DentistController controller = new DentistController(new UserInteraction());
		controller.run();
	}
}
