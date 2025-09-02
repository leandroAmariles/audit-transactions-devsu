package com.devsu.audittransactions.infraestructure.adapters.database.adapter;

import com.devsu.audittransactions.infraestructure.adapters.controller.dto.in.ExtractRequest;
import com.devsu.audittransactions.infraestructure.adapters.database.ITransactionAuditAdapter;
import com.devsu.audittransactions.infraestructure.adapters.database.entity.TransactionAudit;
import com.devsu.audittransactions.infraestructure.adapters.database.repository.TransactionAuditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionAuditAdapter implements ITransactionAuditAdapter {

    private final TransactionAuditRepository transactionAuditRepository;


    @Override
    public void saveTransactionAudit(TransactionAudit transactionAudit) {

    }

    @Override
    public List<TransactionAudit> getTransactionAudits(ExtractRequest extractRequest) {

            TransactionAudit transactionAudit = TransactionAudit.builder()
                    .clientName(extractRequest.clientName())
                    .build();

            ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                    .withIgnoreCase("clientName")
                    .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

            Example<TransactionAudit> example = Example.of(transactionAudit, exampleMatcher);

            List<TransactionAudit> results = transactionAuditRepository.findAll(example);

            return results;
        }
}
