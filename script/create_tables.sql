CREATE TABLE usuario
(
  login character(20) NOT NULL,
  senha character(20),
  permissao character(20),
  CONSTRAINT "PK_login" PRIMARY KEY (login)
);

CREATE TABLE cadastroenviodesenho
(
  nome character(50) NOT NULL,
  enviar character(20),
  CONSTRAINT "PK_nome" PRIMARY KEY (nome)
);
