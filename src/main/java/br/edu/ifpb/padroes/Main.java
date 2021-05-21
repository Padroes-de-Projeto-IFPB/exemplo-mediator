package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.components.*;
import br.edu.ifpb.padroes.mediator.Editor;
import br.edu.ifpb.padroes.mediator.Mediator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new ListComponent(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }

}
