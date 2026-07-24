package br.edu.ifba.inf008.screens;

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ComboBox?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.layout.Pane?>

import br.edu.ifba.inf008.interfaces.IScreen;

public class ChoosePoliciesScreen implements IScreen{

    @Override
    public static void constructScene(){
    <Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0">
        <children>
            <Label layoutX="91.0" layoutY="43.0" text="Choose your freight"/>
            <Label layoutX="427.0" layoutY="43.0" text="Review your order!"/>
            <ListView layoutX="370.0" layoutY="74.0" prefHeight="326.0" prefWidth="229.0"/>
            <Label layoutX="86.0" layoutY="191.0" text="Choose your discount"/>
            <Button layoutX="234.0" layoutY="338.0" mnemonicParsing="false" text="Pay"/>
            <Button layoutX="44.0" layoutY="338.0" mnemonicParsing="false" text="Cancel order"/>
            <ComboBox layoutX="86.0" layoutY="110.0" prefWidth="150.0"/>
            <ComboBox layoutX="86.0" layoutY="262.0" prefWidth="150.0"/>
        </children>
    </Pane>
    }


}
