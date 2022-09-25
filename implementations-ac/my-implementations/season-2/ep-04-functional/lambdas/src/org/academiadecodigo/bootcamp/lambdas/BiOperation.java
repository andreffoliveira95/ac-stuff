package org.academiadecodigo.bootcamp.lambdas;

@FunctionalInterface
public interface BiOperation<T> {

    T execute(T operand1, T operand2);
}
