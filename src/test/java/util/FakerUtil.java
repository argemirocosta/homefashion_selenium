package util;

import com.github.javafaker.Faker;

import java.util.Locale;

import static shared.Constantes.IDIOMA_FAKER;


public final class FakerUtil {

    private static Faker faker = new Faker(new Locale(IDIOMA_FAKER));

    public static String gerarNome() {
        return faker.name().fullName();
    }

    public static String gerarLogin() {
        return faker.name().username().toLowerCase();
    }

    public static String gerarSenha() {
        return faker.name().firstName().toLowerCase();
    }

    public static Integer gerarTelefone() {
        return faker.number().numberBetween(1, 1000000);
    }

}
