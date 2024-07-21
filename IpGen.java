package Netwroking;

import java.util.Random;


class gen  {

    Random rd = new Random();    
    int a,b,c,d;
    void GNT(int min, int max) {
        if (max <= min) {
            throw new IllegalArgumentException("Max must be greater than min.");
        }
        a = rd.nextInt(max - min + 1) + min;  // Added +1 to include max value
        b = rd.nextInt(max - min + 1) + min;
        c = rd.nextInt(max - min + 1) + min;
        d = rd.nextInt(max - min + 1) + min;
    }
}

        class ipclass extends gen {

            void prntclass(int a) {
                if (a >= 1 && a <= 126) {
                    System.out.println("This IP belongs to class A");
                } else if (a >= 128 && a <= 191) {
                    System.out.println("This IP belongs to class B");
                } else if (a >= 192 && a <= 223) {
                    System.out.println("This IP belongs to class C");
                } else {
                    System.out.println("This IP does not belong to class A, B, or C");
                }
            }
        }
        

public class IpGen {


    public static void main(String[] args) {

        
        gen ip = new gen();
        ipclass ipcls = new ipclass();
        ip.GNT(10, 254);
        System.out.println("Generated IP: " + ip.a + "." + ip.b + "." + ip.c + "." + ip.d);
        ipcls.prntclass(ip.a);


    }
}
