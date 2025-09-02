package com.devsu.audittransactions.infraestructure.adapters.database.adapter;

import com.devsu.audittransactions.infraestructure.adapters.database.ITransactionAuditAdapter;
import com.devsu.audittransactions.infraestructure.adapters.database.entity.TransactionAudit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionAuditAdapter implements ITransactionAuditAdapter {


    @Override
    public void saveTransactionAudit(TransactionAudit transactionAudit) {

    }
}
