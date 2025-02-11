package src.curinga;

class A {
    // ...
}

class B extends A {
    // ...
}

class C extends A {
    // ...
}

class D {
    // ...
}

class Gen<T> {
    T ob;

    // Exibe o tipo de ob
    public String getType() {
        return ob.getClass().getName();
    }

    public Gen(T ob) {
        this.ob = ob;
    }
}

public class UseBoundedWildcard {

    // Aqui o símbolo ? equivalerá a A ou a qualquer tipo de classe que estenda A
    static void test(Gen<? extends A> o) {
        System.out.println(o.getType() + " deu boa!");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);

        // Estas chamadas a test() estão corretas pois w, w2 e w3 são subclasses de A
        test(w);
        test(w2);
        test(w3);

        // Não pode chamar test() com w4 porque ele não é um objeto de uma classe que herde A
        //test(w4); // Error

    }
}
