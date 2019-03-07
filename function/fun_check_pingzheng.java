public boolean fun_check_pingzheng(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			String pl6_inst_no_3=this.curTranSession.getVariableList().getValue("pl6_inst_no_3");
			String orgnization_no=this.curTranSession.getVariableList().getValue("orgnization_no");
			 boolean ret;
			    if( pl6_inst_no_3 == orgnization_no )
			    {
			         ret = SET_FIELD(null,"pl3_vouch_type",1);
			         ret = SET_FIELD(null,"pluf10_vouch_id",1);
			         return( true );
			    }
			    else
			    {
			         ret = SET_FIELD(null,"pl3_vouch_type",0);
			         ret = SET_FIELD(null,"pluf10_vouch_id",0);
			         return true;
			    }
		}