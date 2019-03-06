/**
 * 说明：当组件将要失去焦点时触发该事件 若金额为0,则不输入对方科目和现金标记
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_chk_amt_8220(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        double a=0;
        try{
        a=Integer.parseInt(fpluf15_amount_1.getValue());

        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"输入异常","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;
        }

        if(a< 0.01){

        //	_tx_f_check = 0;
        }else{
        //	ret = SET_FIELD(0, "pl1_csh_tsf", 1);
        //	ret = SET_FIELD(0, "p4_sub_id_1", 1);
        }
        return true;
        }