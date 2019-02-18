public class SomeClass {
    interface CallBack {
        double[] Test(int n);
    }

    CallBack callBack;

    public void registerCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void test(int n) {
        System.out.println("Hello world");
        double[] z = callBack.Test(n);
    }


}
