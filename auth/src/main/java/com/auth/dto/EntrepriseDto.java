package com.auth.dto;

import java.util.Set;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Data
public class EntrepriseDto {
	 private UUID id;
	    private String name;
	    private String adresse;
	    private String secteuractivite;
	    private String Matricule;
	    private String ville;
	    private Set<UserDto> users;
	    private String siegesociale;
	    private String codeTVA;
	    private MultipartFile logo;
	    private byte[] returnedImg;
}
