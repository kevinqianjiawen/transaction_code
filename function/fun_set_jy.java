	public boolean fun_set_jy(){
			boolean ret;
			String pl3_sav_kind_3=this.curTranSession.getVariableList().getValue("pl3_sav_kind_3");
			String pl6_inst_no_5=this.curTranSession.getVariableList().getValue("pl6_inst_no_5");
			String pl2_curr_id_6=this.curTranSession.getVariableList().getValue("pl2_curr_id_6");
			String pl6_seq_no_3=this.curTranSession.getVariableList().getValue("pl6_seq_no_3");
			String pl1_chk_no_1=this.curTranSession.getVariableList().getValue("pl1_chk_no_1");
			String _tlr_no=this.curTranSession.getVariableList().getValue("_tlr_no");
			
		    String tmp_name, acctno;
		    int type;
		    ret = PUT_DISPLAY_VARIABLE( "pluf13_cont_id",0,"" );
		    ret = PUT_DISPLAY_VARIABLE( "pl1_flag_2",0,"" );
		    ret = PUT_DISPLAY_VARIABLE( "pl2_sav_time",0,"" );
		    ret=SET_FIELD(null,"pl1_flag_2",2);
		    
		    if ( pl3_sav_kind_3 == "016" )
		    {
		      ret = PUT_DISPLAY_VARIABLE( "pluf13_cont_id",0,"是否利率优惠:" );
		      ret=SET_FIELD(null,"pl1_flag_2",6);
		    }
		    
		    //add by chao 控制柜员不能给自己做业务 begin
		    type = 93;
		    acctno = pl6_inst_no_5 + pl2_curr_id_6 + pl3_sav_kind_3 
		             + pl6_seq_no_3 + pl1_chk_no_1;
		    tmp_name = GetAutoMsg( type, _tlr_no+acctno );
		    if( _tlr_no == tmp_name )
		    {
		    	App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
		        return false;
		    }
		    //add by chao 控制柜员不能给自己做业务 end
		    return ret;
		    
		      
		}