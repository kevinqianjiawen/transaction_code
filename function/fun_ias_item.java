/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue 需要验证的数据
 * 如果科目为1211.2412,则发生额不能输
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_ias_item(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        boolean ret;
        //获取值，截取字符串
        String a=fpl8_item_id.getValue().substring(0,4);
        if((a.equals("1211"))||a.equals("2412"))
        {
        ret=SET_FIELD(null,"pluf15_amount_1",2);
        ret=PUT_DISPLAY_VARIABLE("pluf15_amount_1",0,"0.00");
        }
        else
        {
        ret=SET_FIELD(null,"pluf15_amount_1",2);
        }
        return true;
        }