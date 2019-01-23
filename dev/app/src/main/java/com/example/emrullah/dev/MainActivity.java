package com.example.emrullah.dev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Public int eniyibirey(int a){
            int iterasyon=0;
            System.out.println(“iterasyonda yer alan bireyler”+int a[1]+”-“+int a[2]+”-“+ int a[3]+”-“+ int a[4]);
            while((a[1]!=”11111111”) and (a[2]!=”11111111”)and(a[3]!=”11111111”)and(a[4]!=”11111111”)){
                int b1=kac_tane(int a[1]);
                int b2=kac_tane(int a[2]);
                int b3=kac_tane(int a[3]);
                int b4=kac_tane(int a[4]);
                int btop=b1+b2+b3+b4;

                int c[1]=b1/btop;
                int c[2]=b2/btop;
                int c[3]=b3/btop;
                int c[4]=b4/btop;
                int c=sirala(int c);
                int c[1]= İnt c[1];
                int c[2]= İnt c[2]+c[1];
                int c[3]= İnt c[3]+c[2];
                int c[4]=1;
                int rastgele=rastgele_ondalik();
                int secim = secim(int rastgele, int c);
                int deger12= caprazlama(int a[int secim[1]], int a[int secim[2]]);
                int deger34= caprazlama(int a[int secim[3]], int a[int secim[4]]);
                int deger=deger_duzenle(int deger12,int deger34);
                int mutasyon=rastgele();
                int a = mutasyon (int deger, int mutasyon);
                int iterasyon++;
                System.out.println("“İterasyon elemanları”+int a[1]+”-“+ int a[2]+”-“+ int a[3]+”-“+ int a[4]");

                int a[1] = “11111110”;
                int a[2] = “11111110”;

                int a[3] = “00111111”;

                int a[4] = “10111111”;

                eniyibirey(int a);
    }

    public int kac_tane(int [] deger)
    {
        int adet = 0;
        int kac;
        for(kac=0 ; kac<8; kac++){

            if(deger[kac]==1){
                adet++;
            }
        }
        return adet;
    }
    public int[] sırala(int []deger)//Gelen 4 Değeri Küçükten Büyüğe Sıralayan Fonksiyon
    {
        int gecicideger;
        for (int i=1; i <5; i++)
        {
            for (int j=2; j<5; j++)
            {
                if (deger[j]< deger[j-1])
                {


                    gecicideger=deger[j-1];
                    deger[j-1]=deger[j];
                    deger[j]=gecicideger;


                }
            }
        }
        return deger;
    }
    public int rastgele(){
        Random rand = new Random();

        for(int i=1; i<5; i++){
            int rast[i] = rand.nextInt(100);
            rast[i] = rast[i]/100;
        }
        return rast;
    }

    public int secim(int[] deger, int[] gelen){
        for(int i=0; i<5; i++){

            if(deger[i]<=gelen[1]){int sonuc[i]==1;}
            if(deger[i]<=gelen[2])&&(deger[i]>gelen[1])){sonuc[i]=2;}
            if(deger[i]<=gelen[3])&& (deger[i]>gelen[2]){sonuc[i]=3;}
            if(deger[i]<=gelen[4])&&(deger[i]>gelen[3])){sonuc[i]=4;}

        }
        int sonuc=sırala(sonuc[]);
        return sonuc;


    }

    Public void caprazlama(int[] deger1,int[]  deger2){

        int s1=deger1[0]* deger1[1]* deger1[2]* deger2[3]* deger2[4]* deger2[5]* deger2[6]* deger2[7];
        int s2= deger2[0]* deger2[1]* deger2[2]* deger1[3]* deger1[4]* deger1[5]* deger1[6]* deger1[7];
        int s[1] = s1;
        int s[2] = s2;
        Return s;

    }

    Public int rastge()
    {
        Random rand= new Random();
        int randd= rand.nextInt(4-2)+1;
        return  randd;
    }

    Public void degerduzenle(){
        int []deger1;
        int[]deger2;
        int[]deger;

        deger[1] = deger1[1];
         deger [2] = deger1[2];
         deger [3] =deger2[1];
        deger [4] =deger2[2];

    }
    Public void mutasyon(int[] deger, int mutasyon){
        Random rand = new Random();
        int r=rand.nextInt(8-1)+0;
        if(deger[mutasyon][r]==1){
            deger[mutasyon][r]=0;
        }else{
            deger[mutasyon][r]=1;

        }
        return deger;

    }


}

    }