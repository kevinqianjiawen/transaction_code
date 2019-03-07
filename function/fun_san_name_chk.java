public boolean fun_san_name_chk(){
			boolean ret;
		    String pluf20_name_1=this.curTranSession.getVariableList().getValue("pluf20_name_1");
		    if( pluf20_name_1.length() == 0 )
		    {
		        ret = SET_FIELD( null, "puf6_passwd_6", 2 );
		        ret = SET_FIELD( null, "puf18_ID_card_2", 2 );
		    }
		    else
		    {
		        ret = SET_FIELD( null, "puf18_ID_card_2", 1 );
		    }
		    return  true ;
		      
		}