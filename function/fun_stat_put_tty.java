public boolean fun_stat_put_tty(){
			boolean ret;
		    string tmp_str;
		    int num;
		    int aux_type;
		    string finger_type;
		    
		    the_tty = thistty();
		    /*添加浙江农行 */
		    ret = GETSYSVERSION();
		    return(true);
		    /*end*/
		    //取指纹仪类型，hzq added on 2007-10-25
		    //暂定：1、维尔   2、浙泰
		    $select aux into $aux_type from "t_cis_tty_aux.nbdb"
		    where ttyname == the_tty;
		    
		    if ( aux_type == 1 )
		    {
		      pl1_gb_flag_1 = "1";
		    }
		    else
		    {
		      if ( aux_type == 2 )
		      {
		        finger_type = "2";
		      }
		      else  //默认
		      {
		        finger_type = "1";
		      }
		    }
		    
		    $declare curs_fx cursor for
		      select Summary 
		       from "t_cis_summary.nbdb"
		      where SumNo=="fx";
		    $open cursor curs_fx;
		    num = RECNUMOFCURSOR("curs_fx");
		    if ( num != 1 ) {
		       tmp_str = "YUCC";
		       $close cursor curs_fx;
		       $drop cursor curs_fx;
		    }
		    else {
		       $fetch curs_fx
		         into $tmp_str;
		       $close cursor curs_fx;
		       $drop cursor curs_fx;
		    }
		    
		    pluf6_bank_no_2=tmp_str[0..3];
		    
		    //前台版本号
		    //card_type_3 = get_ver_no();
		    //UserDialog( ver_no );
		    
		    return true;
		}