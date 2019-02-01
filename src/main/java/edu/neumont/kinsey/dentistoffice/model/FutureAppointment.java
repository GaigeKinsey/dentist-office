package edu.neumont.kinsey.dentistoffice.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FutureAppointment extends Appointment{
	private Patient patient;
	private List<Provider> providers = new ArrayList<>();
	private List<Procedure> procedures = new ArrayList<>();
	
	public FutureAppointment(LocalDateTime dateTime, Patient patient, List<Provider> providers, List<Procedure> procedures) {
		super(dateTime);
		this.setPatient(patient);
		this.setProviders(providers);
		this.setProcedures(procedures);
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public List<Procedure> getProcedures() {
		return procedures;
	}

	public void setProcedures(List<Procedure> procedures) {
		this.procedures = procedures;
	}
}
