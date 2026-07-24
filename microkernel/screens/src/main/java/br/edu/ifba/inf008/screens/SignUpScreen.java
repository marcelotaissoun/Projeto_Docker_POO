package br.edu.ifba.inf008.screens;

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ButtonBar?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.PasswordField?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.shape.Rectangle?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>

import javafx.scene.Node;

import br.edu.ifba.inf008.interfaces.IScreen;

public class SIgnUpScreen implements IScreen{

    @Override
    public static Node constructScene(){
        <Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0">
            <children>
                    <Button layoutX="249.0" layoutY="348.0" mnemonicParsing="false" text="Create account"/>
                    <Label layoutX="97.0" layoutY="14.0" text="Wellcome to the Fantistic E-Commerce!">
                    <font>
                    <Font size="24.0"/>
                    </font>
                    </Label>
                    <Rectangle arcHeight="5.0" arcWidth="5.0" fill="DODGERBLUE" height="249.0" layoutX="65.0" layoutY="89.0" stroke="BLACK" strokeType="INSIDE" width="479.0"/>
                    <Label layoutX="207.0" layoutY="49.0" text="Please follow the steps for join us">
                    <font>
                    <Font size="14.0"/>
                    </font>
                    </Label>
                    <ButtonBar layoutX="14.0" layoutY="341.0" prefHeight="40.0" prefWidth="200.0"/>
                    <PasswordField layoutX="144.0" layoutY="201.0" prefHeight="26.0" prefWidth="326.0"/>
                    <PasswordField layoutX="147.0" layoutY="287.0" prefHeight="26.0" prefWidth="326.0"/>
                    <TextField layoutX="140.0" layoutY="130.0" prefHeight="26.0" prefWidth="326.0"/>
                    <Text layoutX="21.0" layoutY="40.0" strokeType="OUTSIDE" strokeWidth="0.0" text="<-" wrappingWidth="34.621999740600586">
                    <font>
                    <Font size="24.0"/>
                    </font>
                    </Text>
                    <Label layoutX="140.0" layoutY="95.0" text="Digit your username"/>
                    <Label layoutX="140.0" layoutY="169.0" text="Digit your password"/>
                    <Label layoutX="147.0" layoutY="254.0" text="Confirm your password"/>
            </children>
        </Pane>
    }
}

