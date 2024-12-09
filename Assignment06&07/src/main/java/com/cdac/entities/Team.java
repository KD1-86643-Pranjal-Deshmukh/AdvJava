package com.cdac.entities;
import javax.persistence.*;
@Entity

@Table(name="teams")
@Getter
@Setter
@ToString
public class Team extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 20, name="team_name", unique=true)
	private String name;
	@Column(length = 10, unique=true)
	private String abbravation;
	@Column(length = 10, nullable=false)
	private String owner;
	@Column(name="max_player_age")
	private int age;
	@Column(name="batting_avg")
	private double battingAverage;
	@Column(name="wickets_taken")
	private int wickets;
	public Team() {
	}
	public Team(String owner,String abbravation)
	{
		this.owner=owner;
		this.abbravation=abbravation;
	}
	public Team(String name, String abbravation, String owner, int age, double battingAverage, int wickets) {
		super();
		this.name = name;
		this.abbravation = abbravation;
		this.owner = owner;
		this.age = age;
		this.battingAverage = battingAverage;
		this.wickets = wickets;
	}
	
}
