/**
 *
 */
package spring.chapter11;

import java.io.PrintStream;

/**
 * @author amine Fouzi <amine.fouzi>
 *
 */
public class Logger {

    private PrintStream stream;

    public Logger(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
    }

}
