public boolean fcl_1061_0(){
			boolean ret;
			 String pl1_flag = this.curTranSession.getVariableList().getValue("pl1_flag");
		    if ( pl1_flag == "1" )
		       {
		          ret = SET_FIELD(null,"puf13_gen_amount_1",5);
		       }
		    return true;
		      
		}