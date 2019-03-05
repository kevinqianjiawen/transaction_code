public boolean fun_for_chk_cunzhe(String ...args){
			String pluf18_cust_type = this.curTranSession.getVariableList().getValue("pluf18_cust_type");
			int ret1, ret2;
	        boolean ret;
	        String _tx_code;
	        if( _tx_code == "1011" || _tx_code == "1032" ||
	            _tx_code == "1063" || _tx_code == "1012" || 
	            _tx_code == "1013" || _tx_code == "1064" || 
	            _tx_code == "1401")
	        {
	            //UserDialog("非1310交易if");
	            ret1=USER_ANSWER_BOX("是否刷存折?");
	        }
	        else
	        {
	           // UserDialog("非1310交易else");
	            ret1 = 1;
	        }
	        if( ret1==1 )
	        { 
	           // UserDialog("非1310交易ret1=1");
	            ret = SET_FIELD(null,"pl6_inst_no_5",1);          
	      
	            ret = SET_FIELD(null,"pl2_curr_id_6",1);          
	    
	            ret = SET_FIELD(null,"pl3_sav_kind_3",1);   
	           
	            ret = SET_FIELD(null,"pl6_seq_no_3",1);    
	          
	            ret = SET_FIELD(null,"puf10_vouch_id_8",1);          
	        }
	        if( _tx_code == "1310" )
	        {
	          //  UserDialog("1310交易");
	            ret2 = USER_ANSWER_BOX("是否刷存折?");
	            if( ret2 == 0 )
	            {
	            //    UserDialog("1310交易ret2=0");
	                ret = SET_FIELD(null,"pl6_seq_no_3",1);
	            }
	            if( ret2 == 1)
	            {
	              //  UserDialog("1310交易ret2=1");
	                ret = SET_FIELD(null,"pl6_seq_no_3",2);
	            }
	        }
	        return true;
	}