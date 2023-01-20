package HomeWork08_JavaCalc.Controller;

import HomeWork08_JavaCalc.Model.SubModel;
import HomeWork08_JavaCalc.View;

public class SubController {

    View view;
    SubModel model;

    public SubController(View view, SubModel model) {

        this.view = view;
        this.model = model;
    }

    public void Sub() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Разность: ");
    }
}
