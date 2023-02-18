package org.academiadecodigo.bootcamp.lambdas;

@FunctionalInterface
public interface MonoOperation<T> {

    T execute(T operand);
}
