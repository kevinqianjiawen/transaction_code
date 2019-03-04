/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_chk_passwd_2(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String puf6_passwd_9=fpuf6_passwd_9.getValue();
        String puf6_passwd_1=fpuf6_passwd_1.getValue();
        int result=puf6_passwd_1.compareTo(puf6_passwd_9);
        if ( result != 0 ){
        App.showFormStatus("您输入的密码前后不一致!请再输一遍!");
        ret = PUT_DISPLAY_VARIABLE("puf6_passwd_9",0,"");//该段代码含义不明，去掉不影响操作
        return false;
        }
        return true;
        }