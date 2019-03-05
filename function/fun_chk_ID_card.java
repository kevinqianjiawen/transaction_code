public boolean fun_chk_ID_card(String ...args){
			int len;
		    int len1;
		    boolean ret=false;
		    String pl1_cert_type=this.curTranSession.getVariableList().getValue("pl1_cert_type");
		    String puf18_ID_card_1 =this.curTranSession.getVariableList().getValue("puf18_ID_card_1");
		    String puf18_ID_card_2 =this.curTranSession.getVariableList().getValue("puf18_ID_card_2");
		    String pluf18_acct_no_1 =this.curTranSession.getVariableList().getValue("pluf18_acct_no_1");
		    String pl18_custom_id = this.curTranSession.getVariableList().getValue("pl18_custom_id");
		    String pluf20_identify = this.curTranSession.getVariableList().getValue("pluf20_identify");
		    
		    
		    String _tx_code="0101"; //未知变量自定义,不知道从哪获取
		   
		    if(pl1_cert_type .equals("3")) {
		        pl18_custom_id = puf18_ID_card_1;
		       // ret = DISPLAY_VARIABLE( "pl18_custom_id", 0 );
		    }
		    if( pl1_cert_type.equals("0") )
		    {
		      //ret = CifCheckCertNo( _user_work_data );
		      if( ret == false )
		      {
		        return  false ;
		      }
		    }  
		    
			if(_tx_code.equals("1012")||_tx_code.equals("1014")||_tx_code.equals("1016")||
		    		_tx_code.equals("1031")||_tx_code.equals("1032")||_tx_code.equals("1033")
		    			||_tx_code.equals("1066")||_tx_code.equals("1074")||_tx_code.equals("1075")
		    				||_tx_code.equals("1078")||_tx_code.equals("1079")||_tx_code.equals("1060")){
				if( !(pl1_cert_type.equals("0")) )
                {  return  true ;  }
              len = puf18_ID_card_1.length();
              if(len == 0 || len == 15 || len == 18){ 
   
              len1 = puf18_ID_card_2.length();
              if(len1 == 0 || len1 == 15 || len1 == 18){ return  true; }
              else
              { App.showFlashStateMsg("身份证号码长度错误,请重输");
                return false;
              }
              //return true;
              }
              else
              { App.showFlashStateMsg("身份证号码长度错误,请重输");
                return false;
              }
		    }else if(_tx_code.equals("0101")||_tx_code.equals("0102")){
		    	 if ( pl1_cert_type .equals( "0" )){
	                  len = puf18_ID_card_1.length();
	                  if(len == 0 || len == 15 || len == 18){ return  true; }
	                  else
	                   { App.showFlashStateMsg("身份证号码长度错误,请重输");
	                     return false;
	                   }
	               }
		    }else if(_tx_code.equals("0114")|_tx_code.equals("0115")){
		    	if ( pl1_cert_type .equals( "0" )){
	                  len = pluf18_acct_no_1.length();
	                  if(len == 0 || len == 15 || len == 18){ return  true; }
	                  else
	                   { App.showFlashStateMsg("身份证号码长度错误,请重输");
	                     return false;
	                   }
	               }
		    	
		    }else if(_tx_code.equals("4104")){
		    	   if ( pl1_cert_type .equals( "0" )){
		                  len = pluf20_identify.length();
		                  if(len == 0 || len == 15 || len == 18){ return  true; }
		                  else
		                   { App.showFlashStateMsg("身份证号码长度错误,请重输");
		                     return false;
		                   }
		               }
		    }else{
		    	return true;
		    }
			return true;
		}