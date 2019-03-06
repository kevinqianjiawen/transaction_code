/**
 * 说明：当组件将要失去焦点时触发该事件
 * 若为现金,则不输入对方科目
 *
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_chk_pr_item(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        boolean ret;
        if(fpl1_csh_tsf.getValue().equals("0"))
        {
        fp4_sub_id_1.setValue("0101");
        ret=DISPLAY_VARIABLE("p4_sub_id_1",0);
        ret=SET_FIELD(0,"p4_sub_id_1",2);
        }
        else
        {
        ret=DISPLAY_VARIABLE("p4_sub_id_1",0);
        ret=SET_FIELD(0,"p4_sub_id_1",1);
        }
        return true;
        }