CREATE TABLE transaction_audit
(
    id_transaction BIGINT NOT NULL,
    create_date    datetime NULL,
    client_name    VARCHAR(255) NULL,
    account_number VARCHAR(255) NULL,
    account_type   VARCHAR(255) NULL,
    initial_balance DOUBLE NOT NULL,
    state          BIT(1) NOT NULL,
    transaction_amount DOUBLE NOT NULL,
    balance DOUBLE NOT NULL,
    CONSTRAINT pk_transaction_audit PRIMARY KEY (id_transaction)
);