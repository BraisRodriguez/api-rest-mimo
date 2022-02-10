package Validators;

import play.data.validation.Constraints;
import play.libs.F;

import javax.swing.*;

public class NoVacio extends Constraints.Validator<String>{
    @Override
    public boolean isValid(String object) {

        return object!="";
    }

    @Override
    public F.Tuple<String, Object[]> getErrorMessageKey() {
        return new F.Tuple<String, Object[]>("can´t be empty", new Object[]{""});
    }
}
