/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值 参数 string var_name
 * @author cao
 */
public boolean rec_name_new(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //形参
        String var_name;
        // TODO 在下面编写处理代码
        String tmp_name;
        String acctno;
        boolean ret;
        int type;

        type=1;
        acctno=fpluf18_acct_no_1.getValue();
        tmp_name=GetAutoMsg(type,acctno);
        ret=PUT_DISPLAY_VARIABLE(var_name,0,tmp_name);

        return true;
        }