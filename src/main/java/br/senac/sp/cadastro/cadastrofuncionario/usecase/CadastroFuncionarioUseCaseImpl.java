package br.senac.sp.cadastro.cadastrofuncionario.usecase;

import br.senac.sp.cadastro.cadastrofuncionario.model.FuncionarioModel;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CadastroFuncionarioUseCaseImpl implements CadastroFuncionarioUseCase {


    @Override
    public FuncionarioModel buscarFuncionario(Integer id) {
        return new FuncionarioModel()
                .setId(id)
                .setNome("Mioko")
                .setIdade(38)
                .setSalario(Double.valueOf("5000.00"))
                .setCargo("Segurança")
                .setHorasMensais(60);
    }

    @Override
    public FuncionarioModel criarFuncionario(String nome, Integer idade, Double salario, String cargo, Integer horasMensais) {
        return new FuncionarioModel()
                .setId(new Random().nextInt())
                .setNome(nome)
                .setIdade(idade)
                .setSalario(salario)
                .setCargo(cargo)
                .setHorasMensais(horasMensais);
    }


}

/*
*  private Integer id;
    private String nome;
    private Integer idade;
    private Double salario;
    private String cargo;
    private Integer horasMensais;
* */