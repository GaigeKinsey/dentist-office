package edu.neumont.cox.dentistoffice.view;

import java.io.Console;
import java.time.LocalDate;

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
		return ConsoleIO.promptForMenuSelection(new String[] {"Search", "Schedule an Appointment", "Add Someone", "Remove Someone", "Run a Report", "Save"}, true);
	}

	@Override
	public String getUsername() {
		return ConsoleIO.promptForInput("Please enter in a username.", false);
	}

	@Override
	public String getPassword() {
		return ConsoleIO.promptForInput("Please enter in a password.", false);
	}

	@Override
	public void invalidUser() {
		ConsoleIO.displayMessage("Invalid username or password.");
	}

	@Override
	public int addSomeoneSubMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] {"Add User", "Add Patient", "Add Provider", "Exit to main menu"}, false);
	}

	@Override
	public int removeSomeoneSubMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] {"Remove User", "Remove Patient", "Add Provider", "Exit to main menu"}, false);
	}

	@Override
	public int userRoleChoice() {
		return ConsoleIO.promptForMenuSelection(new String[] {"Administrative", "Standard User", "Exit to main menu"}, false);
	}

	@Override
	public String getFirstName() {
		return ConsoleIO.promptForInput("Please enter their first name.", false);
	}

	@Override
	public String getLastName() {
		return ConsoleIO.promptForInput("Please enter their last name.", false);
	}

	@Override
	public int reportsMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] {"Production Reports", "Patient Balance Reports", "Collections Reports", "Exit to main menu"}, false);
	}

	@Override
	public int getUniqueId() {
		return ConsoleIO.promptForInt("Please enter their Unique ID.", 0, Integer.MAX_VALUE);
	}

	@Override
	public String getEmail() {
		return ConsoleIO.promptForInput("Please enter their email.", false);
	}

	@Override
	public String getCompanyName() {
		return ConsoleIO.promptForInput("Please enter their company name.", false);
	}

	@Override
	public String getGroupId() {
		return ConsoleIO.promptForInput("Please enter the group ID.", false);
	}

	@Override
	public String getMemberId() {
		return ConsoleIO.promptForInput("Please enter the member ID.", false);
	}

	@Override
	public void insuranceProviderPrompt() {
		ConsoleIO.displayMessage("Please provide their Insurance Information");		
	}

	@Override
	public void paymentCardPrompt() {
		ConsoleIO.displayMessage("Please provide their Card Payment Information");		
	}

	@Override
	public long getCardNumber() {
		return ConsoleIO.promptForLong("Please enter the Card Number.", 0, Long.MAX_VALUE);
	}

	@Override
	public LocalDate getExpireDate() {
		// TODO 
		//Dont understand localdate with only month and year
		return null;
	}

	@Override
	public String getHolderName() {
		return ConsoleIO.promptForInput("Please enter the Cardholder Name.", false);
	}

	@Override
	public int getCVV() {
		return ConsoleIO.promptForInt("Please enter the CVV number.", 0, Integer.MAX_VALUE);
	}

	@Override
	public int getZipCode() {
		return ConsoleIO.promptForInt("Please enter the zip code.", 0, Integer.MAX_VALUE);
	}

	@Override
	public int getProviderType() {
		return ConsoleIO.promptForMenuSelection(new String[] {"Assistant", "Dentist", "Hygenist", "Exit to main menu"}, false);
	}
}
