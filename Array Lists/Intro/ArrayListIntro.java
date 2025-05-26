import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList<String> names=new ArrayList<>();

        //Adding Elements
        names.add("Mahi");
        names.add("Giri");
        names.add("Surya");
        names.add("Madhu");
        names.add("Madhes");
        System.out.println(names);

        //Looping
        //for loop
        for(int i=0;i<names.size();i++){
            System.out.print(" "+names.get(i));
        }
        System.out.println();
        //Enhanced Loop
        for(String name:names){
            System.out.print(" "+name);
        }
        System.out.println();
        //Boolean in ArrayList
        boolean name =names.contains("Mahi");
        System.out.println(name);

        //Removing Elements
        //By Value
        names.remove("Mahi");
        //By Index
        names.remove("Giri");
        System.out.println(names);


    }
}
