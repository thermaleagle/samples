package experiments.samples;

import java.io.Serializable;

//See findbugs_exclude.xml and pom.xml
public class findBugsWillNotComplainForThisClass implements Serializable {

    /**
     * @param args
     */
    public static void main(final String[] args) {

        final findBugsWillNotComplainForThisClass calculatorMain = new findBugsWillNotComplainForThisClass();
        System.out.println(calculatorMain.add(5, 4));
        System.out.println(calculatorMain.multiply(5, 4));
    }

    public int add(final int n1, final int n2) {
        return n2 + n1;
    }

    public int multiply(final int n1, final int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; i++) {
            n3 = add(n3, n1);
        }

        return n3;
    }

}
