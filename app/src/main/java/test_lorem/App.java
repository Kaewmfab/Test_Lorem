/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test_lorem;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Lorem lorem = LoremIpsum.getInstance();
        lorem.getWords(5, 10);

        System.out.print(lorem.getWords(5, 10));
        
    }
}
