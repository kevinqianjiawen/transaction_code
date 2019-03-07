public boolean fun_dda_chk_end_date_2(){
			boolean  ret;
			 String pluf10_begin_date_2 = this.curTranSession.getVariableList().getValue("pluf10_begin_date_2");
			 
		    if (pluf10_begin_date_2!=null)
		      { ret = SET_FIELD(null,"pluf10_end_date_2",1); } 
		    Date date=new Date();
	        SimpleDateFormat format =new SimpleDateFormat();
	        String _user_work_data=format.format(date);
	        int result=_user_work_data.compareTo(pluf10_begin_date_2);
		    
		    if (result>1)
		      {  App.showFormStatus("冻结到期日必须大于起始日!");
		         return false;
		      }
		    return true;
		      
		}