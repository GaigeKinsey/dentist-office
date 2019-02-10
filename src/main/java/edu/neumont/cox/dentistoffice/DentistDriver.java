package edu.neumont.cox.dentistoffice;

import edu.neumont.cox.dentistoffice.controller.DentistController;
import edu.neumont.cox.dentistoffice.view.UserInteraction;

/**
 * @author Chris and Gaige
 *
 */
public class DentistDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DentistController controller = new DentistController(new UserInteraction());
		controller.run();
	}
}
