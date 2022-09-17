public class DoubleCheckProblem {
    public static void main(String[] args) {

    }
}

class SingletonExample {
    private static SingletonExample singletonExample;

    private SingletonExample() {
        this.singletonExample = createInstance();
    }

    public static SingletonExample createInstance(){
        if (singletonExample == null){
            synchronized (SingletonExample.class){
                if (singletonExample == null) {
                    return new SingletonExample();
                }
            }
        }
        return singletonExample;
    }
}
