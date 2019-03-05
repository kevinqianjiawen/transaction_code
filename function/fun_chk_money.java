/**
 * 说明：当组件将要失去焦点时触发该事件，金额必须大于0。
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_chk_money(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        int a=0;
        try{
        // 获取前端的值
        a=Integer.parseInt(fpluf15_amount_1.getValue());

        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"输入异常","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;
        }
        if(a>0){
        return true;
        }else{
        if((fp1_vch_type.getValue().equals("6"))
        ||(fp1_vch_type.getValue().equals("7")))
                /*工本费和邮电费允许为负数*/{
        return true;
        }else{
        JOptionPane.showMessageDialog(null,"不可为负数","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;
        }
        }
        }