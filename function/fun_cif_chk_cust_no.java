public boolean fun_cif_chk_cust_no(String ...args){
			String pl10_custom_id_1 = this.curTranSession.getVariableList().getValue("pl10_custom_id_1");
		
			 boolean ret;
			    
			    if (pl10_custom_id_1 == null) /* 如果未输入客户号 */
			      {  ret = SET_FIELD(null,"pl1_cust_stat",2); 
			      }
			    else  /* 如果输入客户号 */
			      {  ret = SET_FIELD(null,"pl1_cust_stat",1);
			      }
			    return(true);
	}