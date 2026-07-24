package br.edu.ifba.inf008.screens;

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.control.SplitPane?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.shape.Circle?>

import javafx.scene.Node;

import br.edu.ifba.inf008.interfaces.IScreen;

public class MainScreen implements IScreen {

        public static Node constructScene(){

                <?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.control.SplitPane?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<SplitPane dividerPositions="0.5719063545150501" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" fx:controller="br.edu.ifba.inf008.controllers.MainController">
<items>
<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="398.0" prefWidth="355.0">
<children>
<TextField layoutX="16.0" layoutY="25.0" prefHeight="26.0" prefWidth="265.0"/>
<ListView layoutX="26.0" layoutY="129.0" prefHeight="255.0" prefWidth="245.0"/>
<Button layoutX="295.0" layoutY="25.0" mnemonicParsing="false" text="<-"/>
</children>
</AnchorPane>
<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="398.0" prefWidth="167.0">
<children>
<Button layoutX="199.0" layoutY="21.0" mnemonicParsing="false" text="->"/>
<ListView layoutX="18.0" layoutY="123.0" prefHeight="211.0" prefWidth="230.0"/>
<Button layoutX="112.0" layoutY="347.0" mnemonicParsing="false" onAction="#handleCreateOrder" text="Create an Order"/>
<Button layoutX="29.0" layoutY="347.0" mnemonicParsing="false" text="Select all"/>
<Label layoutX="71.0" layoutY="25.0" text="Your fantastic cart"/>
</children>
</AnchorPane>
</items>
</SplitPane>
        }
}
