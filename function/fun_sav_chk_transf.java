public boolean fun_sav_chk_transf(){
			boolean ret;
			String _tx_code;
			char pl1_csh_flag;
		    if(!( _tx_code.equals( "1031")) )
		    {
		       if( pl1_csh_flag == '0' )
		       {
		           ret = SET_FIELD(null, "puf13_tran_amount_7", 1);  
		    /*    ret = SET_FIELD(null, "pl2_curr_id_3", 2); */
		    /*    ret = SET_FIELD(null, "p14_acctserino", 2);  */
		    /*    ret = SET_FIELD(null, "pluf22_acct_no_4", 2); */
		    /*    ret = SET_FIELD(null,"puf6_passwd_4", 2); */
		       }
		       else
		       {
		           ret = SET_FIELD(null, "puf13_tran_amount_7", 1);
		       /* ret = SET_FIELD(null, "pl2_curr_id_3", 1);
		           ret = SET_FIELD(null, "p14_acctserino", 1);  */
		       }
		    }
		    
		    if( _tx_code.equals( "1031") )
		    {
		        if( pl1_csh_flag == '0' )
		        {
		            ret = SET_FIELD(null, "puf13_tran_amount_7", 1);
		            ret = SET_FIELD(null, "pluf22_acct_no_4", 2);
		            ret = SET_FIELD(null,"puf6_passwd_4", 2); 
		        }
		        else
		        {
		            ret = SET_FIELD(null, "puf13_tran_amount_7", 1);
		        }
		    }
		    return true;
		}