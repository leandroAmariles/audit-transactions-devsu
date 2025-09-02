package com.devsu.audittransactions.infraestructure.adapters.database;

import com.devsu.audittransactions.infraestructure.adapters.database.entity.TransactionAudit;

import java.util.List;

public interface ITransactionAuditAdapter {

    void saveTransactionAudit(TransactionAudit transactionAudit);

    List<TransactionAudit> getTransactionAudits(TransactionAudit transactionAudit);
}
