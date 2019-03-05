public boolean fun_cif_chk_cust_name(String ...args){
			String pluf18_cust_type = this.curTranSession.getVariableList().getValue("pluf18_cust_type");
			boolean ret;
			char pl1_cust_stat;
		    
		    if (pluf18_cust_type == null) /* 如果未输入证件号 */
		      {  ret = SET_FIELD(null,"pl1_cert_type",2); /* 证件类型不输 */
		      }
		    else  /* 如果输入证件号 */
		      {  ret = SET_FIELD(null,"pl1_cert_type",1); /* 证件类型必输 */
		         ret = SET_FIELD(null,"pl1_cust_stat",2);
		         pl1_cust_stat = '0';
		      }
		    return(true);
	}