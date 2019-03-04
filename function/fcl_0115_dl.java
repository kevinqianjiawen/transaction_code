public boolean fcl_0115_dl(String ...args){
			boolean ret;
		    
			
			String pl1_cert_type = this.curTranSession.getVariableList().getValue("pl1_cert_type");
			String pl1_flag =this.curTranSession.getVariableList().getValue("pl1_flag");
	   
			if(pl1_flag.equals("1")){
	    	 	if(pl1_cert_type.equals("2")||pl1_cert_type.equals("8")|pl1_cert_type.equals("9")
		    		||pl1_cert_type.equals("a")||pl1_cert_type.equals("7")||pl1_cert_type.equals("b")){
		    		App.showFlashStateMsg("由于身份类别选择1-中国居民,请将证件类型更改为0,1,7,6");
		    		return false;
		    	}
	    	}else if(pl1_flag.equals("2")){
	    		if(pl1_cert_type.equals("0")||pl1_cert_type.equals("4")||pl1_cert_type.equals("1")
	    				||pl1_cert_type.equals("7")
	        		||pl1_cert_type.equals("8")||pl1_cert_type.equals("b")){
	        		App.showFlashStateMsg("由于身份类别选择1-中国居民,请将证件类型更改为2,8,a,6");
	        		return false;
	        	}
	    	}else if(pl1_flag.equals("3")){
	    		if(pl1_cert_type.equals("0")||pl1_cert_type.equals("1")||pl1_cert_type.equals("2")
	    				||pl1_cert_type.equals("8")
	        		||pl1_cert_type.equals("b")||pl1_cert_type.equals("7")){
	        		App.showFlashStateMsg("由于身份类别选择1-中国居民,请将证件类型更改为9,a,6");
	        		return false;
	        	}
	    	}else if(pl1_flag.equals("4")){
	    		if(pl1_cert_type.equals("0")||pl1_cert_type.equals("1")||pl1_cert_type.equals("2")||
	    				pl1_cert_type.equals("6")
	        		||pl1_cert_type.equals("7")||pl1_cert_type.equals("8")||pl1_cert_type.equals("a")){
	        		App.showFlashStateMsg("由于身份类别选择1-中国居民,请将证件类型更改为b");
	        		return false;
	        	}
	    	}else if(pl1_flag.equals("5")){
	    		if(pl1_cert_type.equals("0")||pl1_cert_type.equals("1")||pl1_cert_type.equals("2")
	        		||pl1_cert_type.equals("7")||pl1_cert_type.equals("8")||pl1_cert_type.equals("9")||
	        			pl1_cert_type.equals("a")||pl1_cert_type.equals("b")){
	        		App.showFlashStateMsg("由于身份类别选择1-中国居民,请将证件类型更改为1,6");
	        	}
	    	}
	    return true ;  
		}
		