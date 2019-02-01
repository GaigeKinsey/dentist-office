package edu.neumont.kinsey.dentistoffice.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinic implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Provider> providers = new ArrayList<>();
	private List<Payment> payments = new ArrayList<>();
	private List<Patient> patients = new ArrayList<>();
	private List<Appointment> appointments = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	
	public Clinic () {
		users.add(new User("Administrator", "1234Password"));
	}
	
	public List<Provider> getProviders() {
		return providers;
	}
	
	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Appointment> getFutureAppointments(){
		return null;
	}
	
	public List<Appointment> getPastAppointments(){
		return null;
	}
	
	public List<Provider> searchProviders(ProviderSearchCriteria criteria){
		return null;
	}
	
	public List<Patient> searchPatients(PatientSearchCriteria criteria){
		return null;
	}
	
	public List<Appointment> searchAppointments(AppointmentSearchCriteria criteria){
		return null;
	}
	
	public void receivePayment(Payment payment) {
		
	}
	
	public double getAccountBalance(int patientId) {
		return 0;	
	}
	
	//Reports - idk if you wanna go about it this way??
	//Haven't thought this all the way through - I have void for now 
	public void productionReport(LocalDate startDate, LocalDate endDate, boolean groupBy) {
		
	}
	
	public void patientBalanceReport(boolean sort) {
		
	}
	
	public void collectionsReport(LocalDate startDate, LocalDate endDate, boolean groupBy) {
		
	}
	
}
