public boolean fcl_1081_ddl(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			String orgnization_no=this.curTranSession.getVariableList().getValue("orgnization_no:");
			boolean ret;
		    
		    ret = PUT_DISPLAY_VARIABLE("pl6_inst_no_1",0,orgnization_no);
		    
		    return true;
		}