package tn.enicarthage.internshipsmanagement.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SfeDTO {

	private int id;
	private String sujet;
	private String encadreur;
	private String etudiant;

	
}
