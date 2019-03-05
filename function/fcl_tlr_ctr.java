public boolean fcl_tlr_ctr(String vertifyValue,String ...args){
			int type;
		    boolean ret;
		    String acctno, acctno1, acctno2;
		    String tmp_name = null, tmp_name1 = null, tmp_name2 = null;
		    String pl6_inst_no_5=this.curTranSession.getVariableList().getValue("pl6_inst_no_5");
		    String pl2_curr_id_6=this.curTranSession.getVariableList().getValue("pl2_curr_id_6");
		    String pl3_sav_kind_3=this.curTranSession.getVariableList().getValue("pl3_sav_kind_3");
		    String pl6_seq_no_3=this.curTranSession.getVariableList().getValue("pl6_seq_no_3");
		    String pl1_chk_no_1=this.curTranSession.getVariableList().getValue("pl1_chk_no_1");
		    String _tlr_no=this.curTranSession.getVariableList().getValue("_tlr_no");
		    
		    String pl6_inst_no_3=this.curTranSession.getVariableList().getValue("pl6_inst_no_3");
		    String pl2_curr_id_5=this.curTranSession.getVariableList().getValue("pl2_curr_id_5");
		    String pl3_sav_kind_2=this.curTranSession.getVariableList().getValue("pl3_sav_kind_2");
		    String pl6_seq_no_1=this.curTranSession.getVariableList().getValue("pl6_seq_no_1");
		    String pl1_chk_no=this.curTranSession.getVariableList().getValue("pl1_chk_no");
		    
		    String pl18_acct_no_1=this.curTranSession.getVariableList().getValue("pl18_acct_no_1");
		    String puf26_acct_no_1=this.curTranSession.getVariableList().getValue("puf26_acct_no_1");
		    String pluf18_acct_no_1=this.curTranSession.getVariableList().getValue("pluf18_acct_no_1");
		    type = 93;
		    
		    String _tx_code="";
		    String pl6_inst_no_4 = null;
			String pl2_curr_id_3 = null;
			String pl2_curr_id_2 = null;
			String pl3_prod_id_2 = null;
			String pl4_seq_1 = null;
			String pl2_chk_no_1 = null;
			if(_tx_code.equals("1011")||_tx_code.equals("1012")||
		    		_tx_code.equals("1016")||_tx_code.equals("1032")||
		    		_tx_code.equals("1063")||_tx_code.equals("1064")||
		    		_tx_code.equals("1303")||_tx_code.equals("1303")||_tx_code.equals("1311")){
		    	acctno = pl6_inst_no_5 + pl2_curr_id_6 + pl3_sav_kind_3 
                + pl6_seq_no_3 + pl1_chk_no_1;
		    	//tmp_name = GetAutoMsg( type, _tlr_no+acctno );
		    		if( _tlr_no .equals( tmp_name ))
		    			{
		    				App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
		    					return false;
		    			}
		    }else if(_tx_code.equals("1014")||_tx_code.equals("1021")||
		    		_tx_code.equals("1022")||_tx_code.equals("1023")||
		    		_tx_code.equals("1024")||_tx_code.equals("1034")||
		    		_tx_code.equals("1062")||_tx_code.equals("1065")||
		    		_tx_code.equals("1069")||_tx_code.equals("1083")||_tx_code.equals("1312")){
		    	 acctno = pl6_inst_no_3 + pl2_curr_id_5 + pl3_sav_kind_2
                 + pl6_seq_no_1 + pl1_chk_no;
		    	 	//tmp_name = GetAutoMsg( type, _tlr_no+acctno );
		    	 	if( _tlr_no .equals( tmp_name ))
		    	 		{
		    	 			App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
		    	 				return false;
		    	 			}
		    }else if(_tx_code.equals("1035")||_tx_code.equals("1066")||_tx_code.equals("1082")){
		    	acctno = pl18_acct_no_1;
	            //  tmp_name = GetAutoMsg( type, _tlr_no+acctno );
	              if( _tlr_no .equals( tmp_name ))
	              {
	            	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
	                  return false;
	              }
	              // "1055":
			         // {  
			         //     acctno = pl18_acct_no_2;
			         //     tmp_name = GetAutoMsg( type, _tlr_no+acctno );
			         //     if( _tlr_no == tmp_name )
			         //     {
			         //         App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
			         //         return   false;
			         //     }
			         // }
			         // "1059":
			         // {
			         //     acctno = pluf18_acct_no_2;
			         //     tmp_name = GetAutoMsg( type, _tlr_no+acctno );
			         //     if( _tlr_no == tmp_name )
			         //     {
			         //         App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
			         //         return   false;
			         //     }
			         // }
		    }else if(_tx_code.equals("1052")){
		    	acctno = puf26_acct_no_1;
	            //  tmp_name = GetAutoMsg( type, _tlr_no+acctno );
	              if( _tlr_no == tmp_name )
	              {  
	            	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
	                  return false;
	              }
	              // "1053":
			         // {
			         //     acctno = puf18_acct_no_2;
			         //     tmp_name = GetAutoMsg( type, _tlr_no+acctno );
			         //     if( _tlr_no == tmp_name )
			         //     {
			         //         App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
			         //         return   false;
			         //     }
			         // }
		    }else if(_tx_code=="1313"){
		    	acctno = pl6_inst_no_5 + pl2_curr_id_6 + pl3_sav_kind_2
                + pl6_seq_no_3 + pl1_chk_no_1;
       
      // tmp_name = GetAutoMsg( type, _tlr_no+acctno );
       if( _tlr_no == tmp_name )
       {
     	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
           return false;
       }
		    }else if(_tx_code=="2263"){
		    	 acctno = pluf18_acct_no_1;
	          //    tmp_name = GetAutoMsg( type, _tlr_no+acctno );
	              if( _tlr_no == tmp_name )
	              {
	            	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
	                  return false;
	              }
//	            "2274":
	  		    //      {
	  		    //          acctno = pl6_inst_no_1 + pl2_curr_id_1 + puf14_rjct_reason;
	  		    //          tmp_name = GetAutoMsg( type, _tlr_no+acctno );
	  		    //          if( _tlr_no == tmp_name )
	  		    //          {
	  		    //              App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
	  		    //              return   false;
	  		    //          }
	  		    //      }
	              
	              
	              
	  		    
	              
		    }else if(_tx_code=="2414"){
		    	int p14_acctserino = 0;
				acctno1 = (pl6_inst_no_4 + pl2_curr_id_3 + p14_acctserino);
	              acctno2 = pl6_inst_no_3 + pl2_curr_id_2 + pl3_prod_id_2
	                        + pl4_seq_1 + pl2_chk_no_1;
	             // tmp_name1 = GetAutoMsg( type, _tlr_no+acctno1 );
	              if( _tlr_no == tmp_name1 )
	              {
	            	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
	                  return false;
	              }
	    
	              //tmp_name2 = GetAutoMsg( type, _tlr_no+acctno2 );
	              if( _tlr_no == tmp_name2 )
	              {
	            	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
	                  return false;
	              }
		    }else if(_tx_code=="2415"||_tx_code=="2416"){
		    	acctno1 = pl6_inst_no_3 + pl2_curr_id_2 + pl3_prod_id_2 
                + pl4_seq_1 + pl2_chk_no_1;
      String pluf14_seq_no = null;
	acctno2 = pl6_inst_no_4 + pl2_curr_id_3 + pluf14_seq_no;
      //ret = fcl_get_name(acctno1); //为什么不能调用这个函数
    //  tmp_name1 = GetAutoMsg( type, _tlr_no+acctno1 );
      if( _tlr_no == tmp_name1 )
      {
          App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
          return false;
      }
    //  tmp_name2 = GetAutoMsg( type, _tlr_no+acctno2 );
      if( _tlr_no == tmp_name2 )
      {
          App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
          return false;
      }
		    }else if(_tx_code=="2411"){
		    	String pl3_prod_id_3 = null;
				String pl4_seq_2 = null;
				String pl2_chk_no_2 = null;
				acctno1 = pl6_inst_no_4 + pl2_curr_id_3 + pl3_prod_id_3
                + pl4_seq_2 + pl2_chk_no_2;
      acctno2 = pl18_acct_no_1;

    //  tmp_name1 = GetAutoMsg( type, _tlr_no+acctno1 );
      if( _tlr_no == tmp_name1 )
      {
          App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
          return false;
      }
     
     // tmp_name2 = GetAutoMsg( type, _tlr_no+acctno2 );
      if( _tlr_no == tmp_name2 )
      {
    	  App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
          return   false;
      }       
  }
		    return true;
				}