package edu.neumont.cox.dentistoffice.view;

import lib.ConsoleIO;

public class UserInteraction implements UserInteractionInterface{

	public String adminPasswordChange() {
		return ConsoleIO.promptForInput("Admin must change their password on first login.\nWhat do you want your new password to be?", false);
	}

	@Override
	public void noPermission() {
		ConsoleIO.displayMessage("This requires Administrative privileges.");
	}

	@Override
	public boolean checkPassword(String password) {
		return password.equals(ConsoleIO.promptForInput("Please re-enter your password.", false));
	}

	@Override
	public void passwordMismatch() {
		ConsoleIO.displayMessage("Password doesn't match, please re-enter.");
	}

	@Override
	public void dentistOfficeGreeting() {
		ConsoleIO.displayMessage("Welcome to our Dentist Office!");
	}

	@Override
	public int dentistOfficeMenu() {
		
		return 0;
	}
}
