/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean paytranscheck(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        //TODO 在下面编写处理代码
        boolean ret;
        String pl5_seq_3=fpl5_seq_3.getValue();
        String pl4_tlr_1=fpl4_tlr_1.getValue();
        String pl5_seq_2=fpl5_seq_2.getValue();
        String pl4_year=fpl4_year.getValue();
        String puf13_gen_amount_2=fpuf13_gen_amount_2.getValue();
        String puf13_tran_amount_1=fpuf13_tran_amount_1.getValue();
        String p1_deal_mode=fp1_deal_mode.getValue();
        String p1_class_mode=fp1_class_mode.getValue();
        String pl1_acct_type=fpl1_acct_type.getValue();
        String p1_compress_flag=fp1_compress_flag.getValue();
        if (!( pl5_seq_3 + pl4_tlr_1 ).equals(( pl5_seq_2 + pl4_year )))
        {
        App.showFormStatus( "借据复核不符!" );
        }else
        {
        if ((! puf13_gen_amount_2.equals(puf13_tran_amount_1) )
        && ( puf13_gen_amount_2+"").length() > 0 )
        {
        App.showFormStatus( "转换金额复核不符!" );
        }else
        {
        if (( p1_deal_mode.equals( p1_class_mode) )
        &&  ( p1_deal_mode ).length() > 0 )
        {
        App.showFormStatus( "还款方式复核不符!" );
        }else
        {
        if (( !pl1_acct_type.equals( p1_compress_flag) )
        && pl1_acct_type !=null )
        {
        App.showFormStatus( "结息方式复核不符!" );
        }
        }
        }
        }

        return true;
        }