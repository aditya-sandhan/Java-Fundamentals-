public class teststring{
    pubic static void main(String[] args){

        String S1 = "Adi"; // String Literals (Stored inside SCP- Strng constant pool )
        String S2 ="Adi";

        String S3 = new String("Adi"); // Created using new keyword (Stored inside Heap memory)
        String S4 = new String("Adi");

        System.out.println(S1==S2); // true
        System.out.println(S3==S4); // false 
    }
}