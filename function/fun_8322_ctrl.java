/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_8322_ctrl(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        if(fpl1_acct_type.getValue().equals("0")){
        if(!fpl8_item_id.getValue().equals("21570200")
        &&!fpl8_item_id.getValue().equals("21209900")){
        JOptionPane.showMessageDialog(null,
        "付出现金时只能从应解汇款-21570200或其他应付及暂收款-21209900付出！",
        "消息提示",JOptionPane.WARNING_MESSAGE);
        return false;
        }
        }
        return true;
        }