package com.tema6.tema6ejemplo2.Utils;

import com.tema6.tema6ejemplo2.Models.Mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {

    public static String[] colors = new String[]
            {"F44336", "E91E63", "9C27B0", "673AB7", "3F51B5",
                    "03A9F4", "009688", "4CAF50", "CDDC39", "FFC107",
                    "FF5722", "795548", "9E9E9E", "455A64", "FF5722"};

    public static List<Mail> getDummyData() {
        return new ArrayList<Mail>() {{
            add(new Mail("Presupuesto 2017", "Hola Alejandro, este es el presupuesto para el anio 2017 del que mencionaste en la reunion de ayer. Esta en formato PDF, ya me dices que te parece. Un Saludo", "<antonio@gmail.com>"));
            add(new Mail("Cena Empresa", "Queridos amigos, la cena de empresa de este anio sera en el mismo restaurante que los anios pasados, sin embargo la hora sera¡ distinta, empieza sobre las 8 de la tarde. Espero verte alli, Saludos.", "<empresa@gmail.com>"));
            add(new Mail("Partida Tenis", "ey Alex, ¿Cuando dijiste que ibamos a ir a jugar ese torneo de tenis? Debera­amos entrenar antes del primero partido, ya me dices.", "<maria@gmail.com>"));
            add(new Mail("Oferta de empleo: Android developer", "Hola, estamos buscando desarrolladores Android sin experiencia, en un ambiente dinamico donde se valora el companierismo, el esfuerzo y las ganas por aprender. Si sientes que eres el candidato perfecto para ello, mandame tu CV a a©ste mismo correo y consideramos tu perfil en el proceso de entrevistas. Gracias.", "<monica@gmail.com>"));
            add(new Mail("Quedada amigos", "woooooo, hace semanas que no quedamos todos juntos, como te viene este finde?", "<luis@gmail.com>"));
            add(new Mail("Compra conjunta de shishas", "Bueno, al final somos 10, vamos a pedir las shishas que ya haba­amos acordado. El pedido empezara¡ al final del mes de Febrero, para entonces, si no has hecho la transferencia, no se procedera¡ a pedir la tuya. Si necesitas los datos bancarios, ava­same ;)", "<carlos@gmail.com>"));
            add(new Mail("Cursos 2017", "Cuniado, he visto unos cursos muy interesantes sobre programaciaon. Pa¡sate por mi casa hoy y le echamos un vistazo!", "<rafael@gmail.com>"));
            add(new Mail("Conferencia de lectores", "El lugar elegido para la conferencia de lectores internacional celebrada el dia 29 de Febrero sera¡ en Sevilla. Visita nuestra pa¡gina web para tener ma¡s detalles del evento.", "<osvaldo@gmail.com>"));
            add(new Mail("Adopta a un perro, sera tu amigo", "Recuerda que los animales no son juguetes, que tienen sentimientos y debes cuidar de ellos. Muchos son abandonados, pa¡sate por nuestras instalaciones y acoge a uno de estos necesitados animalitos que tanto anioran un hogar. Son encantadores!!", "<jose@gmail.com>"));
            add(new Mail("Repara tus piezas, 50% dto", "Aprovecha las nuevas ofertas del 50% descuento que tenemos en todos nuestros arta­culos", "<reparaciones@gmail.com>"));
            add(new Mail("Propa³sitos anio nuevo??", "Participa en nuestra dina¡mica encuesta para propuestas de anio nuevo!!!", "<estefania@gmail.com>"));
            add(new Mail("Valora este formulario", "Valora este formulario que te he adjuntado, bro.", "<lucas@gmail.com>"));
        }};
    }

    public static String getRandomColor() {
        // Naºmero aleatorio entre [0] y [14];
        int randonNumber = new Random().nextInt(colors.length) + 0;
        // Devolvemos el color
        return colors[randonNumber];
    }


}