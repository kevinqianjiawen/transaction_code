public boolean fun_corp_chk_idcard(String vertifyValue,String ...args){
			String pluf40_name_1 = this.curTranSession.getVariableList().getValue("pluf40_name_1");
			String puf18_ID_card_2 = this.curTranSession.getVariableList().getValue("puf18_ID_card_2");
			int len;
		    int len1;
		    boolean ret;
		    
		    len = pluf40_name_1.length();
		    if (len == 0 || len == 18) {
		        if (len == 18) {
		            ret = CifCheckCertNo( _user_work_data );
		            if (ret == false) { 
		                return false ;
		            } else {
		                return true ;
		            }
		        } else {
		            return true;
		        }
		    } else {
		            App.showFlashStateMsg("身份证号码长度错误,请重输");
		            return false;
		    }
		    len1 = puf18_ID_card_2.length();
		    if(len1 == 0 || len1 == 15 || len1 == 18){ return true; }
		    else
		    { App.showFlashStateMsg("身份证号码长度错误,请重输");
		    return false;
		    }
		}
