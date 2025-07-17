package testes;

import modelo.AlgoSingleton;

public class TestaSingleton {
    public static void main(String[] args) {
        AlgoSingleton s1, s2, s3 = null;
        s1 = AlgoSingleton.getInstancia();
        s2 = AlgoSingleton.getInstancia();
        s3 = AlgoSingleton.getInstancia();
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s1);
    }
}
