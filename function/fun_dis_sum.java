/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fun_dis_sum(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        boolean ret;

        if(null!=fpl2_summary_no.getValue()){
        //未知语句
                 /*   $select Summary
			        into $pluf40_summary_1
			        from "t_cis_summary.shdb"
			        where SumNo == pl2_summary_no;*/

        //  ret = DISPLAY_VARIABLE("pluf40_summary_1", 0);
        }
        return true;
        }