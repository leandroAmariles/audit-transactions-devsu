package com.devsu.audittransactions.infraestructure.adapters.database.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TRANSACTION_AUDIT")
public class TransactionAudit {

    @Id
    private Long idTransaction;

    private LocalDateTime createDate;

    private String clientName;

    private String accountNumber;

    private String accountType;

    private double initialBalance;

    private boolean state;

    private double transactionAmount;

    private double balance;
}
