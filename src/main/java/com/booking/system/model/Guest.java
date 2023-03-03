package com.booking.system.model;

import com.booking.system.Auditing.AuditingEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "guest")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Guest extends AuditingEntity{
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private String name;
       private Integer age;
       private String gender;
       private String address;
       
}
