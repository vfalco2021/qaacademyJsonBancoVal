package json;

import org.json.JSONObject;

public class ManipulandoJson {

    public void criandoJson(){
        JSONObject json = new JSONObject();
        json.put("nome", "Valeria");
        json.put("sobrenome","Falco");
        json.put("idade",50);
        System.out.println(json);
        System.out.println(json.get("nome"));

    }
}
