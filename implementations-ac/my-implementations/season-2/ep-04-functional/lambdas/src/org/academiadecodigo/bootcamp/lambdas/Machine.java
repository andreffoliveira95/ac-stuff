package org.academiadecodigo.bootcamp.lambdas;

public interface Machine<T> {


    T perform(T operand, MonoOperation<T> operation);


    T perform(T operand1, T operand2, BiOperation<T> operation);
}
