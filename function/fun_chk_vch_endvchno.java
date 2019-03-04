/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_chk_vch_endvchno(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        String get_fpuf10_vouch_id_5=fpuf10_vouch_id_5.getValue();
        // 异常处理
        int a=0;
        int b=0;
        try{
        // 起始号
        a=Integer.parseInt(get_fpuf10_vouch_id_5);
        // 尾号
        b=Integer.parseInt(vertifyValue);
        if(null!=get_fpuf10_vouch_id_5){
        if(b<a){
        JOptionPane.showMessageDialog(null,"终止凭证号不能小于起始凭证号",
        "消息提示",JOptionPane.WARNING_MESSAGE);
        fpluf85_buf.setFocus(true);
        return false;
        }
        }

        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"输入异常","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;

        }

        return true;
        }