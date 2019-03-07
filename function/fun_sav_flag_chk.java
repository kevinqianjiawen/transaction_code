public boolean fun_sav_flag_chk(){
			 boolean ret;
			 String _user_work;
			 char p1_mode_inf;
			    ret = SET_FIELD(null,"p4_sign_id_1",2);      
			    ret = SET_FIELD(null,"puf10_vouch_id_4",2);                           
			    //ret = SET_FIELD(null,"p1_vch_type",2);      
			    //ret = SET_FIELD(null,"sav_chk_passwd",2);      
			    ret = SET_FIELD(null,"puf6_passwd_5",2);
			    ret = SET_FIELD(null,"puf6_passwd_4",2);      
			    ret = PUT_DISPLAY_VARIABLE("puf10_vouch_id_4",0,"");                               
			    ret = PUT_DISPLAY_VARIABLE("p4_sign_id_1",0,"");                               
			    //ret = PUT_DISPLAY_VARIABLE("p1_vch_type",0,"");                               
			    //ret = PUT_DISPLAY_VARIABLE("sav_chk_passwd",0,"");                               
			    ret = PUT_DISPLAY_VARIABLE("puf6_passwd_5",0,"");
			    if(_user_work.equals("0")){
			    	return true;
			    }else if(_user_work.equals("1")){
			    	if(p1_mode_inf=='4'){
			    		ret = SET_FIELD(null,"puf10_vouch_id_4",1);
					    //                 if (pl3_sav_kind_2 == "011")
					    //                   {  ret = SET_FIELD(null,"p1_vch_type",1);
					    //                   }  
			    	}else if(p1_mode_inf=='6'){
			    		ret = SET_FIELD(null,"puf6_passwd_5",1);  
	                     ret = SET_FIELD(null,"puf6_passwd_4",0);
	                     //ret = SET_FIELD(null,"sav_chk_passwd",1);  
			    	}else if(p1_mode_inf=='8'){
			    		ret = SET_FIELD(null,"p4_sign_id_1",1);  
			    	}
			    }
			    ret = SET_FIELD(null,"puf40_name_4",2);
			    ret = SET_FIELD(null,"puf30_remark",2);
			    return true ;
		}
