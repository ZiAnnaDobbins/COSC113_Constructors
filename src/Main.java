
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public class Student {
    //Attribuites
    String FN;
    String LN;
    int Sid;

        //define a constrotor
    // constrotor do not have any return type
    //

    Student(){
        FN="john";
        LN="jonas";
        Sid=120;

    }

    Student(String FN, String LN, int Sid){
       this.FN = FN;
        this.LN = LN;
        this.Sid=Sid;

    }
    public static void main(String[] argument) {
        String s3 =new Student(FN:"Bukumi", LN:"Jayeola", Sid:111);

        // if controtor are not definded jvm will provided a defult constructor
        Student s1 = new Student();
        System.out.println("s1");

        Student s2 = new Student();
        System.out.println("Frist name is: " + s2.FN);
        System.out.println("Frist last is: " + s2.LN);
        System.out.println("Frist last is: " + s2.Sid);
        System.out.println("hello constructtors");




        //use of dot operator (.)
        System.out.println("Frist name is: " + s1.FN);
        System.out.println("Frist last is: " + s1.LN);
        System.out.println("Frist last is: " + s1.Sid);
        System.out.println("hello constructtors");

    }
}
