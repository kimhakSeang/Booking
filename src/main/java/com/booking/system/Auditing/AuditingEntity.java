package com.booking.system.Auditing;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditingEntity {
	
	@CreatedDate
	@Column(name = "date_create")
	private LocalDateTime dateCreate;
	
	@LastModifiedDate
	@Column(name = "date_update")
	private LocalDateTime dateUpdate;

}
