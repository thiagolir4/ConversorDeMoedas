import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivos {
    public void salvaJson(Moedas moedas, String nomeDoArquivo) throws IOException { //metodo para gerar arquivo json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(nomeDoArquivo + ".json");
        escrita.write(gson.toJson(moedas));
        escrita.close();
    }


}
