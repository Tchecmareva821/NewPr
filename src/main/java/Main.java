public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        int[] mas=new int[10];
        for (int i=0;i<mas.length;i++){
            mas[i]=(int)(Math.random()*10);
        }
        for (int i:mas){
            stack.add(i);
        }
        System.out.println(stack.poz(8));
    }
}
