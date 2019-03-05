public boolean fun_sav_is_book_chk(String ...args){
			boolean ret;
		    String tmp_name,tmp_acct;
		    int type;
		    String pl3_sav_kind_2=this.curTranSession.getVariableList().getValue("pl3_sav_kind_2");
		    String pl6_inst_no_3=this.curTranSession.getVariableList().getValue("pl6_inst_no_3");
		    String pl2_curr_id_5=this.curTranSession.getVariableList().getValue("pl2_curr_id_5");
		    String pl6_seq_no_1=this.curTranSession.getVariableList().getValue("pl6_seq_no_1");
		    type = 1;
		    if( pl3_sav_kind_2.equals( "014") )
		    {
		       tmp_acct = pl6_inst_no_3 + pl2_curr_id_5 + pl3_sav_kind_2 + pl6_seq_no_1 + pl1_chk_no ;
		     tmp_name = GetAutoMsg( type, tmp_acct);  
		       ret = PUT_DISPLAY_VARIABLE("pluf20_name_2", 0, tmp_name);
		    }
		    return true;
	}