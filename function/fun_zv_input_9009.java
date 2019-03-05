public boolean fun_zv_input_9009(String ...args){
			String puf4_tlr_2=this.curTranSession.getVariableList().getValue("puf4_tlr_2");
			String l_tlr_no=this.curTranSession.getVariableList().getValue("l_tlr_no");
			int in_i=Integer.parseInt(this.curTranSession.getVariableList().getValue("in_i"));
			String _sup_no=this.curTranSession.getVariableList().getValue("_sup_no");
			String pl1_gb_flag_1=this.curTranSession.getVariableList().getValue("pl1_gb_flag_1");
			
			String pluf128_finger_1=this.curTranSession.getVariableList().getValue("pluf128_finger_1");
			String pluf128_finger_2=this.curTranSession.getVariableList().getValue("pluf128_finger_2");
			String pluf128_finger_3=this.curTranSession.getVariableList().getValue("pluf128_finger_3");
			String pluf128_finger_4=this.curTranSession.getVariableList().getValue("pluf128_finger_4");
			String pluf128_finger_5=this.curTranSession.getVariableList().getValue("pluf128_finger_5");
			String pluf128_finger_6=this.curTranSession.getVariableList().getValue("pluf128_finger_6");
			String pluf128_finger_7=this.curTranSession.getVariableList().getValue("pluf128_finger_7");
			String pluf128_finger_8=this.curTranSession.getVariableList().getValue("pluf128_finger_8");
			boolean ret;          
		    int kind, i,j,fk,flag;
		    String term_type,aux_num,qdfs, fingerwl1;
		    String zv_tlr_no,result,err_msg,temp;
		    String file_name,str;
		    String wlTz1,wlTz2,wlTz3,wlTz4;
		    int type;
		    String wl_mb1, wl_mb2, fingerwl, fingerwl2;
		    String result1,password;
		    //模拟数据
		    String _tx_code="9407";
		    //end
		        type  = 40;
		    //return( true );
		        if ( _tx_code.equals( "9407") )
		        {
		            fingerwl = GetAutoMsg( type, puf4_tlr_2 );
		        }
		        else
		        {
		            fingerwl = GetAutoMsg( type, l_tlr_no );
		        } 
		    //UserDialog(fingerwl);
		    //UserDialog("1");
		        if ( !(fingerwl.equals( "3" )) )
		        {      
		            if ( _tx_code .equals( "9000" ))
		            {
		                return true ;
		            }
		            if ( _tx_code .equals( "9407" ))
		            {
		                return true ;
		            }
		        }
		        if (! _sup_no.equals( "") )
		        {
		            fingerwl2 = GetAutoMsg( type, _sup_no );
		            if ( !(fingerwl2.equals( "3")  ))
		            {
		                if ( !(_tx_code.equals("9000")) )
		                {
		                    return true ;
		                }
		            }
		    
		        }
		    
		    if ( in_i <= 0 || in_i > 10 ) {
		      App.showFlashStateMsg( "传入参数错误" );
		      return false ;
		    }
		    
		    zv_tlr_no = puf4_tlr_2;
		    //UserDialog("2");
		    
		    //取终端类型
		    //term_type = GetTermType();
		    
		    //取指纹仪所接辅口
		    //kind = fun_tty_zv( the_tty );
		    kind = 4;
		  //  aux_num = INT2STRING( kind );
		    
		    flag = 0;
		    pl1_gb_flag_1 = "1";
		    //UserDialog(pl1_gb_flag_1);
		    //维尔指纹
		    if ( pl1_gb_flag_1 == "1" )
		    {
		      i = 1;
		      //err_msg = "按回车开始读取指纹......第" + INT2STRING(i) + "次";
		      err_msg = "按回车开始读取指纹......";
		      App.showFlashStateMsg( err_msg );
		      result = "error";
		    //  UserDialog( _tx_code );
		      // result = fun_get_zvWL( term_type, aux_num, "2" );
		      if ( _tx_code == "9030" )
		      {
		          result = fun_get_zvWL( "0", aux_num, "1" );
		      }
		      if (!( _tx_code.equals( "9030" )))
		      {
		          result = fun_get_zvWL( "0", aux_num, "2");
		      } 
		      if (!( result.equals( "error")) )
		      {
		        wlTz1 = result;
		        flag = 1; 
		      }
		      else
		      {
		        App.showFlashStateMsg( "指纹采集失败，请退出交易重新采集!!!" );
		        return false ;
		      }
		    }
		    if ( in_i == 1 ) {
		      if ( flag == 1 ) {
		        ret = PUT_DISPLAY_VARIABLE( "pluf12_buf",0,"采集成功" );
		        ret = SET_FIELD(null,"pluf12_buf",2);
		        pluf128_finger_1 = result[0..127];
		        pluf128_finger_2 = result[128..255];
		        pluf128_finger_3 = result[256..383];
		        pluf128_finger_4 = result[384..511];
		    
		    //    UserDialog(pluf128_finger_1);
		      }
		      else {
		        ret = PUT_DISPLAY_VARIABLE( "pluf12_buf",0,"采集失败" );
		        ret = SET_FIELD(null,"pluf12_buf",2);
		      }
		    }
		    
		    if ( in_i == 2 ) {
		      if ( flag == 1 ) {
		        //UserDialog( _tx_code );
		        if ( _tx_code ==  "9030" )
		        {
		            ret = PUT_DISPLAY_VARIABLE( "pluf12_buf_1",0,"采集成功" );
		            ret = SET_FIELD(null,"pluf12_buf_1",2);
		        }
		        if ( _tx_code ==  " "   )
		        {
		            ret = PUT_DISPLAY_VARIABLE( "_tlr_pwd",0,"111111" );
		            ret = SET_FIELD(null,"_tlr_pwd",2);
		        }
		        pluf128_finger_5 = result[0..127];
		        pluf128_finger_6 = result[128..255];
		        pluf128_finger_7 = result[256..383];
		        pluf128_finger_8 = result[384..511];
		    
		      }
		      else {
		        if ( _tx_code ==  "9030" )
		        {
		            ret = PUT_DISPLAY_VARIABLE( "pluf12_buf_1",0,"采集失败" );
		            ret = SET_FIELD(null,"pluf12_buf_1",2);
		        }
		        if ( _tx_code ==  ""  )
		        {
		            ret = PUT_DISPLAY_VARIABLE( "_tlr_pwd",0,"222222" );
		            ret = SET_FIELD(null,"_tlr_pwd",2);
		        }
		       // ret = PUT_DISPLAY_VARIABLE( "pluf12_buf_1",0,"采集失败" );
		       // ret = SET_FIELD(null,"pluf12_buf_1",2);
		      }
		    }
		    
		    if ( in_i == 3 ) {
		      if ( flag == 1 ) {
		    //    UserDialog("3");
		        
		        type  = 40;
		    //    UserDialog( l_tlr_no );
		        if ( _tx_code == "9407" )
		        {
		            fingerwl = GetAutoMsg( type, puf4_tlr_2 );
		        }
		        else
		        {
		            fingerwl = GetAutoMsg( type, l_tlr_no );
		        } 
		    
		        if ( fingerwl <> "3")
		        {
		            return( true ); 
		        }
		        /*type = 40;
		        UserDialog( l_tlr_no );
		        fingerwl = GetAutoMsg( type, l_tlr_no ); 
		        */
		        pluf128_finger_1 = result[0..127];
		        pluf128_finger_2 = result[128..255];
		        pluf128_finger_3 = result[256..383];
		        pluf128_finger_4 = result[384..511];
		    
		        //UserDialog( fingerwl );
		        ret = PUT_DISPLAY_VARIABLE( "_tlr_pwd",0,"111111" );
		        ret = PUT_DISPLAY_VARIABLE( "_sup_pwd",0,"111111" );
		        //ret = SET_FIELD(null,"_tlr_pwd",2);
		      }
		      else {
		        ret = PUT_DISPLAY_VARIABLE( "_tlr_pwd",0,"222222" );
		        ret = PUT_DISPLAY_VARIABLE( "_sup_pwd",0,"222222" );
		        //ret = SET_FIELD(null,"_tlr_pwd",2);
		      }
		    }
		    
		    if ( in_i == 4 ) {
		      if ( flag == 1 ) {
		        
		    //    type  = 40;
		    //    UserDialog( l_tlr_no );
		    //    fingerwl = GetAutoMsg( type, l_tlr_no ); 
		    
		    //    if ( fingerwl <> "3")
		    //    {
		    //        return( true ); 
		    //    }
		        type = 41;
		        //UserDialog( l_tlr_no );
		        //UserDialog( orgnization_no );
		        result1 = orgnization_no + _sup_no + result;
		        fingerwl1 = GetAutoMsg( 41, result1 );
		        if ( fingerwl1 == null )
		        {
		            App.showFlashStateMsg( "授权失败");
		            return false ;
		            ret = PUT_DISPLAY_VARIABLE( "_sup_pwd",0,"" );
		          //ret = PUT_DISPLAY_VARIABLE ( "pluf19_card_no_1", 0, null ) ;
		        }
		        if ( fingerwl1[0] == 'O'  )
		        {
		        	App.showFlashStateMsg( "授权成功" );
		            password = fingerwl1[1..6];
		            ret = PUT_DISPLAY_VARIABLE( "_sup_pwd",0,password );
		            //ret = SET_FIELD(null,"_tlr_pwd",2);
		        }
		      }
		    }
		    return true ;
		}