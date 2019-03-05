public  boolean fun_exec_local_signon(String...args){
			string cmd, file;
		    boolean ret;
		    string inst_no;
		    _tlr_no = l_tlr_no;
		    orgnization_no = lorgnization_no;
		    
		    // wyx added 2004.01.12  检查柜员,防止前台无柜员时每笔交易流水号为0
		    $select inst_no into $inst_no
		       from "teller"
		      where tlr_no == _tlr_no;
		    if( RETURNVALUEOFSQL() <= 0 ) {
		        App.showFlashStateMsg( "无此柜员!" );
		        return false ;
		    }
		    else {
		        if( inst_no <> orgnization_no ) {
		        	App.showFlashStateMsg( "非法柜员!" );
		            return false ;
		        }
		    }   // wyx added end 04.01.12
		    
		    cmd=thistty()+_tlr_no;
		    ret = File_Exist(cmd);
		    if( ret == true ){
		        puf1_acct_status = "1";
		    }
		    else{
		        puf1_acct_status = "0";
		    }
		    return true ;
		}