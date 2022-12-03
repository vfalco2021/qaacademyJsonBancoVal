package json;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ManipulandoJson {

    public void criandoJson() {
        JSONObject json = new JSONObject();
        json.put("nome", "Valeria");
        json.put("sobrenome", "Falco");
        json.put("idade", 50);
        System.out.println(json);
        System.out.println(json.get("nome"));

    }


    public void navegarJsonArquivo() {
        JSONObject json;
        try {
            InputStream inputStream = new FileInputStream("./src/main/resources/arquivosJson/cep.json");
            json = new JSONObject(new JSONTokener(inputStream));
            System.out.println(json.get("localidade"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao convertrr arquivo" + e);
        }
    }
}
