/**
 * 说明：当组件将要失去焦点时触发该事件
 * @param vertifyValue 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fcl_chkvchno(String vertifyValue, String...args) {
        logger.debug("进入OnVailidate事件处理，args[" + args + "]");
        String tmp_name;
        boolean ret;
        int type;
        //String _tx_code="2111";_tx_code应该是当前的交易码，不知道如何获取所依写死
        String pl3_vouch_type=fpl3_vouch_type.getValue();
        String pluf10_vouch_id=fpluf10_vouch_id.getValue();
        if( _tx_code.equals("2111") )
        {
        if( !pl3_vouch_type.equals("000") )
        {
        if ( Integer.parseInt(pluf10_vouch_id) == 0 )
        {
        App.showFormStatus("凭证类型不为000，请输入非0凭证号");
        return false;
        }
        }
        }
        //TODO 在下面编写处理代码
        return true;
        }