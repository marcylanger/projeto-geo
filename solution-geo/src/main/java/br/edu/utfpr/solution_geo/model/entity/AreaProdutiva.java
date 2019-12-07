package br.edu.utfpr.solution_geo.model.entity;

import javax.persistence.Entity;

import org.springframework.data.geo.Polygon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class AreaProdutiva extends AbstractEntity {

	private String nome;
	
	private String descriçao;
	
	private Polygon theGeom;
	
	
}
