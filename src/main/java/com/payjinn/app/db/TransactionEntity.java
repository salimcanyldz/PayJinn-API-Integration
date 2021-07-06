package com.payjinn.app.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="transaction_detail")
@NoArgsConstructor
@RequiredArgsConstructor
public class TransactionEntity {
	@Id
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	private int id;
	@Column(name="details")
	@NonNull private String transactionDetails;
}
