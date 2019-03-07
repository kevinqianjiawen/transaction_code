public boolean fun_passwd_2(){
			boolean ret;
			String pluf20_name_1=this.curTranSession.getVariableList().getValue("pluf20_name_1");
			String pl1_draw_mode=this.curTranSession.getVariableList().getValue("pl1_draw_mode");
			char pl1_tctd_flag_2;
			
		    /* sav_passwd -> puf6_passwd_5 by LYP 10.12 */
		    /*2->1 modify by mxc 2002/09/11*/
		    
		    if( pluf20_name_1!= null )
		    {
		         ret = SET_FIELD(null,"puf18_ID_card_2",1);
		    }
		    ret = SET_FIELD(null,"puf18_ID_card_1",1);
		    //ret = PUT_DISPLAY_VARIABLE("puf18_ID_card_1",0,"");
		    if (pl1_draw_mode != "1")
		    {  ret = PUT_DISPLAY_VARIABLE("puf6_passwd_5",0,"");
		       ret = PUT_DISPLAY_VARIABLE("puf6_passwd_6",0,"");
		       //   ret = PUT_DISPLAY_VARIABLE("sav_chk_passwd",0,"");
		    }
		    //if (pl1_draw_mode <> "2")
		    //{  ret = PUT_DISPLAY_VARIABLE("p4_sign_id_2",0,"");
		    //}
		    if (pl1_tctd_flag_2=='1' && pl1_draw_mode=="2") 
		      {  App.showFlashStateMsg("通存通兑不允许输入印鉴!");
		         return false;
		      }
		    if (pl1_draw_mode.equals("0"))
		      {  ret = SET_FIELD(null,"puf6_passwd_5",2);
		           ret = SET_FIELD(null,"puf6_passwd_6",2);
		    //     ret = SET_FIELD(null,"sav_chk_passwd",2);
		    //     ret = SET_FIELD(null,"p4_sign_id_2",2);
		      }
		    if (pl1_draw_mode.equals("1"))
		      {  ret = SET_FIELD(null,"puf6_passwd_5",1);
		         if( pluf20_name_1 != null )
		         {
		             ret = SET_FIELD(null,"puf6_passwd_6",1);
		         }
		    //     ret = SET_FIELD(null,"sav_chk_passwd",1);
		    //     ret = SET_FIELD(null,"p4_sign_id_2",2);
		      }
		    if (pl1_draw_mode.equals("2"))
		      {  ret = SET_FIELD(null,"puf6_passwd_5",2);
		    
		         ret = SET_FIELD(null,"puf6_passwd_6",2);
		    //     ret = SET_FIELD(null,"sav_chk_passwd",2);
		    //     ret = SET_FIELD(null,"p4_sign_id_2",1);
		      }
		    if (pl1_draw_mode.equals("3"))
		      {  ret = SET_FIELD(null,"puf6_passwd_5",2);
		         ret = SET_FIELD(null,"puf6_passwd_6",2);
		    //     ret = SET_FIELD(null,"sav_chk_passwd",2);
		    //     ret = SET_FIELD(null,"p4_sign_id_2",2);
		         ret = SET_FIELD(null,"puf18_ID_card_1",1);
		         if( pluf20_name_1 != null )
		         {
		              ret = SET_FIELD(null,"puf18_ID_card_2",1);
		         }
		      }
		      
		}