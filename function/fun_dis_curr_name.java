/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_dis_curr_name(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        boolean ret;

        $select ChName
        into $puf20_curr_name
        from"t_cis_curr.shdb"
        where CurrNo==$pl2_curr_id_1;

        ret=DISPLAY_VARIABLE("puf20_curr_name",0);
        return true;
        }