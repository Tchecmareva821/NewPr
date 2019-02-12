public class Main {
    public static void main(String[] args) {
        SomeClass someClass=new SomeClass();
        WorkMatrix workMatrix = new WorkMatrix();

        someClass.registerCallBack(workMatrix);
        someClass.test(3);
    }
}
