public boolean fun_cif_chk_cust_name(String ...args){
			String pluf40_name_2 = this.curTranSession.getVariableList().getValue("pluf40_name_2");
			char pl1_cust_stat  ;
		
			 boolean ret;
			    
			    if (pluf40_name_2 != null) /* 如果输入客户名 */
			      {  ret = SET_FIELD(null,"pl1_cust_stat",2);
			         pl1_cust_stat = '0';
			      }
			    return(true);
	}
