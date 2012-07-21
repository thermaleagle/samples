package experiments.samples;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 * 
 */
public class findBugsWillComplainForThisClass implements Serializable {
    private String name;

    public void setName(final String name) {
        this.name = name;
    }

    public void printHello() {
        final int a = 5;
        System.out.println("Hello " + name + "!    " + 5);

        System.out.println(StringUtils.trimToEmpty("Hello " + name + "!    ") + 5);
    }
}
