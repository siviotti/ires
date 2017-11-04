package com.github.siviotti.ires.domain.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma decleração de IRPF (Imposto de Renda Pessoa Física) de escopo
 * reduzido (somente recebimentos, pagamentos e dependentes).
 * 
 * @author Douglas Siviotti
 *
 */
public class Declaracao {

	private String cpf;
	private String ano;
	private boolean simplificada;
	private Situacao situacao;
	private String recibo;
	private List<Recebimento> recebimentos = new ArrayList<>();
	private List<Dependente> dependentes = new ArrayList<>();
	private List<Pagamento> pagamentos = new ArrayList<>();
	
}
