/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_chk_7310(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        if(fpl1_cust_type.getValue().equals("0")){
        JOptionPane.showMessageDialog(null,"查询现金日记账请用7304交易!","消息提示",
        JOptionPane.WARNING_MESSAGE);
        return false;
        }else{
        return true;
        }
        }