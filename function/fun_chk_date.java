/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_chk_date(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        //_user_work_data代表输入日期，_work_date代表当前日期
        String tmp_date;
        String _user_work_data=fpluf10_begin_date_2.getValue();
        SimpleDateFormat format=new SimpleDateFormat();
        Date _work_date=new Date();
        tmp_date=format.format(_work_date);
        //tmp_date = DATE2STRING(_work_date);
        int result=_user_work_data.compareTo(tmp_date);
        if(result>0) {
        App.showFormStatus("输入日期大于当前日期!");
        return false;
        }
        else {
        return true;
        }
        }