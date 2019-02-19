public class SomeClass {
    interface CallBack {
        double[] Test(int n);
    }

    CallBack callBack;

    public void registerCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void test(int n) {
        double[] z = callBack.Test(n);
    }


}
