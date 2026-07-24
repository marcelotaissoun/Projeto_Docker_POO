package br.edu.ifba.inf008.screens;

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.control.SplitPane?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.shape.Circle?>

import br.edu.ifba.inf008.interfaces.IScreen;

public class MainScreen implements IScreen {
        <SplitPane dividerPositions="0.5" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0">
<items>
<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="398.0" prefWidth="355.0">
<children>
<TextField layoutX="16.0" layoutY="25.0" prefHeight="26.0" prefWidth="265.0"/>
<ListView layoutX="26.0" layoutY="129.0" prefHeight="255.0" prefWidth="245.0"/>
</children>
</AnchorPane>
<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="398.0" prefWidth="167.0">
<children>
<Circle fill="DODGERBLUE" layoutX="155.0" layoutY="58.0" radius="37.0" stroke="BLACK" strokeType="INSIDE"/>
<Button layoutX="14.0" layoutY="21.0" mnemonicParsing="false" text="->"/>
<ListView layoutX="16.0" layoutY="129.0" prefHeight="211.0" prefWidth="265.0"/>
<Button layoutX="148.0" layoutY="347.0" mnemonicParsing="false" text="Create an Order"/>
<Button layoutX="29.0" layoutY="347.0" mnemonicParsing="false" text="Select all"/>
</children>
</AnchorPane>
</items>
</SplitPane>
}
