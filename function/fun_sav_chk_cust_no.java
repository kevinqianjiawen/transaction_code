public boolean fun_sav_chk_cust_no(){
			boolean ret;
		    String tmp_name;
		    String pluf10_custom_id_2=this.curTranSession.getVariableList().getValue("pluf10_custom_id_2");
		    String _tlr_no=this.curTranSession.getVariableList().getValue("_tlr_no");
		    if (pluf10_custom_id_2 != null) /* 如果输入客户号 */
		    {
		    /*  ret = PUT_DISPLAY_VARIABLE("pluf20_name_2",0,"");  清客户名 
		      ret = PUT_DISPLAY_VARIABLE("pluf30_cust_addr_2",0,"");  清地址 */
		      ret = custname ();
		    }
		    
		    if (pluf10_custom_id_2 == null) /* 如果未输入客户号 */
		      {  ret = SET_FIELD(null,"pluf20_name_2",1); /* 客户名必输 */
		    //   ret = SET_FIELD(null,"pluf30_cust_addr_2",1); /* 客户地址必输 */
		         ret = SET_FIELD(null,"puf18_ID_card_1",1); /* 身份证必输 */
		      }
		    else  /* 如果输入客户号 */
		      {  ret = SET_FIELD(null,"pluf20_name_2",2); /* 客户名不能输 */
		         ret = SET_FIELD(null,"pluf30_cust_addr_2",2); /* 客户地址不能输 */
		      }
		    /*add by chao 20131230 判断该客户号是否是本行柜员*/
		    tmp_name = GetAutoMsg( 94, _tlr_no + pluf10_custom_id_2);
		    if( _tlr_no == tmp_name )
		    {
		    	App.showFlashStateMsg("该账号的户主为当前柜员,不可以给自己做业务.");
		        return false;
		    }
		    /*add by chao 20131230 判断该客户号是否是本行柜员*/
		    return true;
		}