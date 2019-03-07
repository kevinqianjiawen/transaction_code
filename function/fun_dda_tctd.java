public boolean fun_dda_tctd(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			boolean ret;
			char pl1_tctd_flag;
		    
		    if (pl1_tctd_flag == '0')             //不通兑
		     {
		        ret=SET_FIELD(null,"puf6_passwd_1",2);
		    //    ret=SET_FIELD(null,"pluf7_seal_id",1);
		      }
		    else                                 //通兑
		    {    
		      //  ret=PUT_DISPLAY_VARIABLE("pluf7_seal_id",0,"");     add by hou 
		    //    ret=SET_FIELD(null,"pluf7_seal_id",2); //       印鉴不可输   
		        ret=SET_FIELD(null,"puf6_passwd_1",0);     //密码必输
		     //   ret=PUT_DISPLAY_VARIABLE("puf6_passwd_1",0,"");
		    }
		        return true ;
		}