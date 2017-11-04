package com.github.siviotti.ires.domain.model;

import java.time.LocalDate;

/**
 * Um dependente é alguém que depende fincnceiramente de um contribuinte
 * elaborador de uma declaração e que pode dar direito a alguma dedução de
 * imposto.
 *
 * @author Douglas Siviotti
 *
 */
public class Dependente {

	private String cpf;
	private String nome;
	private LocalDate nascimento;
	private TipoDependente tipo;
}
