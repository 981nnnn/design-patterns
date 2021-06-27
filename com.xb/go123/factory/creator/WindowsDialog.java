package go123.factory.creator;

import go123.factory.Button;
import go123.factory.WindowsButton;

/**
 * @Author wxb
 * @Date 2021/6/27 22:37
 * @Version 1.0
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
