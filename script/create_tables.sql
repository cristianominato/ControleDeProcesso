CREATE TABLE cadastroenviodesenho
(
  nome character(50) NOT NULL,
  enviar character(20),
  CONSTRAINT "PK_nome" PRIMARY KEY (nome)
);

CREATE TABLE cadastrodesenho
(
  desenho character(30) NOT NULL,
  revisao integer,
  cadastroenviodesenho character(50),
  "FK_cadastroenviodesenho" character(50),
  CONSTRAINT "PK_desenho" PRIMARY KEY (desenho),
  CONSTRAINT "FK_cadastroenviodesenho" FOREIGN KEY ("FK_cadastroenviodesenho")
      REFERENCES cadastroenviodesenho (nome) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
