public class SomeClass {
    interface CallBack{
        void Test(int n);
    }

    CallBack callBack;

    public void registerCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void test(int n){
        callBack.Test(n);
    }
}
