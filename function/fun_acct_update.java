public boolean fun_acct_update(String ...args){
			boolean ret;
			String pl18_acct_no_1=this.curTranSession.getVariableList().getValue("pl18_acct_no_1");
			String pl6_inst_no_3=this.curTranSession.getVariableList().getValue("pl6_inst_no_3");
			String pl2_curr_id_5=this.curTranSession.getVariableList().getValue("pl2_curr_id_5");
			String pl3_sav_kind_2=this.curTranSession.getVariableList().getValue("pl3_sav_kind_2");
			String pl6_seq_no_1=this.curTranSession.getVariableList().getValue("pl6_seq_no_1");
			String pl1_chk_no=this.curTranSession.getVariableList().getValue("pl1_chk_no");
			String pl6_inst_no_5=this.curTranSession.getVariableList().getValue("pl6_inst_no_5");
			String pl2_curr_id_6=this.curTranSession.getVariableList().getValue("pl2_curr_id_6");
			String pl3_sav_kind_3=this.curTranSession.getVariableList().getValue("pl3_sav_kind_3");
			String pl6_seq_no_3=this.curTranSession.getVariableList().getValue("pl6_seq_no_3");
			String pl1_chk_no_1=this.curTranSession.getVariableList().getValue("pl1_chk_no_1");
		
			String _tx_code;
			
		    if( !(_tx_code .equals( "1012")) )
		    {
		    pl18_acct_no_1 = pl6_inst_no_3 + pl2_curr_id_5 + pl3_sav_kind_2
		                     + pl6_seq_no_1 + pl1_chk_no;
		    }
		    else{
		    pl18_acct_no_1 = pl6_inst_no_5 + pl2_curr_id_6 + pl3_sav_kind_3
		                      + pl6_seq_no_3 + pl1_chk_no_1;
		    }
		    //case ( _tx_code ){
		    //     "1012":   
		            ret = disp_drawmode( "pl1_draw_mode" );
		    //         UserDialog( pl1_draw_mode );
		    //}
		    return true;
	}