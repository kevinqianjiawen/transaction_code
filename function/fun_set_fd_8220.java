/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据，8220 利息方式.
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_set_fd_8220(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        if(fpl1_sign_2.getValue().equals("0")){
        ret=SET_FIELD(0,"pluf13_rate",2);
        ret=SET_FIELD(0,"puf13_rate",2);
        ret=SET_FIELD(0,"pl1_sign_3",2);
        ret=SET_FIELD(0,"p13_acct_no_uncom",2);
        fpluf13_rate.setValue("0.0");
        fpuf13_rate.setValue("0.0");
        ret=DISPLAY_VARIABLE("pluf13_rate",0);
        ret=DISPLAY_VARIABLE("puf13_rate",0);
        return true;
        }else if(fpl1_sign_2.getValue().equals("3")){
        ret=SET_FIELD(0,"pluf13_rate",0);
        ret=SET_FIELD(0,"puf13_rate",1);
        ret=SET_FIELD(0,"pl1_sign_3",1);
        ret=SET_FIELD(0,"p13_acct_no_uncom",0);
        return true;
        }else if(fpl1_sign_2.getValue().equals("1")){
        ret=SET_FIELD(0,"pluf13_rate",0);
        ret=SET_FIELD(0,"puf13_rate",0);
        ret=SET_FIELD(0,"pl1_sign_3",0);
        ret=SET_FIELD(0,"p13_acct_no_uncom",0);
        return true;
        }else{
        return false;
        }

        }