
/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据,判断科目是否是表外科目，如果是的话，作出提示.
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_8120_is0607(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        // 获取输入的值
        String get_fpl8_item_id=fpl8_item_id.getValue();
        if(get_fpl8_item_id.substring(0,2).equals("06")
        ||get_fpl8_item_id.substring(0,2).equals("07")){
        JOptionPane.showMessageDialog(null,"对不起，表外科目请使用交易8126",
        "消息提示",JOptionPane.WARNING_MESSAGE);
        return false;
        }
        return true;
        }