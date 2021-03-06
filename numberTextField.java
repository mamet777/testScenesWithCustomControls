package sample;

import javafx.scene.control.TextField;

/**
 * Created by charleserobertsonjr on 5/14/15.
 */
public class numberTextField extends TextField {
    private int maxLength;

    public numberTextField() { super(); }

    public numberTextField(int maxLength) {
        super();
        this.maxLength = maxLength;
    }

    @Override
    public void replaceText(int i, int i1, String s) {
        if (isValid(s)) {
            super.replaceText(i, i1, s);
        }
    }

    @Override
    public void replaceSelection(String s) {
        super.replaceSelection(s);
    }

    private boolean isValid(String psValue) {
        if (this.getText() != null) {

        }

        boolean status = ("".equals(psValue)) || (psValue.matches("[0-9]"));
        if (this.getText() == null) {
            return status;
        } else {
            return (status && this.getText().length() < maxLength);
        }

    }
}
