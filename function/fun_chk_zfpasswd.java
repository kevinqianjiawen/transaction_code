public boolean fun_chk_zfpasswd(String ...args){
			boolean ret;
			char p1_is_rel;
			String pl1_draw_mode=this.curTranSession.getVariableList().getValue("pl1_draw_mode");
		    if( p1_is_rel== '1' )
		    {
		        ret = PUT_DISPLAY_VARIABLE("puf6_passwd_2",0,"");
		        ret = PUT_DISPLAY_VARIABLE("p4_sign_id_2",0,"");
		        ret = SET_FIELD(null,"p4_sign_id_2",2);
		        ret = SET_FIELD(null,"puf6_passwd_2",2);
		        ret = SET_FIELD(null,"puf16_passwd_1",1);
		        ret = SET_FIELD(null,"pl1_draw_mode",2);
		    }
		    else
		    {
		        ret = SET_FIELD(null,"puf16_passwd_1",2);                
		        ret = SET_FIELD(null,"pl1_draw_mode",1);
		        ret = PUT_DISPLAY_VARIABLE("puf16_passwd_1",0,"");
		        if( pl1_draw_mode == "1" )
		        {
		            ret = PUT_DISPLAY_VARIABLE("puf6_passwd_2",0,"");
		            ret = SET_FIELD(null,"puf6_passwd_2",1);
		        }
		        if( pl1_draw_mode == "2" )
		        {
		            ret = PUT_DISPLAY_VARIABLE("p4_sign_id_2",0,""); 
		            ret = SET_FIELD(null,"p4_sign_id_2",1); 
		        }
		    }
		    return true;
	}