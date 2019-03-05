public boolean fun_zp(String ...args){
			String pl3_sav_kind_3=this.curTranSession.getVariableList().getValue("pl3_sav_kind_3");
			 boolean ret;
			    if( pl3_sav_kind_3 == "014" )
			    {
			         ret = SET_FIELD(null,"pluf13_amount_4", 2 );
			         return true ;
			    }
			    else
			    {
			         ret = SET_FIELD(null,"pluf13_amount_4",1);
			         return  true ;
			    }
	}
