public boolean fun_yingyezhizhao(JComponent source) {
			logger.debug("进入OnExiting事件处理，args[" + source + "]");
			//TODO 在下面编写处理代码
			int pl1_cert_type =Integer.parseInt(this.curTranSession.getVariableList().getValue("pl1_cert_type"));
			String puf18_ID_card_1 =this.curTranSession.getVariableList().getValue("puf18_ID_card_1");
			String pl18_custom_id =this.curTranSession.getVariableList().getValue("pl18_custom_id");
			switch (pl1_cert_type ){
		case 3: if(puf18_ID_card_1 != pl18_custom_id)
	              {
	               App.showFlashStateMsg("上下营业执照号不符，请重新输入");
	               return false;
	               }
	        }
	    return true ;
		}