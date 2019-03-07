public boolean fun_sav_draw_way(){
			boolean ret;
		    String _tx_code;
		    String pl1_draw_mode=this.curTranSession.getVariableList().getValue("pl1_draw_mode");
		    /* sav_passwd -> passwd_1 by LYP 10.12 */
		    
		    //     ret = SET_FIELD(null,"puf18_ID_card_1",0);
		    //     ret = PUT_DISPLAY_VARIABLE("puf18_ID_card_1",0,"");
		    if (!(pl1_draw_mode.equals("1")))
		    {  ret = PUT_DISPLAY_VARIABLE("puf6_passwd_2",0,"");
		       if( _tx_code.equals("1012") )
		       {
		           ret = PUT_DISPLAY_VARIABLE("puf6_passwd_4", 0, "");
		       }
		    }
		    if (!(pl1_draw_mode.equals( "2")))
		    {  ret = PUT_DISPLAY_VARIABLE("p4_sign_id_2",0,"");
		    }
		    if (pl1_draw_mode.equals("0"))
		      {  ret = SET_FIELD(null,"puf6_passwd_2",2);
		         if( _tx_code.equals("1012") )
		         {
		             ret = SET_FIELD(null,"puf6_passwd_4",2);
		         }
		         ret = SET_FIELD(null,"p4_sign_id_2",2);
		      }
		    if (pl1_draw_mode.equals("1"))
		      {  ret = SET_FIELD(null,"puf6_passwd_2",1);
		         if( _tx_code.equals( "1012") )
		         {
		             ret = SET_FIELD(null, "puf6_passwd_4", 0 );
		         }
		         ret = SET_FIELD(null,"p4_sign_id_2",2);
		      }
		    if (pl1_draw_mode.equals("2"))
		      {  ret = SET_FIELD(null,"puf6_passwd_2",2);
		         if( _tx_code.equals( "1012") )
		         {
		             ret = SET_FIELD(null, "puf6_passwd_4", 2);
		         }
		         ret = SET_FIELD(null,"p4_sign_id_2",1);
		      }
		    if (pl1_draw_mode.equals("3"))
		      {  ret = SET_FIELD(null,"puf6_passwd_2",2);
		         ret = SET_FIELD(null,"p4_sign_id_2",2);
		    //     ret = SET_FIELD(null,"puf18_ID_card_1",1);
		      }
		    if( pl3_sav_kind_2.equals("014") )           //add by hou 
		    {
		         ret = SET_FIELD(null,"p4_sign_id_2", 1);
		    //     ret = SET_FIELD(null,"pluf13_amount_4", 2 );  add by chj
		         return true ;
		    }
		    else
		    {   
		       if( pl1_draw_mode.equals( "2") )
		        {
		         ret = SET_FIELD(null,"p4_sign_id_2", 1);
		         return true ;
		        }
		        else{
		    //     ret = SET_FIELD(null,"pluf13_amount_4",1);    add by chj 
		         ret = SET_FIELD(null,"p4_sign_id_2",2);
		         return  true ;
		        }
		    }
		    return true;
		      
		}