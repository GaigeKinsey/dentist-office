package edu.neumont.cox.dentistoffice.view;

import lib.ConsoleIO;

public class UserInteraction implements UserInteractionInterface{

	public String adminPasswordChange() {
		return ConsoleIO.promptForInput("Admin must change their password on first login.\nWhat do you want your new password to be?", false);
	}
}
