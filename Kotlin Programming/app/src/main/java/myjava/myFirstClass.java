package myjava;

import com.example.nikitabaronia.firstPackage.DefaultArguementsKt;
import com.example.nikitabaronia.firstPackage.myfile;

public class myFirstClass {

    public static void main(String[] args){

       int sum =  myfile.addSum(3,4);
       System.out.println(sum);

       //Java will compile it since JVMoverloads it for java
       int areaa = DefaultArguementsKt.findVolume(1,3);
        System.out.println(areaa);


    }

    public static int getArea(int l, int b){
        return l*b;
    }


}
