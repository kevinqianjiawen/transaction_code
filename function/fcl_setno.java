/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * 设置笔数
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fcl_setno(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        int a=0;
        try{
        // 获取fpluf10_ma_seq的值并且强转成int型
        a=Integer.parseInt(fpluf10_ma_seq.getValue());
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"输入异常","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;
        }
        boolean ret;
        ret=PUT_DISPLAY_VARIABLE("pluf14_seq_no",0,a);
        return true;
        }
