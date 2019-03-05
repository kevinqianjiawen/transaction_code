/**
 * 说明：当组件失去焦点后触发该事件
 *.
 * @param ... 用户自定义参数值
 * @author cao
 */
public void fun_chk_err_date(String...args){
        logger.debug("进入OnExit事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        // 获取前台输入时间
        String date=fpuf10_err_date.getValue();
        // 如果想比较日期则写成"yyyy-MM-dd"就可以了
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date a;
        try{
        a=sdf.parse(date);
        // 比较时间大小
        if(a.getTime()>System.currentTimeMillis()){
        JOptionPane.showMessageDialog(null,"错帐日非法",
        "消息提示",JOptionPane.WARNING_MESSAGE);
        fpuf10_err_date.setFocus(true);
        }
        }catch(Exception e){
        // TODO Auto-generated catch block
        e.printStackTrace();
        }

        }
