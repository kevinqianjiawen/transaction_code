public boolean fun_sav_is_book_chk(String ...args){
			boolean ret;
			char p1_with_book;
		    
		    ret = SET_FIELD(null,"pluf20_name_2",2);
		    //ret = SET_FIELD(null,"puf10_vouch_id_8",2);
		    //ret = SET_FIELD(null,"pluf13_amount_4",2);
		    if (p1_with_book == '0')  // No book
		      {  ret = SET_FIELD(null,"pluf20_name_2",1 );
		         ret = SET_FIELD(null,"puf10_vouch_id_8",2);
		      }
		    else
		      { 
		         ret = SET_FIELD(null,"puf10_vouch_id_8",1);
		    //     ret = SET_FIELD(null,"pluf13_amount_4",1);
		      }
		    
		    return true;
	}
