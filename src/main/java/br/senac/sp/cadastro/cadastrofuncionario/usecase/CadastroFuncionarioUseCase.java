package br.senac.sp.cadastro.cadastrofuncionario.usecase;

import br.senac.sp.cadastro.cadastrofuncionario.model.FuncionarioModel;

public interface CadastroFuncionarioUseCase {

    FuncionarioModel buscarFuncionario(Integer id);

    FuncionarioModel criarFuncionario(String nome,
                                      Integer idade,
                                      Double salario,
                                      String cargo,
                                      Integer horasMensais);



}
