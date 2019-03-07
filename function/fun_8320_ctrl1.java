/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_8320_ctrl1(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        if(fpl1_acct_type.getValue().equals("0")){
        pl6_inst_no_1 = orgnization_no;
        ret = PUT_DISPLAY_VARIABLE( "pl6_inst_no_1", 0, orgnization_no );
        }
        pl2_curr_id_1 = "01";
        ret = PUT_DISPLAY_VARIABLE( "pl2_curr_id_1", 0, "01");
        pl8_item_id   = "10010300";
        ret = PUT_DISPLAY_VARIABLE( "pl8_item_id", 0, "10010300");
        pl1_csh_tsf = '0';
        return true;

        }