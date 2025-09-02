package com.devsu.audittransactions.infraestructure.adapters.controller.dto.in;


import com.devsu.audittransactions.domain.interfaces.ITransactionsAuditService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuditTransactionController {

    private final ITransactionsAuditService auditTransactionService;

    @GetMapping("/generate-extract")
    ResponseEntity<byte[]> generateExtractReport(@RequestBody ExtractRequest extractRequest) {
        byte[] report = auditTransactionService.generateExtract(extractRequest);
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=extract_transactions.pdf");
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(report);
    }
}