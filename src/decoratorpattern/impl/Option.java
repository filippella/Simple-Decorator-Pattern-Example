/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.impl;

/**
 *
 * @author Filippo
 */
public class Option {

    private final String firstName;
    private final String lastName;
    private final String dob;
    private final String idNumber;

    private Option(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.idNumber = builder.idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String dob;
        private String idNumber;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return Builder.this;
        }

        public Builder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return Builder.this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return Builder.this;
        }

        public Builder setDateOfBirth(String dob) {
            this.dob = dob;
            return Builder.this;
        }

        public Option build() {
            return new Option(Builder.this);
        }
    }
}
