public class TypeConversion {
    public static void main(String[] args) {
        // byte --> short --> char --> int --> long --> float --> double 
        //  Impliciet or widening
         byte c = 30;
         short d = c;

        // double <-- float <-- long <-- int <-- char <-- short <-- byte
        // Expliciet or Narrowing 
        short e = 19;
       // not allowed byte g = (short)e;
        byte f = (byte)e;


        double j = 29;
        int k =(int)j;
        // not allowed int l = (double)j;

        int a = 20;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
        
    }
}
