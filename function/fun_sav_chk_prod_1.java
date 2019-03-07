public boolean fun_sav_chk_prod_1(){
			boolean ret;
			String pl3_sav_kind_1=this.curTranSession.getVariableList().getValue("pl3_sav_kind_1");
		    ret=SET_FIELD(null,"p2_sav_time_1",2);
		    ret=SET_FIELD(null,"p2_sav_time_2",2);
		    ret=SET_FIELD(null,"p1_draw_cycle",2);
		    
		    ret = PUT_DISPLAY_VARIABLE("p2_sav_time_1",0,null);
		    ret = PUT_DISPLAY_VARIABLE("p2_sav_time_2",0,null);
		    ret = PUT_DISPLAY_VARIABLE("p1_draw_cycle",0,null);
		    
		    
		    if(pl3_sav_kind_1.equals("030") || pl3_sav_kind_1.equals("040"))
		     { 
		      ret=SET_FIELD(null,"p2_sav_time_1",6);
		      return(true);
		     }
		    if (pl3_sav_kind_1.equals("020"))
		      {
		        ret=SET_FIELD(null,"p2_sav_time_1",6);
		        ret=SET_FIELD(null,"p2_sav_time_2",6);
		        return(true);
		      }
		    if(pl3_sav_kind_1.equals("050"))
		                 {
		                  ret=SET_FIELD(null,"p2_sav_time_1",6);
		                  ret=SET_FIELD(null,"p1_draw_cycle",6);
		                  return(true);
		                 }
		    return true;
		      
		}