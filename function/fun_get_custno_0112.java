public boolean fun_get_custno_0112(String vertifyValue,String ...args){
			String  pluf18_telcode_6 = this.curTranSession.getVariableList().getValue("pluf18_telcode_6");
			int type;
		    boolean ret;
		    String custno, tmp_str;
		    
		    type=19;
		    tmp_str=GetAutoMsg( type, pluf18_telcode_6 );
		    ret = PUT_DISPLAY_VARIABLE("pl10_custom_id_2", 0, tmp_str );
		    
		    return true;
				}