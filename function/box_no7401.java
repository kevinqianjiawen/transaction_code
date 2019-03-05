/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * 根据7401交易生成报表情况决定尾箱输入状态
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean box_no7401(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret=false;
        if(fpl2_sport_name_1.getValue().equals("03")){
        ret=PUT_DISPLAY_VARIABLE("p4_box_no_1",0,"");
        ret=SET_FIELD(null,"p4_box_no_1",2);
        }else{
        ret=SET_FIELD(null,"p4_box_no_1",1);
        }
        return true;
        }