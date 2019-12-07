package br.edu.utfpr.solution_geo.model.entity;

import javax.persistence.Entity;

import org.springframework.data.geo.Point;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class EndDevice extends AbstractEntity {
	
	private String identificador;
	
	private Point theGeom;

}
