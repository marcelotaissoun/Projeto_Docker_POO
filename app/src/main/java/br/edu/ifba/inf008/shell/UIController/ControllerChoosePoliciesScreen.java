package br.edu.ifba.inf008.shell.UIcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import br.edu.ifba.inf008.uicontroller.IChoosePoliciesScreen;

public class ControllerChoosePoliciesScreen implements IChoosePoliciesScreen{

/*    private IScreen screen;

    public ControllerChoosePoliciesScreen(IScreen screen){
    this.screen = screen;
    }
*/

    @FXML
    private ListView freights;

    @Override
    public  void addNewDiscountPolicy(String DiscountPolicy){
        //Added news policies of discount!
    }

    @Override
    public  void addNewShippingPolicy(String ShippingPolicy);
        //Added news policies of shipping!
}
