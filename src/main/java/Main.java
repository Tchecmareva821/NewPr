public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();


        someClass.registerCallBack(new Test_1());
        someClass.test(3);

        someClass.registerCallBack(new Test_2());
        someClass.test(3);

        someClass.registerCallBack(new Test_3());
        someClass.test(3);
    }
}
