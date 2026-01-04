package samuraiarmor;

import java.util.ArrayList;

public class Loja {
    public static ArrayList<Material> materiais = new ArrayList<>();
    public static ArrayList<Encomenda> encomendas = new ArrayList<>();
    
    public static void carregarProdutos() {
        
        materiais.add(new Luvas(
        1, "Venum", 30, "L", "Vermelho", "14oz", 79.99, true, "Boxe"
    ));
        materiais.add(new Luvas(
            2, "Hayabusa", 20, "M", "Preto", "7-8oz", 89.99, true, "MMA"
        ));
        materiais.add(new Luvas(
            3, "RDX", 25, "L", "Preto", "7-8oz", 49.99, true, "MMA"
        ));
        materiais.add(new Caneleiras(
            4, "Adidas", 25, "L", "Preto", 19.99, "Muay Thai"
        ));
        materiais.add(new Kimono(
            5, "Venum", 15, "XL", "Azul", 129.99, "BJJ"
        ));

        // Capacetes
        materiais.add(new Capacete(
            6, "Everlast", 18, "M", "Preto", 69.99, true, "Boxe"
        ));
        materiais.add(new Capacete(
            7, "Venum", 22, "L", "Vermelho", 89.99, true, "MMA"
        ));
        materiais.add(new Capacete(
            8, "Title Boxing", 15, "M", "Azul", 79.99, false, "Boxe"
        ));
        materiais.add(new Capacete(
            9, "Hayabusa", 12, "L", "Preto", 99.99, true, "MMA"
        ));
        materiais.add(new Capacete(
            10, "RDX", 20, "XL", "Vermelho", 59.99, true, "Kickboxing"
        ));

        // Caneleiras
        materiais.add(new Caneleiras(
            11, "Venum", 30, "M", "Preto", 24.99, "Muay Thai"
        ));
        materiais.add(new Caneleiras(
            12, "RDX", 25, "L", "Azul", 19.99, "Kickboxing"
        ));
        materiais.add(new Caneleiras(
            13, "Hayabusa", 18, "M", "Vermelho", 34.99, "MMA"
        ));
        materiais.add(new Caneleiras(
            14, "Fairtex", 22, "L", "Preto", 29.99, "Muay Thai"
        ));

        // Luvas (mais 5)
        materiais.add(new Luvas(
            15, "Everlast", 28, "M", "Branco", "16oz", 69.99, true, "Boxe"
        ));
        materiais.add(new Luvas(
            16, "Title Boxing", 24, "L", "Preto", "12oz", 59.99, false, "Boxe"
        ));
        materiais.add(new Luvas(
            17, "Fairtex", 19, "M", "Azul", "10oz", 79.99, true, "Muay Thai"
        ));
        materiais.add(new Luvas(
            18, "Bad Boy", 21, "L", "Verde", "7oz", 54.99, true, "MMA"
        ));

        // Protetores Bucais
        materiais.add(new ProtetorBucal(
            19, "Venum", 50, "Único", "Preto", 14.99, true, "Multi"
        ));
        materiais.add(new ProtetorBucal(
            20, "Shock Doctor", 45, "Único", "Vermelho", 19.99, true,"Boxe"
        ));
        materiais.add(new ProtetorBucal(
            21, "Everlast", 40, "Único", "Azul", 12.99, true, "MMA"
        ));
        materiais.add(new ProtetorBucal(
            22, "Opro", 35, "Único", "Branco", 24.99, true,"Multi"
        ));
        materiais.add(new ProtetorBucal(
            23, "Bad Boy", 38, "Único", "Preto", 16.99, true,"MMA"
        ));

        // Kimonos (mais 5)
        materiais.add(new Kimono(
            24, "Hayabusa", 10, "L", "Preto", 149.99, "BJJ"
        ));
        materiais.add(new Kimono(
            25, "Tatami", 14, "M", "Branco", 119.99, "BJJ"
        ));
        materiais.add(new Kimono(
            26, "Gameness", 12, "XL", "Azul", 139.99, "BJJ"
        ));
        materiais.add(new Kimono(
            27, "Fuji", 16, "L", "Preto", 109.99, "Judo"
        ));
        materiais.add(new Kimono(
            28, "Atama", 11, "M", "Branco", 134.99, "BJJ"
        ));
    }
}
