package org.javaWeb;

import io.javalin.Javalin;
import org.javaWeb.service.EntitiesService;

public class AppTest {
    public static void main(String[] args) {
        EntitiesService service = new EntitiesService();
//        service.getAllEntities();

        for (int i=1; i<= 8; i++) {
            service.getEntityById(i);
        }

    }

}
