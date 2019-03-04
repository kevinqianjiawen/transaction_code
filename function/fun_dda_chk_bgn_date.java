/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public class fun_dda_chk_bgn_date {
    public boolean fun_dda_chk_bgn_date(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        Date date=new Date();
        SimpleDateFormat format =new SimpleDateFormat();
        String _user_work_data=format.format(date);
        int result=_user_work_data.compareTo(fpluf10_end_date_2.getValue());
        if(result>0){
            App.showFormStatus("解挂日期必须大于等于挂失日期!");
            return false;
        }
        return true;
    }
}
