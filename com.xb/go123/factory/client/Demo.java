package go123.factory.client;

import go123.factory.creator.Dialog;
import go123.factory.creator.HtmlDialog;
import go123.factory.creator.WindowsDialog;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author xb
 * @Date 2021/6/27 22:42
 * @Version 1.0
 **/


public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.rendorWindow();
    }
}
