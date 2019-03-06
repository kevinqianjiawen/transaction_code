/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值 String puf40_name_5
 * @author cao
 */
public boolean disp_name_rec(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        //TODO 在下面编写处理代码
        String tmp_name;
        String tmp_name1;
        String acctno;
        int iret;
        boolean ret;
        int type;
        int type1;
        int len;
        int i;
        type1=93;
        //定义无法解析的参数
        String var_name=null;
        String _tlr_no=null;
        tmp_name=null;
        tmp_name1=null;
        //获取交易代码
        String _tx_code=null;
        //_user_work_data 假设为当前事件
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String _user_work_data=sdf.format(new Date());
        acctno=_user_work_data;
        if(_tx_code.equals("6530")||_tx_code.equals("6531"))
        {
        type=1;
        // acctno = fpluf19_card_no_3.getValue();
        }
        if(_tx_code.equals("6532"))
        {
        type=1;
        // acctno = fcard_bgn_num.getValue();
        }

        if(_tx_code.equals("6303"))
        {
        type=1;
        //acctno = fcard_inst_no_2.getValue()+fcard_type_2.getValue()+fcard_kind_2.getValue()+fcard_seq_no_2.getValue()+fcard_chk_no_2.getValue();
        }
        if(_tx_code.equals("6201"))
        {
        type=1;
        // acctno = fcard_inst_no_4.getValue()+fcard_type_4.getValue()+fcard_kind_4.getValue()+fcard_seq_no_4.getValue()+fcard_chk_no_4.getValue();
        }
        if(_tx_code.equals("6202"))
        {
        type=1;
        // acctno = fcard_inst_no_1.getValue()+fcard_type_1.getValue()+fcard_kind_1.getValue()+fcard_seq_no_1.getValue()+fcard_chk_no_1.getValue();
        }
        if(_tx_code.equals("1013")||_tx_code.equals("2122")||
        _tx_code.equals("8122")||_tx_code.equals("6203")||
        _tx_code.equals("8133")||_tx_code.equals("8134"))
        {
        if(var_name.equals("puf40_name_4"))
        {
        if(_tx_code!="8122"&&_tx_code!="8133"&&_tx_code!="8134")
        {
        type=1;
        //acctno = fpl22_acct_no_1.getValue();
        }
        else
        {
        type=1;
        //acctno = fpl22_acct_no_1.getValue();
        }
        }
        if(var_name.equals("puf40_name_5"))
        {
        if(_tx_code.equals("2122"))
        {
        type=1;
        //acctno = fpl6_inst_no_3.getValue()+fpl2_curr_id_2.getValue()+fpl3_prod_id_2.getValue()+fpl4_seq_1.getValue()+fpl2_chk_no_1.getValue();
        }
        if(_tx_code.equals("8122")||_tx_code.equals("8133")||_tx_code.equals("8134"))
        {
        type=1;
        // acctno = fpl6_inst_no_1.getValue()+fpl2_curr_id_1.getValue()+fpl8_item_id.getValue()+fpl6_seq_no_2.getValue();
        }
        if(_tx_code.equals("1013"))
        {
        type=1;
        // acctno = fpl6_inst_no_5.getValue() +fpl2_curr_id_6.getValue()+fpl3_sav_kind_3.getValue()+fpl6_seq_no_3.getValue()+fpl1_chk_no_1.getValue();
        }
        }
        }
        if(_tx_code.equals("1302")||_tx_code.equals("1303")||_tx_code.equals("1305")
        ||_tx_code.equals("1306")||_tx_code.equals("1317")||_tx_code.equals("1318"))
        {
        type=1;
        //acctno = fpl6_inst_no_5.getValue() +fpl2_curr_id_6.getValue()+fpl3_sav_kind_3.getValue()+fpl6_seq_no_3.getValue()+fpl1_chk_no_1.getValue();
        }
        if(_tx_code.equals("1304")||_tx_code.equals("1401"))
        {
        if(var_name.equals("puf40_name_5"))
        {
        type=82;
        // acctno = fpl6_inst_no_5.getValue() +fpl2_curr_id_6.getValue()+fpl3_sav_kind_3.getValue()+fpl6_seq_no_3.getValue()+fpl1_chk_no_1.getValue();
        }
        if(var_name.equals("puf40_name_4"))
        {
        type=1;
        //  acctno = fpl22_acct_no_1.getValue();
        }
        }
        if(_tx_code.equals("6108"))
        {
        type=1;
        // acctno = fcard_inst_no_1.getValue()+fcard_type_1.getValue()+fcard_kind_1.getValue()+fcard_seq_no_1.getValue()+fcard_chk_no_1.getValue();
        }
        if(_tx_code.equals("1061"))
        {
        type=1;
        // acctno = fpl6_inst_no_3.getValue()+fpl2_curr_id_5.getValue()+fpl3_sav_kind_2.getValue()+fpl6_seq_no_1.getValue()+fpl1_chk_no.getValue();
        }
        if(_tx_code.equals("6109"))
        {
        type=1;
        // acctno = fcard_inst_no_2.getValue()+fcard_type_2.getValue()+fcard_kind_2.getValue()+fcard_seq_no_2.getValue()+fcard_chk_no_2.getValue();
        }
        if(_tx_code.equals("6106"))
        {
        type=1;
        // acctno = fcard_inst_no_2.getValue()+fcard_type_2.getValue()+fcard_kind_2.getValue()+fcard_seq_no_2.getValue()+fcard_chk_no_2.getValue();
        }
        if(_tx_code.equals("1309"))
        {
        type=1;
        // acctno = fpl6_inst_no_3.getValue()+fpl2_curr_id_5.getValue()+fpl3_sav_kind_2.getValue()+fpl6_seq_no_1.getValue()+fpl1_chk_no.getValue();
        }
        if(_tx_code.equals("3614")||_tx_code.equals("3619"))
        {
        type=1;
        // acctno = fpluf40_acct_no_1.getValue();
        }
        if(_tx_code.equals("2110")||_tx_code.equals("2111")||_tx_code.equals("2120")||_tx_code.equals("2121")
        ||_tx_code.equals("2130")||_tx_code.equals("2131")||_tx_code.equals("2140")||_tx_code.equals("2141")
        ||_tx_code.equals("2252")||_tx_code.equals("2253")||_tx_code.equals("2258")||_tx_code.equals("2260")
        ||_tx_code.equals("2264")||_tx_code.equals("2272")||_tx_code.equals("2273")||_tx_code.equals("2275")
        ||_tx_code.equals("2510"))
        {

        type=1;
        // acctno = fpl6_inst_no_3.getValue()+fpl2_curr_id_2.getValue()+fpl3_prod_id_2.getValue()+fpl4_seq_1.getValue()+fpl2_chk_no_1.getValue();

        }
        if(_tx_code.equals("2279")||_tx_code.equals("2280"))
        {
        type=1;
        // acctno = fpl6_inst_no_4.getValue()+fpl2_curr_id_3.getValue()+fpl3_prod_id_3.getValue()+fpl4_seq_2.getValue()+fpl2_chk_no_2.getValue();
        }
        if(_tx_code.equals("8120")||_tx_code.equals("8121")||_tx_code.equals("8130")
        ||_tx_code.equals("8131")||_tx_code.equals("8140")||_tx_code.equals("8141")
        ||_tx_code.equals("8126")||_tx_code.equals("8127"))
        {
        type=1;
        // acctno = fpl6_inst_no_1.getValue()+fpl2_curr_id_1.getValue()+fpl8_item_id+fpl6_seq_no_2.getValue();
        }
        if(_tx_code.equals("8250"))
        {
        type=1;
        // acctno = fpl6_inst_no_1.getValue() + fpl2_curr_id_1.getValue() + fpl8_item_id.getValue() +fpl6_seq_no_2.getValue();
        }
        if(_tx_code.equals("4701")||_tx_code.equals("4703"))
        {
        if(fp1_dc_flag.getValue().equals('2'))
        {type=99;
        }
        else
        {type=1;
        }
        }
        if(_tx_code.equals("4702")||_tx_code.equals("4704"))
        {
        if(fp1_dc_flag.getValue().equals('2'))
        {type=1;
        }
        else{
        type=99;
        }
        }
        //从下标0，截取长度为2的_tx_code
        if(_tx_code.substring(0,2).equals("75"))
        {type=1;
        //acctno = fpluf22_acct_no_3.getValue() ;
        }
        // add f|| 大额支付 20050302
        if(_tx_code.substring(0,2).equals("76"))
        {type=1;
        // acctno = fpluf40_name_2.getValue() ;
        var_name="pluf40_name_3";
        }
        if(_tx_code.equals("7615"))
        {type=1;
        //acctno = fpuf40_name_1.getValue();
        var_name="puf60_buf1";
        }
        if(_tx_code.equals("9441")||_tx_code.equals("9442")||_tx_code.equals("9443"))
        {type=1;
        // acctno = fpluf18_acct_no_1.getValue() ;
        }
        // tmp_name = GetAutoMsg( type, acctno );
        //控制柜员不能给自己做业务
        // tmp_name1 = GetAutoMsg( type1, _tlr_no+acctno );

        if(tmp_name1.equals(_tlr_no))
        {
        //  UserDialog("该账号的户主为当前柜员,不可以给自己做业务.");
        return(false);
        }
        // 控制柜员不能给自己做业务tmp_name[37..40]
        if(tmp_name.substring(37,41).equals("未登")&&(_tx_code.equals("1302")||_tx_code.equals("1303")
        ||_tx_code.equals("1305")||_tx_code.equals("1304")))
        {
        tmp_name="有未登折项,请先补登存折!";
        // UserDialog ( tmp_name );
        return(false);
        }
        //String 转 int
        len=Integer.parseInt(acctno);
        if(len!=17)
        {
        //tmp_name[0..36]
        tmp_name=tmp_name.substring(0,37);
        }
        // ret = PUT_DISPLAY_VARIABLE(var_name, 0, tmp_name);
        if(_tx_code=="1302"||_tx_code.equals("1305"))
        {
        //ret = fun_clear_card();
        }
        return true;
        }