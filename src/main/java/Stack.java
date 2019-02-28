public class Stack {
    StackElement first;

    public void add(int a) {
        StackElement el = new StackElement();
        el.id = a;
        if (first == null)
            first = el;
        else {
            el.next = first;
            first = el;
        }
    }

    public void delete() {
        if (first == null) {
            return;
        } else {
            if (first.next == null) {
                first = null;
            } else {
                first = first.next;
            }
        }
    }

    public int poz(int e) {
        while (true) {
            if (first == null) {
                System.out.println("Стек пуст");
                return 0;
            } else {
                if (first.id == e) {
                    return e;
                } else {
                    delete();
                }
            }
        }
    }
}
