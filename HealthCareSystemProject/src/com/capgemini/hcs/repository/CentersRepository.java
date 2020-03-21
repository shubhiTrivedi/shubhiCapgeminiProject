package com.capgemini.hcs.repository;

import java.util.ArrayList;
import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;

public class CentersRepository {
	//static HealthCareDAOImpl d2=new HealthCareDAOImpl();
	
	static {
	DiagnosticTestDAOImpl.centers.add(new DiagnosticCenter("KMC"));
    DiagnosticTestDAOImpl.centers.add(new DiagnosticCenter("Sharda"));
	DiagnosticTestDAOImpl.centers.add(new DiagnosticCenter("Regency"));
	DiagnosticTestDAOImpl.centers.add(new DiagnosticCenter("Ganesh"));
	DiagnosticTestDAOImpl.centers.add(new DiagnosticCenter("Prerna"));
	}
	static public ArrayList<DiagnosticCenter> get() {
		return DiagnosticTestDAOImpl.centers;
	}

}
