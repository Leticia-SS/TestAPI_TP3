package org.javaWeb;

import io.javalin.Javalin;
import org.javaWeb.service.EntitiesService;

public class AppTest {
    public static void main(String[] args) {
        EntitiesService service = new EntitiesService();

        //Exercicio 01
//        service.getAllEntities();

        // Exercicio 02
//        for (int i=1; i<= 8; i++) {
//            service.getEntityById(i);
//        }

        // Exxercicio 03
//        service.getEntityById(13);

        // Exercicio 04
//        service.getEntitiesWithParams("teste", 5);

        // Exercicio 05
//        service.createEntity();

        // Exercicio 06
//        service.getEntityById(11);

        // Exercicio 07
//        service.updateEntityById(10, "novo");
//        service.getEntityById(10);

        // Exercicio 08
//        service.updateEntityById(10, "novo nome");
//        service.getEntityById(10);

        // Exercicio 09
//        service.deleteEntityById(9);
//        service.getEntityById(9);

        // Exercicio 10
//        service.deleteEntityById(13);

        // Exercicio 11
        service.checkAllowedMethods();

    }

}
