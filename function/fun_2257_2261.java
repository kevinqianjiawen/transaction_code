public boolean fun_2257_2261(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			boolean ret;
			char yes_no;
		    if(yes_no == '0')
		    {
		        ret = SET_FIELD(null,"pl6_inst_no_3",2);
		        ret = SET_FIELD(null,"pl2_curr_id_2",2);
		        ret = SET_FIELD(null,"pl3_prod_id_2",2);
		        ret = SET_FIELD(null,"pl4_seq_1",2);
		        ret = SET_FIELD(null,"pl2_chk_no_1",2);
		        ret = SET_FIELD(null,"pl22_acct_no_1",0);
		    }
		    if(yes_no == '1')
		    {
		        ret = SET_FIELD(null,"pl6_inst_no_3",1);
		        ret = SET_FIELD(null,"pl2_curr_id_2",1);
		        ret = SET_FIELD(null,"pl3_prod_id_2",1);
		        ret = SET_FIELD(null,"pl4_seq_1",1);
		        ret = SET_FIELD(null,"pl2_chk_no_1",1);
		        ret = SET_FIELD(null,"pl22_acct_no_1",2);
		    }
		    return true;
		}