import java.util.ArrayList;

public class Wrapperclass {
    public static void main(String[] args) {
        // wrapper class
        // ArrayList int y= 20;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Autoboxing: 10 (int) is automatically converted to new Integer(10)

        ArrayList<String> name = new ArrayList<>();
        name.add("Bharti");
        name.add("kartik");
        name.add("Insan");
        
        System.out.println(name);

        // int h = null; // invalid
        Integer age = null; // Valid
        System.out.println(age);
        // int primitiveAge = null; // Compilation error

        int x1=10;
        Integer x2 = 20; //auto boxing // int ko Integer bana rhe h
        Integer x4 = x1; // auto boxing 
        System.out.println(x4);

        System.out.println(x1);
        System.out.println(x2);
        int x3 = x2; //auto unboxing //Integer ko int bana rhe 
        System.out.println(x3);

        // Lets check both are same or not
        // Integer and int at same till 127 but for larger value like 128 and above Integer and int are different
        Integer a1 = 128, a2 = 128;
        
        if(a1 == a2){
            System.out.println("same same");
        }
        else
        {
            System.out.println("but difflent");
        }

    }
}
