public boolean fun_chk_date(){
			String tmp_date;
		    String _user_work_data = this.curTranSession.getVariableList().getValue("_user_work_data");
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    Date date1;
			try {
				date1 = sdf.parse(_user_work_data);
				Date nowDate = new Date();
			    nowDate.getTime();
			    int result = date1.compareTo(nowDate);
			    if(result>0) {
			      App.showFlashStateMsg("输入日期大于当前日期!");
			      return false;
			     }
			    
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return true;
		}