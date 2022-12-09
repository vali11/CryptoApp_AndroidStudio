package com.example.cryptoapp;

public class Encode {
    /*Algoritm de conversie de la String in valoare binara*/

    public static String enc(String s){
         String initializare="11111111";
         int ct=0;
         int a[]=new int[11111111];
         for(int i=0;i<s.length();i++){
             a[i]=(int)s.charAt(i);
             ct++;
         }

         String res="";
         int bin[]=new int[111];
         int idx=0;
         for(int j=0;j<ct;j++){
             int temp=a[j];
             for(int k=0;k<ct;k++){
                 bin[k]=0;
             }
             idx=0;
             while(temp>0){
                 bin[idx++]=temp%2;
                 temp=temp/2;
             }

             String dig="";
             String temps;
             for(int x=0;x<7;x++){
                 temps=Integer.toString(bin[x]);
                 dig=dig.concat(temps);
             }
             String rev="";
             for(int y=dig.length()-1;y>=0;y--){
                 char ca=dig.charAt((y));
                 rev=rev.concat(String.valueOf(ca));

             }
             res=res.concat(rev);
         }
         res=initializare.concat(res);
         return res;
     }


}
