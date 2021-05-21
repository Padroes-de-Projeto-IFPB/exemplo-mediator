package br.edu.ifpb.padroes.components;


import br.edu.ifpb.padroes.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}