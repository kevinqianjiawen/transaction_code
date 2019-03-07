public boolean fun_dda_chk_amt(String vertifyValue, String...args) {
			logger.debug("进入OnVailidate事件处理，args[" + args + "]");
			//TODO 在下面编写处理代码
			
			money n;
		    n=STRING2MONEY(_user_work_data);
		    if (n >= $10000)
		    { 
		      return true;
		    }
		    else
		    { 
		    	App.showFlashStateMsg("开户金额必须大于或等于10000元!");
		    return false;
		    }
		}