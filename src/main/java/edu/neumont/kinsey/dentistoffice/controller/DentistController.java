package edu.neumont.kinsey.dentistoffice.controller;

import java.io.IOException;

import edu.neumont.kinsey.dentistoffice.model.Clinic;
import edu.neumont.kinsey.dentistoffice.model.User;
import edu.neumont.kinsey.dentistoffice.view.UserInteraction;
import edu.neumont.kinsey.savabledatabase.SavableDatabase;

public class DentistController {
	Clinic clinic;
	UserInteraction userInteraction = new UserInteraction();
	
	public void run() {
		SavableDatabase database = new SavableDatabase();
		try {
			database.load();
			clinic = (Clinic) database.get(0);
		} catch (ClassNotFoundException | IOException e) {
			firstLogin();
		}
		login();
	}

	private void firstLogin() {
		clinic.addUser(new User("Administrator", "1234Password"));
		String newPass = userInteraction.adminPasswordChange();
	}

	private void login() {
		
	}
}
