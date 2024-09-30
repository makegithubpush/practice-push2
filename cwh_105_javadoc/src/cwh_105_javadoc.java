
public class cwh_105_javadoc {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("good morning " + a + " bro!");
        System.out.println("good morning " + b + " bro!" );
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;

    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000,4000);
    }
}