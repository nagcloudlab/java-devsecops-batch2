package com.example;

class Customer {
    private long customerId; // Required
    private String name; // Required
    private String email; // Optional
    private String phoneNumber; // Optional
    private String address; // Optional

    public Customer(long customerId, String name, String email, String phoneNumber, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    public static class CustomerBuilder {
        private long customerId; // Required
        private String name; // Required
        private String email; // Optional
        private String phoneNumber; // Optional
        private String address; // Optional

        public CustomerBuilder(long customerId, String name) {
            if (customerId <= 0) {
                throw new IllegalArgumentException("Customer ID must be positive");
            }
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.customerId = customerId;
            this.name = name;
        }

        public CustomerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public CustomerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(customerId, name, email, phoneNumber, address);
        }
    }

}


public class Problem {

    public static void main(String[] args) {

        Customer customer1 = new Customer.CustomerBuilder(1, "A").build();
        Customer customer2 = new Customer.CustomerBuilder(1, "A")
                .setEmail("email")
                .build();
        Customer customer3 = new Customer.CustomerBuilder(1, "A")
                .setPhoneNumber("phone")
                .setEmail("email")
                .build();

    }

}
