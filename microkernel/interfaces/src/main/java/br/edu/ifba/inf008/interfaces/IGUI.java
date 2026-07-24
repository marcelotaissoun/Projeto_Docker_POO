package br.edu.ifba.inf008.interfaces;

import br.edu.ifba.inf008.interfaces.IPlugin;

import javafx.scene.Node;

public abstract class IGUI extends IPlugin{
    protected Node mainNode;

    public String getPluginName(){
        return this.getClass().getName();
    };

    public Node getMainNode(){
        return this.mainNode;
    }

    public abstract void setMainNode();
}
