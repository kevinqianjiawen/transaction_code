public boolean fun_dda_attr(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			char pl1_acct_attr;
			 String puf15_buf_1 = this.curTranSession.getVariableList().getValue("puf15_buf_1");
			 String pluf15_buf_2 = this.curTranSession.getVariableList().getValue("pluf15_buf_2");
			 char pl1_withdraw_way;  
			
			boolean ret;
		    /*
		    if (pl1_acct_attr <> '3')
		    {
		        ret = SET_FIELD(null,"pluf10_begin_date_1",2);
		        ret = SET_FIELD(null,"pluf10_end_date",2);
		    }
		    if (pl1_acct_attr == '3')
		    {
		        ret = SET_FIELD(null,"pluf10_begin_date_1",0);
		        ret = SET_FIELD(null,"pluf10_end_date",1);
		    }
		    */
		    if (pl1_acct_attr == '1')
		     {
		    //    ret=SET_FIELD(null,"puf15_doc_id_2",0);
		        puf15_buf_1="支票户";
		     }
		    else
		     {  
		        ret=PUT_DISPLAY_VARIABLE("puf15_doc_id_2",0,"");
		    //    ret=SET_FIELD(null,"puf15_doc_id_2",2);
		        puf15_buf_1="支票户";
		    }
		    
		    if (pl1_acct_attr == '6')
		     {
		        ret=SET_FIELD(null,"pl1_tctd_flag",6);
		        pl1_withdraw_way='1';
		        ret=DISPLAY_VARIABLE("pl1_withdraw_way",0);
		        ret=SET_FIELD(null,"pl1_withdraw_way",6);
		        puf15_buf_1="存折户";
		        ret=DISPLAY_VARIABLE("puf15_buf_1",0);
		        ret=SET_FIELD(null,"pluf9_psbk_id",1);
		     //   ret=SET_FIELD(null,"puf6_passwd_1",0);
		     //   ret=SET_FIELD(null,"pluf7_seal_id",0);
		      }
		    else
		    { 
		    //  pluf15_buf_1="";
		        pluf15_buf_2="";
		    //    pluf15_buf_3="";
		    //    puf15_buf_1="";
		    //    pl1_tctd_flag=null;
		    
		        //ret=DISPLAY_VARIABLE("pluf15_buf_1",2);
		        ret=DISPLAY_VARIABLE("pluf15_buf_2",0);
		        ret=DISPLAY_VARIABLE("pluf15_buf_3",0);
		    //    ret=DISPLAY_VARIABLE("puf15_buf_1",0);
		        ret=DISPLAY_VARIABLE("pl1_tctd_flag",0);
		    //    ret=SET_FIELD(null,"pluf7_seal_id",1);
		        ret=SET_FIELD(null,"pl1_tctd_flag",6);
		        ret=SET_FIELD(null,"pl1_withdraw_way",6);
		      //  ret=SET_FIELD(null,"puf6_passwd_1",0);
		      //  ret=PUT_DISPLAY_VARIABLE("puf6_passwd_1",0,"");
		    }
		        return true ;
		}