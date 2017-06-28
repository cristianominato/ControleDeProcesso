CREATE TABLE cadastroenviodesenho
(
  nome character(50) NOT NULL,
  enviar character(20),
  fkcadastrodesenho character(30),
  CONSTRAINT nome PRIMARY KEY (nome),
  CONSTRAINT fkcadastrodesenho FOREIGN KEY (fkcadastrodesenho) REFERENCES cadastrodesenho (desenho) ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE cadastrodesenho
(
  desenho character(30) NOT NULL,
  cadastroenviodesenho character(50),
  fkcadastroenviodesenho character(50),
  fkcadastroestrutura character(10),
  revisao character(10),
  CONSTRAINT desenho PRIMARY KEY (desenho),
  CONSTRAINT fkcadastroenviodesenho FOREIGN KEY (fkcadastroenviodesenho)
      REFERENCES cadastroenviodesenho (nome) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fkcadastroestrutura FOREIGN KEY (fkcadastroestrutura) REFERENCES cadastroestrutura (estrutura) ON UPDATE NO ACTION ON DELETE NO ACTION
);
