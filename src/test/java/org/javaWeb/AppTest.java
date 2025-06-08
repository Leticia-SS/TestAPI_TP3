package org.javaWeb;

import io.javalin.Javalin;

public class AppTest {
    public static void main(String[] args) {
        Javalin app = Javalin.create();

        app.before(ctx -> {
           long inicio = System.currentTimeMillis();
           ctx.attribute("inicio", inicio);
           ctx.attribute("retorno", "Teste");
            System.out.println("Antes da Rota: " + ctx.path());
        });
        app.after(ctx -> {
            long inicio = ctx.attribute("inicio");
            long end = System.currentTimeMillis();
            long duracao = end - inicio;
            System.out.println("Após a Rota: " + ctx.path() + " demorou: " + duracao + "ms");
        });

        app.get("/inicio", ctx -> {
            System.out.println("Metodo Inicio");
            ctx.result("Inicio");
        });

        app.start(8082);
    }
}
