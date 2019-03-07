/**
 * 说明：当组件将要失去焦点时触发该事件
 *
 * @param vertifyValue
 * 需要验证的数据
 * @param ... 用户自定义参数值
 *@author cao
 */
public boolean fun_chk_tlr(String vertifyValue,String...args){
        logger.debug("进入OnVailidate事件处理，args["+args+"]");
        // TODO 在下面编写处理代码
        boolean ret;
        int a=0;
        int b=0;
        // 自己定义：
        String _tlr_no=null;
        int[]_tlr_lvlx=null;
        try{
        a=Integer.parseInt(fp4_box_no_1.getValue());
        b=Integer.parseInt(_tlr_no);
        }catch(Exception e){

        }

        if(a!=b&&_tlr_lvlx[b]<=2){
        // UserDialog( "非主管仅能查询自己的记录" );
        return(false);
        }
        return(true);

        }