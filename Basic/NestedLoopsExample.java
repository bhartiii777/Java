/*lets learn loops 
public class Loops{
    public static void main(String[] args) {  /* */
        // lets understand loops using common scenario
        // we have to print hello 5 times then this is common way
//         System.out.println("hello");
//         System.out.println("hello"); 
//         System.out.println("hello");
//         System.out.println("hello");
//         System.out.println("hello");

//        for(int a=0;a<=5;a++){
//         System.out.println("Hello");

//        } //how much hello will print? 5 how? 0 till 5
//     //   do u know how loop works? // so first a = 0; a<=5; run this
//     // now write output one by one here
//     // a = 0; 0<=5; Hello now a++
//     // a  = 1; 1<=5; Hello now a++;
//     // a = 2; 2<=5; Hello now a++;
//     // a = 3;  3<=5, Hello now a++;
//     //a= 4; 4<=5, hello now a++;
//     //a= 5; 5<=5, hello now a++;
// for(int a=0;a<5;a++){
//     System.out.println("hi");
//     // tell output type it one by one
//     // a=0;  0<5; it will increment a++;
//     // a=1;  1<5; it will increment a++;
//     // a=2;  2<5; it will increment a++;
//     // a=3;  3<5; it will increment a++;
//     // a=4;  4<5; it will increment a++;
    
//     // so the loop run 5 times
// }
// // for(int b = 10; b<20; b--)
// // { System.out.println("ok");}
// //do it
   // b=10;  b<20, it will decrement by b--;    //focus here imasking and i am teaching
   // b=10; 10<20 true print ok decrement b--
   // b=9
   // b= 8
   //b=7
   //b=6
   //b=5
   //b=4 
   //b=3
   //b=2
   //b=1 
   //b=0
   //b=-1  // output infinite times
//    for(int i=10;i>5;i--)
//    { System.out.println(i);}

   //output diy 
   // i=0; 0>5; i will decrement;
   // i=-1 do u know meaning of 0<5 and 0>5;  haan ruko it will turn false now so what will happen?

    // ig it will not change the value of it
    // //tell me output 0
    
//    for(char j='a';j=='e';j++)
//    {
//     System.out.println(j);

//    }
  // output
  // yeh alphabet kse chlte // error nhi h to chalenge 
  //padha rakha h maine
  // m logic bhul gyi iska
      
  //double a='a';
 // int b= (int)a;
  //char c= 'c';
  //System.out.println('a');
  //System.out.println(a);
  //System.out.println(b);
  //System.out.println(c);


    


// Time Complexity Analysis:
// The outer loop runs `n` times (where n = 5 in this case).
// For each iteration of the outer loop, the inner loop also runs `n` times.
// Therefore, the total number of iterations is n * n, making the time complexity O(n^2).

// Space Complexity Analysis:
// The space complexity is O(1) because no additional data structures are used, 
// and the memory usage does not grow with the size of the input.

public class NestedLoopsExample {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Print product with tab space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}






