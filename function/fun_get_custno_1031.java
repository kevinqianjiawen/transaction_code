		public boolean fun_get_custno_1031(){
			String puf18_ID_card_1 = this.curTranSession.getVariableList().getValue("puf18_ID_card_1");
			int type;
		    boolean ret;
		    String custno, tmp_str;
		    
		    type=19;
		    tmp_str=GetAutoMsg( type, puf18_ID_card_1 );
		    ret = PUT_DISPLAY_VARIABLE("pluf10_custom_id_2", 0, tmp_str );
		    
		    return true;
		}