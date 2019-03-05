/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_get_certid(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        int type;
        boolean ret;
        String tmp_str;

        type=10;
        //tmp_str="123456";
        String puf18_ID_card_2=fpuf18_ID_card_2.getValue();
        tmp_str=GetAutoMsg( type,pluf10_custom_id_1 );//GetAutoMsg方法未知
        if(!puf18_ID_card_2.equals(tmp_str))
        {
        App.showFormStatus("证件号输入不正确");
        return false;
        }
        return true;
        }