//界面显示后事件
public boolean fun_chk_acct_type(String uiName) {
        super.afterUIShowed(uiName);
        ComboBox fpl1_tctd_flag = new ComboBox(this, "pl1_tctd_flag");
        ComboBox fpl1_acct_attr = new ComboBox(this, "pl1_acct_attr");
        ComboBox fpl1_withdraw_way = new ComboBox(this, "pl1_withdraw_way");
        TextField fpluf7_seal_id = new TextField(this, "pluf7_seal_id");
        TextField fpl4_tlr_4 = new TextField(this, "pl4_tlr_4");
        ComboBox fpl1_prn_period = new ComboBox(this, "pl1_prn_period");
        ComboBox fpl1_inter_way = new ComboBox(this, "pl1_inter_way");
        boolean ret;
       // String pl1_acct_type="0";该变量不知如何获取
        //通知存款和定期存款,贷款户
        if ( pl1_acct_type.equals("0") )  {
        //ret = SET_FIELD( null, "pl1_acct_attr", 2 );     //帐户属性
        fpl1_acct_attr.setValue("2");
        //ret = SET_FIELD( null, "pl1_tctd_flag", 2 );     //通存通兑
        fpl1_tctd_flag.setValue("2");
        //ret = SET_FIELD( null, "pl1_withdraw_way", 2 );  //支取方式
        fpl1_withdraw_way.setValue("2");
        //ret = SET_FIELD( null, "pl4_tlr_4", 2 );        //行内联系人
        fpl4_tlr_4.setValue("2");
        }

        if ( pl1_acct_type.equals("1") ) {   //定期存款
        //ret = SET_FIELD( null, "pluf7_seal_id", 2 );     //印鉴卡号
        fpluf7_seal_id.setValue("2");
        //ret = SET_FIELD( null, "pl1_prn_period", 2 );  //出帐周期
        fpl1_prn_period.setValue("2");
        //ret = SET_FIELD( null, "pl1_inter_way", 2 );   //结息方式
        fpl1_inter_way.setValue("2");
        }

        if ( pl1_acct_type.equals("2") ) {   //通知存款
        // ret = SET_FIELD( null, "pl1_prn_period", 2 );    //出帐周期
        fpl1_prn_period.setValue("2");
        //ret = SET_FIELD( null, "pl1_inter_way", 2 );     //结息方式
        fpl1_inter_way.setValue("2");
        }

        if ( pl1_acct_type.equals("3")) {   //贷款户
        //ret = SET_FIELD( null, "pluf7_seal_id", 2 );     //印鉴卡号
        fpluf7_seal_id.setValue("2");
        }

        return true;
        }