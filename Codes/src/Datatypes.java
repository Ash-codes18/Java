public class Datatypes {
    public static void main(String[] args) {

//        byte-1 [-128 - 127]
//        short -2
//        int-4 1,2,3
//        long-8
//        float-4 3.14
//        double-8
//        char-2 a,b,c,d
//        boolean-1 true/false


        byte age=30;
        int phone=1234567890;
        long phone2=12345678900L;
        float pi=3.14F;
        char letter='g';
        boolean isAdult= true;
        age=12;
        isAdult=false;


        //Strings are immumatable i.e the value given to a string in java cannot be changed later on

        String name ="Ashmit";
        System.out.println(name.length());

        String fruit = new String("Apple");
        String Veggie = new String("Brinjal");

        System.out.println(fruit);
        System.out.println(Veggie);

        String Combo=name+" "+Veggie;
        System.out.println(Combo);
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));


        String name2=name.replace('i','e');
        System.out.println(name2);

        String Sentence = new String("I like eating halua");
        System.out.println(Sentence.substring(2,6));
    }
}
