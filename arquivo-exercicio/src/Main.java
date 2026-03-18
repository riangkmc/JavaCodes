import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) throws IOException {

        String path = "C:\\arquivos-teste\\itens.csv";

        //cria um objeto de string dentro de uma lista(uma matriz)
        List<String[]> lines = new ArrayList<>();

        //le o caminho do arquivo e para cada linha nele,adiciona ele como um objeto na lista
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.split(","));
            }
        }

        //pega a lista,intera por cada objeto dela,e retorna uma logica de coluna 2 X coluna 3 de cada indice
        List<String> resultados = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] cols = lines.get(i);

            double coluna2 = Double.parseDouble(cols[1].trim());
            double coluna3 = Double.parseDouble(cols[2].trim());
            String nome = cols[0];
            double resultado = coluna2 * coluna3;
            resultados.add(nome + ": " + String.valueOf(resultado));

            System.out.println("Resultado: " + resultado);
        }

        //cria um novo arquivo e retorna em cada linha uma string com o nome é a operacao ja feita
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\arquivos-teste\\saida.csv"))) {
            for (String linha : resultados) {
                bw.write(linha);
                bw.newLine();
            }
        }



    }
}