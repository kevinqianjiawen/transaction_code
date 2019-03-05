/**
 * 说明：当组件失去焦点后触发该事件
 * @param ... 用户自定义参数值
 */
public boolean fun_dda_chk_payway(String...args) {
        logger.debug("进入OnExit事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String pl1_pay_way=fpl1_pay_way.getValue();
        //String _tx_code="2414";变量获取方式未知
        String pluf10_custom_id_1=fpluf10_custom_id_1.getValue();
        if (pl1_pay_way.equals("1"))
        {
        if ( (!_tx_code.equals("2415")) && (!_tx_code.equals("2416")) && (!_tx_code.equals("2425")) )
        {
        /*       ret=SET_FIELD(null,"pluf7_psbk_id",0);     */
        if( _tx_code.equals("2414") && pluf10_custom_id_1.substring(0,1).equals("1") )
        {
        //ret=SET_FIELD(null,"pluf6_passwd",1);
        fpluf6_passwd.setValue("1");
        }
        else
        {
        //ret=SET_FIELD(null,"pluf6_passwd",2);
        fpluf6_passwd.setValue("2");
        }
        }
        if( _tx_code.equals("2414") )
        {
        //ret=SET_FIELD(null,"p14_acctserino",1);
        fp14_acctserino.setValue("1");
        }
        //    ret=SET_FIELD(null,"p14_acctserino",1);
        }
        else
        {
        if ( (!_tx_code.equals("2415")) && (!_tx_code.equals("2416")) && (!_tx_code.equals("2425"))  )
        {
		    /*        ret=PUT_DISPLAY_VARIABLE("pluf7_psbk_id",0,"");
		            ret=SET_FIELD(null,"pluf7_psbk_id",2); */
        //ret=PUT_DISPLAY_VARIABLE("pluf6_passwd",0,"");
        //ret=SET_FIELD(null,"pluf6_passwd",2);
        fpluf6_passwd.setValue("2");
        }
        ret=PUT_DISPLAY_VARIABLE("p14_acctserino",0,"");//具体方法逻辑未知
        //ret=SET_FIELD(null,"p14_acctserino",2);
        fp14_acctserino.setValue("2");
        }

        return true;
        }