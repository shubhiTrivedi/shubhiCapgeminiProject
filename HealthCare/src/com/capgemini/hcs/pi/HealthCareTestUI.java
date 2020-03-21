package com.capgemini.hcs.pi;

import java.util.Map;

import com.capgemini.hcs.bean.DiagnosticCenter;
import com.capgemini.hcs.bean.DiagnosticTestBean;
import com.capgemini.hcs.exception.DiagnosticException;
import com.capgemini.hcs.exception.ValidateException;
import com.capgemini.hcs.service.HealthCareService;
import com.capgemini.hcs.service.HealthCareServiceImpl;

public class HealthCareTestUI {
	static HealthCareService ser = new HealthCareServiceImpl();
	public static void main(String[] args) {
		try {
			DiagnosticTestBean test1 = new DiagnosticTestBean("Complete blood count", "CBC", 600);
			ser.addTest("HYD1001", test1);
			
			DiagnosticTestBean test2 = new DiagnosticTestBean("Liver functioning Test", "LFT", 1600);
			ser.addTest("HYD1001", test2);
			
			Map<String, DiagnosticCenter> map = ser.getCentres();
			map.values().forEach(c->{System.out.println(c);
			             c.getListOfTests().forEach(t->{System.out.println(t);});
			             });
	        }catch(ValidateException ex) {
	        	System.out.println(ex.getMessage());
	        }catch(DiagnosticException ex) {
	        	System.out.println(ex.getMessage());
	        }
	}

}
