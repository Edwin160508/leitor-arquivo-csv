package br.com.edwin.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.com.edwin.csv.model.Relatorio;

/**
 * Convertendo informaões de uma arquivo CSV para objeto Java classe "Relatorio"
 * Ignorando cabeçalho do arquivo.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Relatorio> relatorios = lerLancamentosCSV("arquivo.csv");
		
		//escrevendo no console relatorio
        for(Relatorio r :relatorios) {
        	System.out.println(r);
        }
    }
    
    private static List<Relatorio> lerLancamentosCSV(String arquivo) {
		List<Relatorio> relatorios = new ArrayList<Relatorio>();
		Path caminhoParaArquivo = Paths.get(arquivo);
		
		try (BufferedReader br = Files.newBufferedReader(caminhoParaArquivo,
                StandardCharsets.UTF_8)){
			
			String linha = br.readLine();
			
			//Loop ate todas as linhas serem lidas.
			int numeroLinha = 0;
			while(linha != null) {
				if(numeroLinha != 0) {
					String[] valoresAtributos = linha.split("\t");
				
					Relatorio relatorio = montaRelatorio(valoresAtributos);
				
					relatorios.add(relatorio);
				
					
				}
				numeroLinha++;
				//pega informacao para próxima linha caso não tenha retorna null 
				linha = br.readLine();
			}
			numeroLinha = 0;
			br.close();
			
		}catch (IOException ioe) {
            ioe.printStackTrace();
        }
		return relatorios;
	}
	
	private static Relatorio montaRelatorio(String [] campos) {
		String regiao = campos[0];
		String sigla = campos[1];
		String estado = campos[2];
		String municipio = campos[3];
		String revenda = campos[4];
		String cnpj = campos[5];
		String nomeProduto = campos[6];
		String dataColeta = campos[7];
		String valorVenda = campos[8];
		String valorCompra = campos[9];
		String unidadeMedida = campos[10];
		String bandeira = campos[11];
		return  new Relatorio(regiao, sigla, estado, municipio,revenda,cnpj,
				nomeProduto,dataColeta,valorVenda,valorCompra, unidadeMedida, bandeira);
	}
}
