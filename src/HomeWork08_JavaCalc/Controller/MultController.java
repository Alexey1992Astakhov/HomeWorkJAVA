package HomeWork08_JavaCalc.Controller;

import HomeWork08_JavaCalc.Model.MultModel;
import HomeWork08_JavaCalc.View;

public class MultController {

    View view;
    MultModel model;

    public MultController(View view, MultModel model) {

        this.view = view;
        this.model = model;
    }

    public void Mult() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Произведение: ");
    }
}
