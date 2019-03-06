/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_dda_bgnenddate(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        String pluf10_end_date_2=fpluf10_end_date_2.getValue();
        String pluf10_begin_date_2=fpluf10_begin_date_2.getValue();
        if (pluf10_end_date_2 != null)
        {
        if (Integer.parseInt(pluf10_end_date_2) >=Integer.parseInt(pluf10_begin_date_2))
        {
        return true;
        }
        else
        {
        App.showFormStatus("截止日期必须大于或等于起始日期");
        return false;
        }
        }
        return true;
        }