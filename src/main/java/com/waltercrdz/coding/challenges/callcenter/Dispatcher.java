package com.waltercrdz.coding.challenges.callcenter;

import java.util.List;

public class Dispatcher {

    private AttentionChain chain;

    public Dispatcher(AttentionChain chain) {
        this.chain = chain;
    }

    public void dispatchCall(Call call) {
        this.chain.handle(call);
    }

    public static class Builder {

        private List<Employee> operators;
        private List<Employee> supervisors;
        private List<Employee> managers;

        public Builder operators(List<Employee> operators) {
            this.operators = operators;
            return this;
        }

        public Builder supervisors(List<Employee> supervisors) {
            this.supervisors = supervisors;
            return this;
        }
        public Builder managers(List<Employee> managers) {
            this.managers = managers;
            return this;
        }

        public Dispatcher build() {
            final AttentionChain chain = new AttentionChain(this.operators, new AttentionChain(this.supervisors, new AttentionChain(this.managers, null)));
            return new Dispatcher(chain);
        }
    }
}
