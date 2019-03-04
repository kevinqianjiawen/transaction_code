/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_chk_passwd_3(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String puf6_passwd_1=fpuf6_passwd_1.getValue();
        //int _stn_id=100;界面无法获取
        if ( _stn_id < Integer.parseInt("099") ) {
        return true;
        }
        //String _user_work_data="123456";界面无法获取疑似正确密码
        if (puf6_passwd_1 == "" ) {
        if (_user_work_data == "" ) {
        return true;
        }
        puf6_passwd_1 = _user_work_data;
        _user_work_data = "" ;
        App.showFormStatus("请再输入一次密码");
        return false;
        }  // end_if ( puf6_paaaswd_1 )
        if (puf6_passwd_1 != _user_work_data) {
        App.showFormStatus("密码有误,请重新输入!");
        _user_work_data = "";
        puf6_passwd_1="";
        return false;
        }
        return true;
        }

        }
