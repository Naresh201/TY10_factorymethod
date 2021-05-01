package com.te.factorymethod_demo;

public class GetPlan {
	
	public static Plan getPlan(String plantype) {
		
		Plan plan = null;
		
		if(plantype.equalsIgnoreCase("Domesticplan")) {
	    	plan = new DomesticPlan();
	    }else if(plantype.equalsIgnoreCase("CommercialPlan")){
	    	plan  = new CommercialPlan();
	    }else if(plantype.equalsIgnoreCase("instutionalplan")) {
	    	plan= new InstutionalPlan();
	    }
		return plan;
	}

}
