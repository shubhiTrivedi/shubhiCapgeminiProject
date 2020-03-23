package com.capgemini.hcs.repository;

import java.util.ArrayList;
import com.capgemini.hcs.bean.DiagnosticCenterBean;
import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;

public class CentersRepository {
	
	
	static {
	DiagnosticTestDAOImpl.getCenters().add(new DiagnosticCenterBean("KMC"));
    DiagnosticTestDAOImpl.getCenters().add(new DiagnosticCenterBean("Sharda"));
	DiagnosticTestDAOImpl.getCenters().add(new DiagnosticCenterBean("Regency"));
	DiagnosticTestDAOImpl.getCenters().add(new DiagnosticCenterBean("Ganesh"));
	DiagnosticTestDAOImpl.getCenters().add(new DiagnosticCenterBean("Prerna"));
	}
	static public ArrayList<DiagnosticCenterBean> get() {
		return DiagnosticTestDAOImpl.getCenters();
	}

}
