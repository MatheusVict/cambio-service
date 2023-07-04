CREATE TABLE cambio (
  id BIGINT AUTO_INCREMENT NOT NULL,
   from_currency VARCHAR(3) NOT NULL,
   to_currency VARCHAR(3) NOT NULL,
   conversion_factor DECIMAL NOT NULL,
   CONSTRAINT pk_cambio PRIMARY KEY (id)
);