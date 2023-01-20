package HomeWork08_JavaCalc.Controller;

import HomeWork08_JavaCalc.Model.DivModel;
import HomeWork08_JavaCalc.View;

public class DivController {

    View view;
    DivModel model;

    public DivController(View view, DivModel model) {

        this.view = view;
        this.model = model;
    }

    public void Div() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Частное: ");
    }
}
