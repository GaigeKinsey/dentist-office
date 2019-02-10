package edu.neumont.cox.dentistoffice.view;

import java.util.List;

import edu.neumont.cox.dentistoffice.model.Appointment;
import edu.neumont.cox.dentistoffice.model.Patient;
import edu.neumont.cox.dentistoffice.model.Provider;
import edu.neumont.cox.dentistoffice.model.User;
import lib.ConsoleIO;

/**
 * @author Gaige & Chris
 *
 */
public class UserInteraction implements UserInteractionInterface {

	/**
	 * 
	 */
	@Override
	public String adminPasswordChange() {
		return ConsoleIO.promptForInput(
				"Administrator must change their password on first login.\nWhat do you want your new password to be?",
				false);
	}

	/**
	 *  
	 */
	@Override
	public void noPermission() {
		ConsoleIO.displayMessage("This requires Administrative privileges.");
	}

	/**
	 * 
	 */
	@Override
	public boolean checkPassword(String password) {
		return password.equals(ConsoleIO.promptForInput("Please re-enter your password.", false));
	}

	@Override
	public void passwordMismatch() {
		ConsoleIO.displayMessage("Password doesn't match, please re-enter.");
	}

	/**
	 * 
	 */
	@Override
	public void dentistOfficeGreeting() {
		ConsoleIO.displayMessage("Welcome to our Dentist Office!");
	}

	/**
	 * 
	 */
	@Override
	public int dentistOfficeMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] { "Search", "Schedule an Appointment", "Add Someone",
				"Remove Someone", "Run a Report", "User Settings", "Save" }, true);
	}

	/**
	 * 
	 */
	@Override
	public String getPassword() {
		return ConsoleIO.promptForInput("Please enter in a password.", false);
	}

	/**
	 * 
	 */
	@Override
	public String createPassword() {
		boolean valid = false;
		String password = "";
		do {
			password = ConsoleIO.promptForInput("Please enter in a password.", false);
			valid = checkPassword(password);
			if (!valid) {
				passwordMismatch();
			}
		} while (!valid);

		return password;
	}

	/**
	 * 
	 */
	@Override
	public void invalidUser() {
		ConsoleIO.displayMessage("Invalid username or password.");
	}

	/**
	 * 
	 */
	@Override
	public int searchSubMenu() {
		return ConsoleIO.promptForMenuSelection(
				new String[] { "Search Users", "Search Patients", "Search Providers", "Search Appointments" }, true);
	}

	/**
	 * 
	 */
	@Override
	public int addSomeoneSubMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] { "Add User", "Add Patient", "Add Provider" }, true);
	}

	/**
	 * 
	 */
	@Override
	public int removeSomeoneSubMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] { "Remove User", "Remove Patient", "Add Provider" }, true);
	}

	/**
	 * 
	 */
	@Override
	public int userRoleChoice() {
		return ConsoleIO.promptForMenuSelection(new String[] { "Administrative", "Standard User" }, true);
	}

	/**
	 * 
	 */
	@Override
	public String getFirstName() {
		return ConsoleIO.promptForInput("Please enter their first name.", false);
	}

	/**
	 * 
	 */
	@Override
	public String getLastName() {
		return ConsoleIO.promptForInput("Please enter their last name.", false);
	}

	/**
	 * 
	 */
	@Override
	public String getUsername() {
		return ConsoleIO.promptForInput("Please enter in a username.", false);
	}

	/**
	 * 
	 */
	@Override
	public String getSearchFirstName() {
		return ConsoleIO.promptForInput("Please enter their first name.", true);
	}

	/**
	 * 
	 */
	@Override
	public String getSearchLastName() {
		return ConsoleIO.promptForInput("Please enter their last name.", true);
	}

	/**
	 * 
	 */
	@Override
	public String getSearchUsername() {
		return ConsoleIO.promptForInput("Please enter in a username.", true);
	}

	/**
	 * 
	 */
	@Override
	public String getSearchCompanyName() {
		return ConsoleIO.promptForInput("Please enter the insurance company name", true);
	}

	/**
	 * 
	 */
	@Override
	public int reportsMenu() {
		return ConsoleIO.promptForMenuSelection(new String[] { "Production Reports", "Patient Balance Reports",
				"Collections Reports", "Exit to main menu" }, false);
	}

	/**
	 * 
	 */
	@Override
	public int getUniqueId() {
		return ConsoleIO.promptForInt("Please enter their Unique ID.", 0, Integer.MAX_VALUE);
	}

	/**
	 * 
	 */
	@Override
	public String getEmail() {
		return ConsoleIO.promptForInput("Please enter their email.", false);
	}

	/**
	 * 
	 */
	@Override
	public String getCompanyName() {
		return ConsoleIO.promptForInput("Please enter their company name.", false);
	}

	/**
	 * 
	 */
	@Override
	public String getGroupId() {
		return ConsoleIO.promptForInput("Please enter the group ID.", false);
	}

	/**
	 * 
	 */
	@Override
	public String getMemberId() {
		return ConsoleIO.promptForInput("Please enter the member ID.", false);
	}

	/**
	 * 
	 */
	@Override
	public void insuranceProviderPrompt() {
		ConsoleIO.displayMessage("Please provide their Insurance Information");
	}

	/**
	 * 
	 */
	@Override
	public void paymentCardPrompt() {
		ConsoleIO.displayMessage("Please provide their Card Payment Information");
	}

	/**
	 * 
	 */
	@Override
	public String getCardNumber() {
		return ConsoleIO.promptForInput("Please enter the Card Number. (16 digits)", false);
	}

	/**
	 * 
	 */
	@Override
	public String getHolderName() {
		return ConsoleIO.promptForInput("Please enter the Cardholder Name.", false);
	}

	/**
	 * 
	 */
	@Override
	public int getCVV() {
		return ConsoleIO.promptForInt("Please enter the CVV number.", 0, 999);
	}

	/**
	 * 
	 */
	@Override
	public int getZipCode() {
		return ConsoleIO.promptForInt("Please enter the zip code.", 0, 99999);
	}

	/**
	 * 
	 */
	@Override
	public int getProviderType() {
		return ConsoleIO.promptForMenuSelection(new String[] { "Assistant", "Dentist", "Hygenist" }, false);
	}

	/**
	 * 
	 */
	@Override
	public int getUserSearchSelection(List<User> matchedUsers) {
		String[] users = new String[matchedUsers.size()];
		for (int i = 0; i < users.length; i++) {
			users[i] = matchedUsers.get(i).toString();
		}
		return ConsoleIO.promptForMenuSelection(users, true);
	}

	/**
	 * 
	 */
	@Override
	public int getPatientSearchSelection(List<Patient> matchedPatients) {
		String[] patients = new String[matchedPatients.size()];
		for (int i = 0; i < patients.length; i++) {
			patients[i] = matchedPatients.get(i).toString();
		}
		return ConsoleIO.promptForMenuSelection(patients, true);
	}

	/**
	 * 
	 */
	@Override
	public int getProviderSearchSelection(List<Provider> matchedProviders) {
		String[] providers = new String[matchedProviders.size()];
		for (int i = 0; i < providers.length; i++) {
			providers[i] = matchedProviders.get(i).toString();
		}
		return ConsoleIO.promptForMenuSelection(providers, true);
	}

	@Override
	public int getAppointmentSearchSelection(List<Appointment> matchedAppointments) {
		String[] appointments = new String[matchedAppointments.size()];
		for (int i = 0; i < appointments.length; i++) {
			appointments[i] = matchedAppointments.get(i).toString();
		}
		return ConsoleIO.promptForMenuSelection(appointments, true);

	}

	/**
	 * 
	 */
	@Override
	public String getPhoneNumberString() {
		return ConsoleIO.promptForInput("Please enter their phone number (10 digits)", false);
	}

	/**
	 * 
	 */
	@Override
	public void invalidPhone() {
		ConsoleIO.displayMessage("Invalid phone number, please enter the 10 digits.");
	}

	/**
	 * 
	 */
	@Override
	public void invalidCard() {
		ConsoleIO.displayMessage("Invalid credit card number, please enter the 16 digits.");
	}

	/**
	 * 
	 */
	@Override
	public void invalidExpireDate() {
		ConsoleIO.displayMessage("Invalid expiration date, please enter the month/year.");
	}

	/**
	 * 
	 */
	@Override
	public int scheduleForPatients() {
		return ConsoleIO.promptForMenuSelection(
				new String[] { "Schedule for a new patient", "Schedule for an existing patient" }, true);
	}

	/**
	 * 
	 */
	@Override
	public String getExpireDate() {
		return ConsoleIO.promptForInput("Please enter in expiration month/year. (03/19)", false);
	}

	/**
	 * 
	 */
	@Override
	public boolean changePasswordDecision() {
		return ConsoleIO.promptForBool("Would you like to change your password? ", "y", "n");
	}

	/**
	 * 
	 */
	@Override
	public int changeUserPassword() {
		return ConsoleIO.promptForMenuSelection(
				new String[] { "Change your password", "Change another user's password" }, true);
	}

	/**
	 * 
	 */
	@Override
	public String changePassword() {
		return ConsoleIO.promptForInput("What do you want the new password to be?", false);
	}

	/**
	 * 
	 */
	@Override
	public String getProcedureCode() {
		return ConsoleIO.promptForInput("Please enter the procedures code. D:", false);
	}

	/**
	 * 
	 */
	@Override
	public String getProcedureDescription() {
		return ConsoleIO.promptForInput("Please enter the description of this procedure.", false);
	}

	/**
	 * 
	 */
	@Override
	public Double getProcedureCost() {
		return ConsoleIO.promptForDouble("Please enter the cost of the procedure.", 0, Double.MAX_VALUE);
	}

	/**
	 * 
	 */
	@Override
	public int scheduleForProviders() {
		return ConsoleIO.promptForMenuSelection(
				new String[] { "Schedule with a new provider.", "Schedule with an existing provider." }, false);
	}

	/**
	 * 
	 */
	@Override
	public boolean addMoreProcedures() {
		return ConsoleIO.promptForBool("Would you like to add another procedure?\n1: Yes\n2: No", "1", "2");
	}

	/**
	 * 
	 */
	@Override
	public int getYear() {
		return ConsoleIO.promptForInt("What year is the appointment?", 1, Integer.MAX_VALUE);
	}

	/**
	 * 
	 */
	@Override
	public int getMonth() {
		return ConsoleIO.promptForInt("What month is the appointment?", 1, 12);
	}

	/**
	 * 
	 */
	@Override
	public int getDayOfMonth(int month) {
		int day = 0;
		
		switch(month) {
			case 1:	
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 3:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 5:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 7:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 8:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 10:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 12:	
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 31);
				break;
			case 2: 
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 28);
				break;
			case 4:	
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 30);
				break;
			case 6:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 30);
				break;
			case 9:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 30);
				break;
			case 11:
				day = ConsoleIO.promptForInt("What is the day of the appointment?", 1, 30);
				break;
			default:
				break;
		}
		
		return day;
			}

	/**
	 * 
	 */
	@Override
	public int getHour() {
		return ConsoleIO.promptForInt("What hour is the appointment?", 0, 23);
	}

	/**
	 * 
	 */
	@Override
	public int getMinute() {
		return ConsoleIO.promptForInt("What minute is the appointment?", 0, 59);
	}

	/**
	 * 
	 */
	@Override
	public boolean addMoreProviders() {
		return ConsoleIO.promptForBool("Would you like to add another provider?\n1: Yes\n2: No", "1", "2");
	}

	/**
	 * 
	 */
	@Override
	public void notifySearchingProvider() {
		ConsoleIO.displayMessage("Now enter the information for the provider you want.");
	}

	/**
	 * 
	 */
	@Override
	public void notifySearchingPatient() {
		ConsoleIO.displayMessage("Now enter the information for the Patient you want.");
	}

	/**
	 * 
	 */
	@Override
	public void invalidAppointmentDate() {
		ConsoleIO.displayMessage("Invalid time for an appointment.");
	}

	/**
	 * 
	 */
	@Override
	public void askForStartDate() {
		ConsoleIO.displayMessage("Please enter the starting date.");
	}

	/**
	 * 
	 */
	@Override
	public void askForEndDate() {
		ConsoleIO.displayMessage("Please enter the ending date.");
	}

	/**
	 * 
	 */
	@Override
	public boolean groupBySelection() {
		return ConsoleIO.promptForBool("Do you want to group them by month or by day?", "m", "d");
	}

	/**
	 * 
	 */
	@Override
	public boolean sortBySelection() {
		return ConsoleIO.promptForBool("Do you want to sort them by largest to smallest or by name?", "l", "n");
	}

}
