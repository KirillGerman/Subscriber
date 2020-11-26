CREATE TABLE public.purchase
(
    id bigint,
    msisdn character varying(200) COLLATE pg_catalog."default",
    action character varying(200) COLLATE pg_catalog."default",
    "timestamp" timestamp without time zone
);

CREATE TABLE public.subscription
(
    id bigint,
    msisdn character varying(200) COLLATE pg_catalog."default",
    action character varying(200) COLLATE pg_catalog."default",
    "timestamp" timestamp without time zone
);