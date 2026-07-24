package br.edu.ifba.inf008.screens;

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ComboBox?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.RadioButton?>
<?import javafx.scene.control.Separator?>
<?import javafx.scene.control.TableColumn?>
<?import javafx.scene.control.TableView?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.Region?>
<?import javafx.scene.layout.RowConstraints?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.text.Font?>

import br.edu.ifba.inf008.interfaces.IScreen;

public class CheckoutScreen implements IScreen{

    @Override 
    public static void constructScene(){
        <BorderPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0">
<top>
<Label text="CHECKOUT" BorderPane.alignment="CENTER">
<font>
<Font size="23.0"/>
</font>
</Label>
</top>
<center>
<TableView fx:id="tableCart" prefHeight="366.0" prefWidth="474.0" BorderPane.alignment="CENTER">
<columns>
<TableColumn prefWidth="181.0" text="PRODUCT"/>
<TableColumn minWidth="6.0" prefWidth="65.0" text="AMOUNT"/>
<TableColumn prefWidth="79.0" text="UNIT. PRICE"/>
<TableColumn prefWidth="81.0" text="SUBTOTAL"/>
</columns>
</TableView>
</center>
<right>
<VBox prefHeight="200.0" prefWidth="100.0" BorderPane.alignment="CENTER">
<children>
<Label alignment="CENTER" prefHeight="21.0" prefWidth="101.0" text="OVERVIEW:">
<font>
<Font size="15.0"/>
</font>
</Label>
<GridPane>
<columnConstraints>
<ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0"/>
<ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0"/>
</columnConstraints>
<rowConstraints>
<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES"/>
<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES"/>
<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES"/>
<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES"/>
</rowConstraints>
<children>
<Label text="Subtotal:"/>
<Label fx:id="lblSubTotal" text="R$ 0,00" GridPane.columnIndex="1"/>
<Label text="Discount:" GridPane.rowIndex="1"/>
<Label fx:id="cbDiscount" text="R$ 0,00" GridPane.columnIndex="1" GridPane.rowIndex="1"/>
<Label text="Shipping:" GridPane.rowIndex="2"/>
<Label fx:id="cbShipping" text="R$ 0,00" GridPane.columnIndex="1" GridPane.rowIndex="2"/>
<Label text="Total:" GridPane.rowIndex="3"/>
<Label fx:id="lblTotal" text="R$ 0,00" GridPane.columnIndex="1" GridPane.rowIndex="3"/>
</children>
</GridPane>
<Separator prefWidth="200.0"/>
<Label alignment="CENTER" prefHeight="28.0" prefWidth="98.0" text="PAYM. METHOD:" textAlignment="CENTER">
<font>
<Font size="13.0"/>
</font>
</Label>
<VBox prefHeight="200.0" prefWidth="100.0" spacing="5.0">
<children>
<RadioButton mnemonicParsing="false" text="Credit Card"/>
<RadioButton mnemonicParsing="false" text="PIX"/>
<RadioButton mnemonicParsing="false" text="Ticket"/>
<Separator prefWidth="200.0"/>
<ComboBox fx:id="cbDiscount" prefWidth="150.0" promptText="DISCOUNT"/>
<Separator prefWidth="200.0"/>
<ComboBox fx:id="cbShipping" prefWidth="150.0" promptText="SHIPPING"/>
</children>
</VBox>
</children>
</VBox>
</right>
<bottom>
<HBox prefHeight="43.0" prefWidth="600.0" BorderPane.alignment="CENTER">
<children>
<Button fx:id="btnBack" mnemonicParsing="false" prefHeight="25.0" prefWidth="75.0" text="RETURN"/>
<Region prefHeight="200.0" prefWidth="200.0" HBox.hgrow="ALWAYS"/>
<Button mnemonicParsing="false" text="PURCHASE"/>
</children>
</HBox>
</bottom>
</BorderPane>
    }
}