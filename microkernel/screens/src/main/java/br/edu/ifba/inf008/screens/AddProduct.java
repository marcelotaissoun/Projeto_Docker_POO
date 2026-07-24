<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextArea?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.shape.Rectangle?>
<?import javafx.scene.text.Font?>

import javafx.scene.Node;
import br.edu.ifba.inf008.interfaces.IScreen;

public class AddProduct implements IScreen {
    @Override 
    public static Node constructScene(){
        <Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0">
<children>
<Label layoutX="243.0" layoutY="45.0" text="Adding a new item"/>
<Rectangle arcHeight="5.0" arcWidth="5.0" fill="#101dc6" height="265.0" layoutX="70.0" layoutY="98.0" stroke="BLACK" strokeType="INSIDE" width="460.0"/>
<TextField layoutX="123.0" layoutY="167.0"/>
<TextField layoutX="368.0" layoutY="250.0" prefHeight="26.0" prefWidth="68.0"/>
<TextField layoutX="315.0" layoutY="167.0"/>
<Label layoutX="181.0" layoutY="120.0" text="SKU">
<font>
<Font size="24.0"/>
</font>
</Label>
<Label layoutX="139.0" layoutY="206.0" text="Description">
<font>
<Font size="24.0"/>
</font>
</Label>
<Label layoutX="362.0" layoutY="120.0" text="Name">
<font>
<Font size="24.0"/>
</font>
</Label>
<Label layoutX="347.0" layoutY="206.0" text="Quantity">
<font>
<Font size="24.0"/>
</font>
</Label>
<TextArea layoutX="99.0" layoutY="241.0" prefHeight="98.0" prefWidth="234.0"/>
</children>
</Pane>
    }
}

