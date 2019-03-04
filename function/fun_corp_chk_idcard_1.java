public boolean fun_corp_chk_idcard_1(String vertifyValue,String ...args){
			
			String puf18_ID_card_2=this.curTranSession.getVariableList().getValue("puf18_ID_card_2");
			 int len1;
			    boolean ret;
			    len1 = puf18_ID_card_2.length();
			    if(len1 == 0 || len1 == 18) {
			        if( len1 == 18){
			            ret = CifCheckCertNo( _user_work_data );
			            if(ret == false) {
			                return false;
			            } else {
			                return true;
			            }
			        } else {
			            return true;
			        }
			    } else { 
			        App.showFlashStateMsg("身份证号码长度错误,请重输");
			        return false;
			    }
		}