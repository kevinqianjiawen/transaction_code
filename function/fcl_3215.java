/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据.
 * @param ... 用户自定义参数值
 * @author cao
 */
public boolean fcl_3215(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        ret=PutDatFile_3215(fpluf60_name_1.getValue(),"0");
        return ret;
        }