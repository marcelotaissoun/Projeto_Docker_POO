<?import javafx.scene.control.Button?>
<?import javafx.scene.control.PasswordField?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.effect.Blend?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>

import br.edu.ifba.inf008.interfaces.IScreen;

public class LogInScreen implements IScreen{
    
    @Override
    public static void constructScene(){
        <Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0">
<children>
<PasswordField blendMode="DARKEN" layoutX="163.0" layoutY="189.0" prefHeight="36.0" prefWidth="249.0" promptText="Password:">
<effect>
<Blend/>
</effect>
<font>
<Font size="15.0"/>
</font>
</PasswordField>
<Button layoutX="252.0" layoutY="248.0" mnemonicParsing="false" prefHeight="30.0" prefWidth="71.0" text="LOGIN"/>
<TextField blendMode="DARKEN" layoutX="162.0" layoutY="138.0" prefHeight="36.0" prefWidth="249.0" promptText="Username:">
<font>
<Font size="15.0"/>
</font>
</TextField>
<Text fontSmoothingType="LCD" layoutX="163.0" layoutY="66.0" strokeType="OUTSIDE" strokeWidth="0.0" text="The fantastic e-Commerce" textAlignment="CENTER" wrappingWidth="249.0">
<font>
<Font name="System Bold" size="20.0"/>
</font>
</Text>
<Text layoutX="173.0" layoutY="93.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Made by MARCELO TAISSOUN and MARCOS ANDRÉ" textAlignment="CENTER" wrappingWidth="228.9830722808838"/>
<Text strokeType="OUTSIDE" strokeWidth="0.0" text="Text"/>
<Text layoutX="211.0" layoutY="304.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Doesn´t have an account?"/>
<Button layoutX="254.0" layoutY="316.0" mnemonicParsing="false" text="SIGN UP"/>
</children>
</Pane>
    }
}
