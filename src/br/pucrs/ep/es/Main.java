package br.pucrs.ep.es;

public class Main {

    public static void main(String[] args) {
        CadastroFuncionarios cad;

        cad = CadastroFuncionarios.getInstance(); //como é singleton não tem construtor
/*

        cad.add(new Funcionario(100,"Zezinho",1000));

        cad.add(new Funcionario(200,"Huginho",2000));
        cad.add(new Funcionario(300,"Luizinho",3000));
        cad.add(new Funcionario(400,"John Smith",4000));

        cad.saveFile("funcionariosAula2.txt");
*/

        cad.cleanAll();

        try {
            cad.readFile("funcionariosAula2.txt");
        } catch (IllegalArgumentException x){
            System.err.format("Atenção erro na leitura do arquivo, meu!" + x);
        }

        System.out.println(cad.toString());

        System.out.println(cad.relatorio());

    }
}
