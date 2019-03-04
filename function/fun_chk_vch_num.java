/**
 * 说明：当组件将要失去焦点时触发该事件
 * 检查凭证号是否超出最大整型值, 数量必须大于0
 *
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_chk_vch_num(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        int vch_endno=0;
        try{
        int a=Integer.parseInt(fpuf6_num_2.getValue());
        int b=Integer.parseInt(fpuf10_vouch_id_5.getValue());
        int c=Integer.parseInt(fpluf85_buf.getValue());
        if(a<=0){
        JOptionPane.showMessageDialog(null,"凭证数量必须大于0",
        "消息提示",JOptionPane.WARNING_MESSAGE);
        fpuf6_num_2.setFocus(true);
        return false;
        }
        if(null!=fpuf10_vouch_id_5.getValue()){
        vch_endno=b+a-1;
        }
        if(vch_endno!=c){
        JOptionPane.showMessageDialog(null,"凭证数量与起止凭证号不符",
        "消息提示",JOptionPane.WARNING_MESSAGE);
        fpuf6_num_2.setFocus(true);
        return false;
        }
        // 联动收取手续费时使用(未测试)
        //fpl1_sign_4.setValue("9402");

        return true;

        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"输入异常","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;

        }

        }