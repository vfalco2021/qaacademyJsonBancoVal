package json;

import org.junit.Test;

public class JsonTest {
     @Test
    public void  testCriandoJson(){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        manipulandoJson.criandoJson();

    }
    @Test
    public void lerJson(){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        manipulandoJson.navegarJsonArquivo();
    }
}
