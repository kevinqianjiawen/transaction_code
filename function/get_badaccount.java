public boolean get_badaccount(){

			String pluf10_tran_date_2=this.curTranSession.getVariableList().getValue("pluf10_tran_date_2");
			String _tlr_no=this.curTranSession.getVariableList().getValue("_tlr_no");
			String pl4_seq_1=this.curTranSession.getVariableList().getValue("pl4_seq_1");
			int type;
		    boolean ret;
		    String out_msg,tmp_str;
		    out_msg=pluf10_tran_date_2+_tlr_no+pl4_seq_1;
		    
		    type=30;
		    tmp_str=GetAutoMsg( type,out_msg );
		    if(tmp_str.equals(""))
		    {
		    	App.showFlashStateMsg("没有这条记录");
		    }
		    ret = PUT_DISPLAY_VARIABLE("puf13_tran_amount_7", 0, tmp_str ); 
		    return true;
		}