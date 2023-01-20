package HomeWork08_JavaCalc.Controller;

import HomeWork08_JavaCalc.Model.SumModel;
import HomeWork08_JavaCalc.View;

public class SumController {

    View view;
    SumModel model;

    public SumController(View view, SumModel model) {
        this.model = model;
        this.view = view;
    }

    public void Sum() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Сумма: ");
    }
}
