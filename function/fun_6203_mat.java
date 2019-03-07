public boolean fun_6203_mat(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			boolean ret;
		   String _user_work_data;
		   if(_user_work_data.equals("321")){
			   
		   
	  
	            ret = PUT_DISPLAY_VARIABLE("pl1_acct_attr",0,"4");
	            ret = PUT_DISPLAY_VARIABLE("pl1_tctd_flag",0,"1");
	            ret = PUT_DISPLAY_VARIABLE("pl1_prn_period",0,"1");
	            ret = PUT_DISPLAY_VARIABLE("pl1_inter_way",0,"1");
	            ret = PUT_DISPLAY_VARIABLE("pl1_withdraw_way",0,"0");
	            ret=SET_FIELD(null,"pl1_acct_attr",2 );
	            ret=SET_FIELD(null,"pl1_tctd_flag",2 );
	            ret=SET_FIELD(null,"pl1_prn_period",2);
	            ret=SET_FIELD(null,"pl1_inter_way",2);
	            ret=SET_FIELD(null,"pl1_withdraw_way",6);
		   }else{
			   
	       otherwise:
	            ret = SET_FIELD(null,"pl1_acct_attr",6);    
	    }
	    return true;   
		}