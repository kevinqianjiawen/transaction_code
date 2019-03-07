int sum,i,j,k;
    sum=0;
    (sav_chk:0)=1;(sav_chk:1)=3;(sav_chk:2)=5;
    (sav_chk:3)=7;(sav_chk:4)=11;(sav_chk:5)=13;
    (sav_chk:6)=17;(sav_chk:7)=19;(sav_chk:8)=23;
    (sav_chk:9)=29;(sav_chk:10)=31;(sav_chk:11)=37;
    (sav_chk:12)=41;(sav_chk:13)=43;(sav_chk:14)=47;
    
    j =0;
    
    for i=0 to 5 step 1
     { k=pl6_inst_no_3[i]-48;
      sum=sum + ((sav_chk:j)*k);
      j=j+1;
     }
    for i=0 to 1 step 1
     { k=pl2_curr_id_2[i]-48;
      sum=sum + ((sav_chk:j)*k);
      j=j+1;
     }
    
    for i=0 to 2 step 1
     { k=pl3_prod_id_2[i]-48;
      sum=sum + ((sav_chk:j)*k);
      j=j+1;
     }
    for i=0 to 3 step 1
     { k=pl4_seq_1[i]-48;
      sum=sum + ((sav_chk:j)*k);
      j=j+1;
     }
    sum=sum % 97 + 1;
    if ( (_user_work_data[0] - 48 ) == sum/10 and 
         (_user_work_data[1] - 48 ) == sum%10 )
      {
       return(true);
      }
    else
      {
      return(false);
      }