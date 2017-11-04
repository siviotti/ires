package com.github.siviotti.ires.domain.service;

import java.util.List;
import java.util.Optional;

import com.github.siviotti.ires.domain.model.Declaracao;

/**
 * Interface que define o método de processamento de "Malha Fina" do imposto de
 * renda. O objetivo da malha é identificar declarações com prováveis
 * irregularidades. Algumas características presentes nas declarações podem
 * sugerir que haja alguma fraude ou erro de preenchimento. Se a declaração
 * apresentar alguma destas características é gerado um impedimento com o motivo
 * específico para a declaração em questão ter caído em malha.
 *
 * @author Douglas Siviotti
 *
 */
@FunctionalInterface
public interface MalhaFiscal {

	/**
	 * Executa o processamento de malha fiscal sobre uma declaração e retorna uma
	 * lista (opcional) com os impedimentos deste declaração. Se não houver lista é
	 * porque a declaração não caiu em malha. Se houver, os itens na lista são os
	 * motivos desya declaração estar na malha fina.
	 * 
	 * @param declaracao
	 *            A declaração que será analisada.
	 * @return Uma lista com os motivos da declaração ter caído em malha ou um
	 *         Optional vazio se não há impedimento.
	 */
	Optional<List<String>> processar(Declaracao declaracao);

}
