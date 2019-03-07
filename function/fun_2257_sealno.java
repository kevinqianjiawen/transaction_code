	public boolean fun_2257_sealno(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			
			String str;
		    int sealno;
		    boolean ret;
		    String puf10_vouch_id_2 = this.curTranSession.getVariableList().getValue("puf10_vouch_id_2");
		    sealno =   Integer.parseInt(puf10_vouch_id_2);
		    str = sealno+"";
		    ret = PUT_DISPLAY_VARIABLE("puf10_vouch_id_2", 0, str);
		    //ret = SET_FIELD(str, "puf10_vouch_id_2", 2);
		    //UserDialog(puf10_vouch_id_2);
		    return ret;
		}