/**
 * 说明：当组件将要失去焦点时触发该事件, 汇票现金转帐标志
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_4101_chk_csh(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        // 现金
        if(fpl1_csh_tsf.getValue().equals("0")){
        // 代理付款行
        ret=SET_FIELD(null,"puf30_name_1",1);
        // 行号
        ret=SET_FIELD(null,"pluf10_cont_id",1);
        }else{
        // 清值
        ret=PUT_DISPLAY_VARIABLE("puf30_name_1",0,"");
        ret=PUT_DISPLAY_VARIABLE("pluf10_cont_id",0,"");
        ret=SET_FIELD(null,"puf30_name_1",2);
        ret=SET_FIELD(null,"pluf10_cont_id",2);
        }
        return true;
        }