package com.booking.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.booking.system.Auditing.AuditingEntity;
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
