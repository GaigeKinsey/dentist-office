package edu.neumont.kinsey.dentistoffice.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRecord extends Appointment{
	
	private List<ProcedureRecord> procedures = new ArrayList<>();

	public AppointmentRecord(LocalDateTime dateTime, List<ProcedureRecord> procedures) {
		super(dateTime);
		this.setProcedures(procedures);
	}

	public List<ProcedureRecord> getProcedures() {
		return procedures;
	}

	public void setProcedures(List<ProcedureRecord> procedures) {
		this.procedures = procedures;
	}

	
}
