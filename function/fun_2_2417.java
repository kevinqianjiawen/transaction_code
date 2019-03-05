/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_2_2417(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String acctno;
        String pl6_inst_no_4=fpl6_inst_no_4.getValue();
        String pl2_curr_id_3=fpl2_curr_id_3.getValue();
        String pluf14_seq_no=fpluf14_seq_no.getValue();
        acctno=pl6_inst_no_4 + pl2_curr_id_3 + pluf14_seq_no;

        if( acctno.length() == 18 )
        {
        //ret = SET_FIELD( null, "pluf6_passwd", 1 );
        fpluf6_passwd.setValue("1");
        //ret = SET_FIELD( null, "pluf7_psbk_id", 1 );
        fpluf7_psbk_id.setValue("1");
        }
        else
        {
        //ret=SET_FIELD( null, "pluf6_passwd", 2 );
        fpluf6_passwd.setValue("2");
        }
        return true;
        }