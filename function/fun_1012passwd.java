public boolean fun_1012passwd(String ...args){
			String aaa= this.curTranSession.getVariableList().getValue("puf6_passwd_2");
			int puf6_passwd_2[]=new int[6];
			for(int i =0;i<6;i++){
				puf6_passwd_2[i]=aaa.charAt(i);
			}
			 if (puf6_passwd_2[0] == puf6_passwd_2[1] && puf6_passwd_2[0] == puf6_passwd_2[2]
			         && puf6_passwd_2[0] == puf6_passwd_2[3] )
			        {
			     if ( puf6_passwd_2[0] == puf6_passwd_2[4] && puf6_passwd_2[0] == puf6_passwd_2[5] )
			          {
			        App.showFlashStateMsg("客户密码过于简单 提示客户修改密码后再办理");
			            return false;
			        }
			    }
				return true;
	}