
		public boolean fun_sav_1063_chk_vch_type(){
			boolean ret;
			String p1_vch_type=this.curTranSession.getVariableList().getValue("p1_vch_type");
			String _user_work_data=this.curTranSession.getVariableList().getValue("_user_work_data");
		    p1_vch_type = "1";
		    return true ;
		    ret = SET_FIELD(null,"p1_vch_type",2);
		    if (_user_work_data.equals( "011"))
		      {  ret = SET_FIELD(null,"p1_vch_type",6);
		      }
		    return true;
		}
