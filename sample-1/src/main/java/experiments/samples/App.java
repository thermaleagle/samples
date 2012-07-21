package experiments.samples;

import org.apache.commons.lang.StringUtils;

/**
 * Hello world!
 * 
 */
public class App {
    private String name;

    public void setName(final String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello " + name + "!    " + 5);

        System.out.println(StringUtils.trimToEmpty("Hello " + name + "!    ") + 5);
    }
}
