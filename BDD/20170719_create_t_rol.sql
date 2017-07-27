CREATE TABLE "public".slib_rol (
codigo int8 NOT NULL,
descripcion_txt varchar(400) NOT NULL,
estado_int int2 NOT NULL,
PRIMARY KEY (codigo),
CONSTRAINT pk_rol UNIQUE (codigo)
)
WITH (OIDS=FALSE)
;

COMMENT ON TABLE "public".slib_rol IS 'Tabla que almacena los roles del sistema';
COMMENT ON COLUMN "public".slib_rol.codigo IS 'CLAVE PRIMARIA DE LA TABLA';
COMMENT ON COLUMN "public".slib_rol.descripcion_txt IS 'NOMBRE QUE IDENTIFICA AL ROL';
COMMENT ON COLUMN "public".slib_rol.estado_int IS 'ESTADO DEL REGISTRO 1 ACTIVO 0 INACTIVO';

CREATE INDEX index_pk_rol ON "public".slib_rol (codigo, descripcion_txt);

CREATE SEQUENCE rol_cod_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 10
  CACHE 1;
ALTER TABLE "public".slib_rol
  OWNER TO postgres;