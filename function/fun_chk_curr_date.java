public void fun_chk_curr_date(String...args)throws ParseException{
        logger.debug("进入OnExit事件处理，args["+args+"]");
        // 获取前台输入时间
        String date=fpluf8_signon_date.getValue();
        //如果想比较日期则写成"yyyy-MM-dd"就可以了
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date a=sdf.parse(date);
        //比较时间大小
        if(a.getTime()>System.currentTimeMillis()){
        System.out.print("时间不正确");
        JOptionPane.showMessageDialog(null,"日期必须小于或等于当前工作日","消息提示",JOptionPane.WARNING_MESSAGE);
        fpluf8_signon_date.setFocus(true);
        }else{

        }

        }