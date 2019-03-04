/**
 * 说明：当组件失去焦点后触发该事件
 * @param ... 用户自定义参数值
 */
public boolean fun_chk_cash(String...args) {
        logger.debug("进入OnExit事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String p1_cash_transf= fp1_cash_transf.getValue();
        if ( p1_cash_transf.equals("0")) {
        //fdda_summ.setValue("06");
        /ret = SET_FIELD( 0, "pluf4_act_num", 6 );//猜测是更改摘要类型
        }else{
        //fdda_summ.setValue("02");
        ret = SET_FIELD( 0, "pluf4_act_num", 2 );
        }
        return true;
        }