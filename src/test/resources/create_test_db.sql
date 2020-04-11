CREATE TABLE IF NOT EXISTS address (
    id bigint NOT NULL,
    city character varying(255) NOT NULL,
    country character varying(255) NOT NULL,
    street character varying(255) NOT NULL,
    street_additional character varying(255),
    zip_code character varying(255) NOT NULL
);


CREATE SEQUENCE IF NOT EXISTS address_id_seq;


CREATE TABLE IF NOT EXISTS company (
    id character varying NOT NULL,
    created_date timestamp without time zone,
    description text,
    email character varying(255),
    is_active boolean,
    last_modified_date timestamp without time zone,
    name character varying(255) NOT NULL,
    siret character varying(255) NOT NULL,
    address_id bigint
);


CREATE TABLE IF NOT EXISTS influencer (
    id character varying NOT NULL,
    created_date timestamp without time zone,
    description text,
    email character varying(255),
    is_active boolean,
    last_modified_date timestamp without time zone,
    date_of_birth timestamp without time zone,
    first_name character varying(255) NOT NULL,
    last_name character varying(255) NOT NULL,
    address_id bigint,
    links_id bigint
);


CREATE TABLE IF NOT EXISTS influencer_niches (
    influencer_id character varying NOT NULL,
    niches character varying(255)
);

CREATE TABLE IF NOT EXISTS product (
    id bigint NOT NULL,
    description text,
    link character varying(255),
    name character varying(255) NOT NULL,
    picture character varying(255)
);


CREATE SEQUENCE IF NOT EXISTS product_id_seq;


-- ALTER SEQUENCE IF NOT EXISTS product_id_seq OWNED BY product.id;


CREATE TABLE IF NOT EXISTS social_media_infos (
    id bigint NOT NULL,
    facebook_link character varying(255),
    instagram_link character varying(255),
    pinterest_link character varying(255),
    twitter_link character varying(255),
    youtube_link character varying(255)
);


-- ALTER TABLE ONLY  address ALTER COLUMN id SET DEFAULT nextval('public.address_id_seq'::regclass);
--
--
-- --
-- -- Name: product id; Type: DEFAULT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY  product ALTER COLUMN id SET DEFAULT nextval('public.product_id_seq'::regclass);


--
-- Data for Name: address; Type: TABLE DATA; Schema: public; Owner: admin_db_f2f
--



--
-- Data for Name: company; Type: TABLE DATA; Schema: public; Owner: admin_db_f2f
--



--
-- Data for Name: influencer; Type: TABLE DATA; Schema: public; Owner: admin_db_f2f
--

INSERT INTO influencer VALUES ('5e94d9a0-3123-4523-9b71-4236b4cef93e', '2020-04-10 02:29:15.644', NULL, NULL, NULL, '2020-04-10 02:29:15.644', NULL, 'Snow', 'John', NULL, NULL);
INSERT INTO influencer VALUES ('bafd0939-8501-4425-bce3-d18e304dc148', '2020-04-10 22:15:14.483', NULL, NULL, NULL, '2020-04-10 22:15:14.483', NULL, 'Snow', 'John', NULL, NULL);
INSERT INTO influencer VALUES ('094a7fc4-0e73-499a-8c32-2ea2a1431366', '2020-04-11 00:21:37.406', NULL, NULL, NULL, '2020-04-11 00:21:37.406', NULL, 'Snow', 'John', NULL, NULL);


--
-- Data for Name: influencer_niches; Type: TABLE DATA; Schema: public; Owner: admin_db_f2f
--

INSERT INTO influencer_niches VALUES ('5e94d9a0-3123-4523-9b71-4236b4cef93e', 'LIFESTYLE');
INSERT INTO influencer_niches VALUES ('bafd0939-8501-4425-bce3-d18e304dc148', 'LIFESTYLE');
INSERT INTO influencer_niches VALUES ('094a7fc4-0e73-499a-8c32-2ea2a1431366', 'LIFESTYLE');


--
-- Data for Name: product; Type: TABLE DATA; Schema: public; Owner: admin_db_f2f
--



--
-- Data for Name: social_media_infos; Type: TABLE DATA; Schema: public; Owner: admin_db_f2f
--


--
-- --
-- -- Name: address_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin_db_f2f
-- --
--
-- SELECT pg_catalog.setval('public.address_id_seq', 1, false);
--
--
-- --
-- -- Name: product_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin_db_f2f
-- --
--
-- SELECT pg_catalog.setval('public.product_id_seq', 1, false);
--
--
-- --
-- -- Name: address address_pkey; Type: CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY address
--     ADD CONSTRAINT address_pkey PRIMARY KEY (id);
--
--
-- --
-- -- Name: company company_pkey; Type: CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY company
--     ADD CONSTRAINT company_pkey PRIMARY KEY (id);
--
--
-- --
-- -- Name: influencer influencer_pkey; Type: CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY influencer
--     ADD CONSTRAINT influencer_pkey PRIMARY KEY (id);
--
--
-- --
-- -- Name: product product_pkey; Type: CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY product
--     ADD CONSTRAINT product_pkey PRIMARY KEY (id);
--
--
-- --
-- -- Name: social_media_infos social_media_infos_pkey; Type: CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY social_media_infos
--     ADD CONSTRAINT social_media_infos_pkey PRIMARY KEY (id);
--
--
-- --
-- -- Name: influencer_niches fk41mnmaky49e6jc64iwwl63u72; Type: FK CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY influencer_niches
--     ADD CONSTRAINT fk41mnmaky49e6jc64iwwl63u72 FOREIGN KEY (influencer_id) REFERENCES influencer(id);
--
--
-- --
-- -- Name: influencer fkc2cypekpg5wn6i1npktyym83r; Type: FK CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY influencer
--     ADD CONSTRAINT fkc2cypekpg5wn6i1npktyym83r FOREIGN KEY (links_id) REFERENCES social_media_infos(id);
--
--
-- --
-- -- Name: company fkgfifm4874ce6mecwj54wdb3ma; Type: FK CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY company
--     ADD CONSTRAINT fkgfifm4874ce6mecwj54wdb3ma FOREIGN KEY (address_id) REFERENCES address(id);
--
--
-- --
-- -- Name: influencer fkthd5f05m1cllqb6s6pn20fk7n; Type: FK CONSTRAINT; Schema: public; Owner: admin_db_f2f
-- --
--
-- ALTER TABLE ONLY influencer
--     ADD CONSTRAINT fkthd5f05m1cllqb6s6pn20fk7n FOREIGN KEY (address_id) REFERENCES address(id);
