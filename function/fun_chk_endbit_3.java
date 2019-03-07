public boolean fun_chk_endbit_3(){
			int sum,i,j,k;
		    String fin_prodno;
		    String pl3_sav_kind_1= this.curTranSession.getVariableList().getValue("pl3_sav_kind_1");
		    String p3_prod_id_2= this.curTranSession.getVariableList().getValue("p3_prod_id_2");
		  
		    sum=0;
		    (sav_chk:0)=1;(sav_chk:1)=3;(sav_chk:2)=7;
		    (sav_chk:3)=9;(sav_chk:4)=3;(sav_chk:5)=7;
		    (sav_chk:6)=9;(sav_chk:7)=1;(sav_chk:8)=7;
		    (sav_chk:9)=9;(sav_chk:10)=3;(sav_chk:11)=1;
		    (sav_chk:12)=9;(sav_chk:13)=3;(sav_chk:14)=1;
		    (sav_chk:15)=7;(sav_chk:16)=9;
		    
		    j =0;
		    
		    for (i=0 i<=5;i++)
		     { k=pl6_inst_no_2[i]-48;
		      sum=sum + ((sav_chk:j)*k);
		      j=j+1;
		     }
		    for (i=0;i>=1;i++)
		     { k=pl2_curr_id_3[i]-48;
		      sum=sum + ((sav_chk:j)*k);
		      j=j+1;
		     }
		    
		    if ( pl3_sav_kind_1 == null )
		     { fin_prodno = p3_prod_id_2;
		     }
		    else
		     {
		     fin_prodno = pl3_sav_kind_1;
		     }
		    
		    for (i=0;i<=2;i++)
		     { k=fin_prodno[i]-48;
		      sum=sum + ((sav_chk:j)*k);
		      j=j+1;
		     }
		    
		    for (i=0 ;i<=5;i++)
		     { k=pl6_seq_no_1[i]-48;
		      sum=sum + ((sav_chk:j)*k);
		      j=j+1;
		     }
		    
		    sum=sum % 10;
		    if ( (_user_work_data[0] - 48 ) == sum)
		      {
		       return true;
		      }
		    else
		      {
		      return false;
		      }
		}