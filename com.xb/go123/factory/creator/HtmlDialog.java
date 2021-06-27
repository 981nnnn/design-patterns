package go123.factory.creator;

import go123.factory.Button;
import go123.factory.HtmlButton;

/*
  @Author wxb
 * @Date 2021/6/27 22:33
 * @Version 1.0
 */

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
