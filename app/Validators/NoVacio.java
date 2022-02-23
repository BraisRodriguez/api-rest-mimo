package Validators;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.libs.F;
import play.libs.Json;
import play.mvc.Results;

import javax.inject.Inject;
import javax.swing.*;

public class NoVacio extends Constraints.Validator<String>{

    @Inject
    MessagesApi messagesApi;

    @Override
    public boolean isValid(String object) {

        return object!="";
    }

    @Override
    public F.Tuple<String, Object[]> getErrorMessageKey() {

        return new F.Tuple<String, Object[]>("can´t be empty", new Object[]{""});
    }
}
