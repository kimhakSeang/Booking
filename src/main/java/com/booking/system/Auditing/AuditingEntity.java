package com.booking.system.Auditing;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
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
