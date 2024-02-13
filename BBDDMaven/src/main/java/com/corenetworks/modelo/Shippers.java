package com.corenetworks.modelo;

public class Shippers {

        //1. variables
        private int shipperId;
        private String companyName;
        private String phone;
        //2 constructores

        public Shippers() {
        }

        public Shippers(int shipperId, String companyName, String phone) {
            this.shipperId = shipperId;
            this.companyName = companyName;
            this.phone = phone;
        }
        //3. metodos

        @Override
        public String toString() {
            return "Shippers{" +
                    "shipperId=" + shipperId +
                    ", companyName='" + companyName + '\'' +
                    ", phone='" + phone + '\'' +
                    '}'+ '\n';
        }

        //4. getters y setters

        public int getShipperId() {
            return shipperId;
        }

        public void setShipperId(int shipperId) {
            this.shipperId = shipperId;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

