package org.javaWeb;

import io.javalin.Javalin;

public class AppTest {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8082);

    }
}
