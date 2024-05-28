CREATE TABLE documents
(
    id integer NOT NULL DEFAULT nextval('documents_id_seq'::regclass),
    number_doc integer NOT NULL,
    type_doc character varying(100) COLLATE pg_catalog."default" NOT NULL,
    department character varying(30) COLLATE pg_catalog."default" NOT NULL,
    date_doc date,
    CONSTRAINT documents_pkey PRIMARY KEY (id)
)