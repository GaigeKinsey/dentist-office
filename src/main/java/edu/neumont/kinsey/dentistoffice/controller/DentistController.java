package edu.neumont.kinsey.dentistoffice.controller;

import java.io.IOException;

import edu.neumont.kinsey.dentistoffice.model.Clinic;
import edu.neumont.kinsey.savabledatabase.SavableDatabase;

public class DentistController {
	Clinic clinic;

	public void run() {
		SavableDatabase database = new SavableDatabase();
		try {
			database.load();
			clinic = (Clinic) database.get(0);
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("No clinic to load");
		}
		login();
	}

	private void login() {
		
	}
}
