package com.example.builder;

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


    public static class Builder {
        private long customerId; // Required
        private String name; // Required
        private String email; // Optional
        private String phoneNumber; // Optional
        private String address; // Optional

        public Builder(long customerId, String name) {
            if (customerId <= 0) {
                throw new IllegalArgumentException("Customer ID must be positive");
            }
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.customerId = customerId;
            this.name = name;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            return new Customer(customerId, name, email, phoneNumber, address);
        }
    }

}


public class BuilderPatternExample {

    public static void main(String[] args) {

        Customer customer1 = new Customer.Builder(1, "A").build();
        Customer customer2 = new Customer.Builder(1, "A")
                .setEmail("email")
                .build();

        Customer customer3 = new Customer.Builder(1, "A")
                .setPhoneNumber("phone")
                .setEmail("email")
                .build();

        Customer.Builder customerBuilder=new Customer.Builder(1, "A");
        Customer customer4 = customerBuilder.build();
        customerBuilder.setEmail("email");
        customerBuilder.setPhoneNumber("phone");
        System.out.println(customer4);

    }

}
