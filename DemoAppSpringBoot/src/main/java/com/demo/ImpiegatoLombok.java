package com.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //COSTRUTTORE SENZA ARGOMENTI
@AllArgsConstructor //COSTRUTTORE CON TUTTI GLI ARGOMENTI
		//ALTRE ANNOTATION DISPONIBILI SU PROJECTLOMBOK.ORG/FEATURES/ALL
public class ImpiegatoLombok {

	private String nome;
	private String cognome;

	//LOMBOK SERVE PER CREARE I METODI STANDARD(GET E SET E ALTRI)
	//AGGIUNGENDO SOLO QUESTE TRE ANNOTATION
	//NECESSITA SOLO DELL'INNESTO DELLA DEPENDENCY NEL POM
}
