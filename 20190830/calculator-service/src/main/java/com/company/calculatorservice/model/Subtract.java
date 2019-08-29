package com.company.calculatorservice.model;

import javax.validation.constraints.NotEmpty;

public class Subtract extends Calculator {
    @NotEmpty(message = "You must supply a value for operand1")
    private int operand1;
    @NotEmpty(message = "You must supply a value for operand2")
    private int operand2;

    private int subtract;

    public int getSubtract() {
        return subtract = operand1 - operand2;
    }

    public void setSubtract(int add) {
        this.subtract = add;
    }

    public void getOperand1() {
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void getOperand2() {

    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }}
