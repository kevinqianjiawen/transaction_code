public boolean fun_1035_getname(){
			 boolean ret;
			    String tmp_name, acctno;
			    String pluf20_name_2 =this.curTranSession.getVariableList().getValue("pluf20_name_2");
			    String pl18_acct_no_1 =this.curTranSession.getVariableList().getValue("pl18_acct_no_1");
			    String _tlr_no =this.curTranSession.getVariableList().getValue("_tlr_no");
				  
			    int type;
			    
			    pluf20_name_2=GetAutoMsg( 1, pl18_acct_no_1 );
			    ret = PUT_DISPLAY_VARIABLE("pluf20_name_2", 0, pluf20_name_2);
			    // add by chao 控制柜员不能给自己做业务 begin
			    type = 93;
			    acctno = pl18_acct_no_1;
			    tmp_name = GetAutoMsg( type, _tlr_no+acctno );
			    if( _tlr_no .equals( tmp_name) )
			    {
			        App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
			        return false;
			    }
			    // add by chao 控制柜员不能给自己做业务 end
			    return true;
		      
		}