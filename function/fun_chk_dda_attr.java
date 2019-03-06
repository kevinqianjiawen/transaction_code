/**
 * 说明：当组件失去焦点后触发该事件
 * @param ... 用户自定义参数值
 */
public boolean fun_chk_dda_attr(String...args) {
        logger.debug("进入OnExit事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String pl1_acct_attr=fpl1_acct_attr.getValue();
        if (pl1_acct_attr.equals("5"))
        {
        //ret=SET_FIELD(null,"pl1_tctd_flag",6);
        fpl1_tctd_flag.setValue("6");
        fpl1_withdraw_way.setValue("1");
        ret=DISPLAY_VARIABLE("pl1_withdraw_way",0);
        //ret=SET_FIELD(null,"pl1_withdraw_way",2);
        fpl1_withdraw_way.setValue("2");
        }
        else
        {
        //  pl1_tctd_flag=null;

        ret=DISPLAY_VARIABLE("pl1_tctd_flag",0);
        //ret=SET_FIELD(null,"pl1_tctd_flag",6);
        fpl1_tctd_flag.setValue("6");
        //ret=SET_FIELD(null,"pl1_withdraw_way",6);
        fpl1_withdraw_way.setValue("6");
        }
        return true;

        }
