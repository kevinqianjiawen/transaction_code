/**
 * 说明：当组件将要失去焦点时触发该事件
 * 7784托收委收控制
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 */
public boolean fun_7784_vchtype(String vertifyValue,
        String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码

        boolean ret;

        if(fsvps1c_type_2.getValue().equals("0")){
        ret=SET_FIELD(null,"svps10d_date_3",1); /* 凭证日期 */
        ret=SET_FIELD(null,"svps3s_type_10",6); /* 凭证类型 */
        ret=SET_FIELD(null,"svps16s_code_1",1); /* 凭证号码 */
        ret=SET_FIELD(null,"svps15m_amt_1",1); /* 凭证金额 */
        ret=SET_FIELD(null,"svps15m_amt_2",2); /* 拒付金额 */
        ret=SET_FIELD(null,"svps15m_amt_3",2); /* 增付金额 */
        ret=SET_FIELD(null,"svps15m_amt_4",3); /* 滞纳金金额 */
        }else{
        ret=SET_FIELD(null,"svps10d_date_3",3); /* 凭证日期 */
        ret=SET_FIELD(null,"svps3s_type_10",6); /* 凭证类型 */
        ret=SET_FIELD(null,"svps16s_code_1",1); /* 凭证号码 */
        ret=SET_FIELD(null,"svps15m_amt_1",1); /* 凭证金额 */
        ret=SET_FIELD(null,"svps15m_amt_2",3); /* 拒付金额 */
        ret=SET_FIELD(null,"svps15m_amt_3",3); /* 增付金额 */
        ret=SET_FIELD(null,"svps15m_amt_4",3); /* 滞纳金金额 */
        }

        return true;
        }