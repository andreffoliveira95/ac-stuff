package org.academiadecodigo.bootcamp.lambdas;

public class MachineImpl<T> implements Machine<T>{
    @Override
    public T perform(T operand, MonoOperation<T> operation) {
        return operation.execute(operand);
    }

    @Override
    public T perform(T operand1, T operand2, BiOperation<T> operation) {
        return operation.execute(operand1, operand2);
    }
}
