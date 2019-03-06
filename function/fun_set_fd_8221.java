/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_set_fd_8221(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        boolean ret;
        String a=fpl1_sign_2.getValue();
        if(a.equals("0")){
        ret=SET_FIELD(0,"pluf13_rate",2);
        ret=SET_FIELD(0,"puf13_rate",2);
        ret=SET_FIELD(0,"pl1_sign_3",2);
        pluf13_rate=0.0;
        puf13_rate=0.0;
        ret=DISPLAY_VARIABLE("pluf13_rate",0);
        ret=DISPLAY_VARIABLE("puf13_rate",0);
        return true;
        }else if(a.equals("3")){
        ret=SET_FIELD(0,"pluf13_rate",1);
        ret=SET_FIELD(0,"puf13_rate",0);
        ret=SET_FIELD(0,"pl1_sign_3",1);
        return true;
        }else if(a.equals("1")){
        ret=SET_FIELD(0,"pluf13_rate",0);
        ret=SET_FIELD(0,"puf13_rate",0);
        ret=SET_FIELD(0,"pl1_sign_3",0);
        return true;
        }else{
        return false;
        }
        }