public boolean fcl_0115_xl(String ...args){
			boolean ret;
	    	if(_user_work_data=="1"){
	    		 ret = SET_FIELD(null,"puf4_num_1",2);
		            ret = PUT_DISPLAY_VARIABLE("puf4_num_1", 0, "5540");
	    	}else if(_user_work_data=="2"){
	    		ret = PUT_DISPLAY_VARIABLE("puf4_num_1", 0, "");
	            ret = SET_FIELD(null,"puf4_num_1",1);
	    	}
	    return true; 
	}