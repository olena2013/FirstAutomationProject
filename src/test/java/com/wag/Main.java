package com.wag;

import helper.EmailGenerator;

public class Main {
    public static void main(String[] args) {
        String email = EmailGenerator.createEmail();
        System.out.println(email);
    }
}
