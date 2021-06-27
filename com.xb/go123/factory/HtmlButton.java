package go123.factory;

/**
 * @Author wxb
 * @Date 2021/6/27 22:30
 * @Version 1.0
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
