public class DoubleCheckProblem {
    public static void main(String[] args) {

    }
}

class SingletonExample {
    private volatile static SingletonExample singletonExample;

    private SingletonExample() {
    }

    public static SingletonExample createInstance() {
        if (singletonExample == null) {
            synchronized (SingletonExample.class) {
                if (singletonExample == null) {
                    return new SingletonExample();
                }
            }
        }
        return singletonExample;
    }
}
