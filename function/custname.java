/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean custname(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        String tmp_cust_name;
        //此处为交易代码_tx_code
        int _tx_code=0;
        if(_tx_code==1301||_tx_code==1031){
        tmp_cust_name="pluf20_name_2";

        }else if(_tx_code==8220||_tx_code==8221){
        tmp_cust_name="pluf40_name_1";

        }else{
        tmp_cust_name="pluf40_name_2";
        }
        ret = disp_custname(tmp_cust_name);
        return true;
        }