CREATE TABLE cadastroenviodesenho
(
  nome character(50) NOT NULL,
  enviar character(20),
  CONSTRAINT nome PRIMARY KEY (nome)
);

CREATE TABLE cadastrodesenho
(
  desenho character(30) NOT NULL,
  revisao character(10),
  fkcadastroenviodesenho character(50),
  CONSTRAINT desenho PRIMARY KEY (desenho),
  CONSTRAINT fkcadastroenviodesenho FOREIGN KEY (fkcadastroenviodesenho) REFERENCES cadastroenviodesenho (nome) ON UPDATE NO ACTION ON DELETE NO ACTION
);
