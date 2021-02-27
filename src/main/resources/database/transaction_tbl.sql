USE hclhackathon;

--transactions
CREATE table transaction_tbl(
  id BIGINT NOT NULL AUTO_INCREMENT,
  message_id BIGINT NOT NULL,
   PRIMARY KEY (id )

)


CREATE table accounts_tbl( --creditor/debitor
  id BIGINT NOT NULL AUTO_INCREMENT,
  name  BIGINT NOT NULL,

   PRIMARY KEY (id )
)


CREATE table sanctions_tbl( --sanctions country list
  id BIGINT NOT NULL AUTO_INCREMENT,
  country  BIGINT NOT NULL,
  isSanctioned BIT NOT NULL,
   PRIMARY KEY (id )
)


CREATE table account_bal_tbl( --creditor/debitor account balance
  id BIGINT NOT NULL AUTO_INCREMENT,
  account_name  varchar(50) NOT NULL,
  account_type  varchar(50) NOT NULL,
  balance  varchar(50) NOT NULL,
   PRIMARY KEY (id )
)

