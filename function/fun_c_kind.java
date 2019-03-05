public boolean fun_c_kind(String ...args){
			String pl3_sav_kind_2 = this.curTranSession.getVariableList().getValue("pl3_sav_kind_2");
			
			boolean ret;
		    if( pl3_sav_kind_2 == "014" )
		    {
		         ret = SET_FIELD(null,"p1_with_book",2);
		         ret = SET_FIELD(null,"puf10_vouch_id_8",2);
		         ret = SET_FIELD(null,"pluf13_amount_4",2);
		         ret = SET_FIELD(null,"pluf20_name_2",1);
		         ret = SET_FIELD(null,"puf13_tran_amount_7",1);
		         return( true );
		    }
		    else
		    {
		         ret=SET_FIELD(null,"p1_with_book",1);
		    //     ret = SET_FIELD(null,"puf10_vouch_id_8",1);
		         ret = SET_FIELD(null,"pluf13_amount_4",1);
		         return( true );
		    }