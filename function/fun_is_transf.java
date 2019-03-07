public boolean fun_is_transf(){
			boolean ret;
			char pl1_csh_flag;
		    if(pl1_csh_flag == '1')
		    {
		      ret = SET_FIELD(null, "p1_curr_type", 6);
		      ret = SET_FIELD(null, "pluf10_vouch_id", 0);
		    }
		    else
		    {
		      ret = SET_FIELD(null, "p1_curr_type", 7);
		      ret = PUT_DISPLAY_VARIABLE("p1_curr_type", 0, "");
		      ret = SET_FIELD(null, "pluf10_vouch_id", 2);
		      ret = PUT_DISPLAY_VARIABLE("pluf10_vouch_id", 0, "");
		    }
		    return(true);
		      
		}