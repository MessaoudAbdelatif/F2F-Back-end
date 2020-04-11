-- ########  INFLUNCERS & COMPAGNIES => ADDRESSES  ###########
INSERT INTO address
VALUES ('1', 'Lyon', 'France', '150 Avenue de paris', NULL, '69000');
INSERT INTO address
VALUES ('2', 'Paris', 'France', '1 route de lyon', NULL, '75000');
INSERT INTO address
VALUES ('3', 'Marseille', 'France', '24 boulevard de paris', NULL, '13000');
INSERT INTO address
VALUES ('4', 'Lyon', 'France', '133 Avenue de paris', NULL, '69000');
INSERT INTO address
VALUES ('5', 'Paris', 'France', '4 route de lyon', NULL, '75000');
INSERT INTO address
VALUES ('6', 'Marseille', 'France', '76 boulevard de paris', NULL, '13000');

-- ############## FAKE INFLUENCERS ################
INSERT INTO influencer
VALUES ('5e94d9a0-3123-4523-9b71-4236b4cef93e', '2020-04-10 02:29:15.644', NULL, NULL, NULL,
        '2020-04-10 02:29:15.644', NULL, 'Sand', 'John', 'LIFESTYLE', '1', NULL);
INSERT INTO influencer
VALUES ('bafd0939-8501-4425-bce3-d18e304dc148', '2020-04-10 22:15:14.483', NULL, NULL, NULL,
        '2020-04-10 22:15:14.483', NULL, 'Gonzalez', 'Maria', 'LIFESTYLE', '2', NULL);
INSERT INTO influencer
VALUES ('094a7fc4-0e73-499a-8c32-2ea2a1431366', '2020-04-11 00:21:37.406', NULL, NULL, NULL,
        '2020-04-11 00:21:37.406', NULL, 'Ali', 'Mohammed', 'LIFESTYLE', '3', NULL);
-- #############  FAKE COMPAGNIES ##################

INSERT INTO company
VALUES ('094a7fc4-0e73-499a-8c32-2ea2a1431367', '2020-04-11 00:21:37.406', NULL, NULL, NULL,
        '2020-04-11 00:21:37.406', 'Boulangerie BonPain', '1234567889231', '4');
INSERT INTO company
VALUES ('094a7fc4-0e73-499a-8c32-2ea2a1431368', '2020-04-11 00:21:37.406', NULL, NULL, NULL,
        '2020-04-11 00:21:37.406', 'Coiffure Tendance', '1234567889232', '5');
INSERT INTO company
VALUES ('094a7fc4-0e73-499a-8c32-2ea2a1431369', '2020-04-11 00:21:37.406', NULL, NULL, NULL,
        '2020-04-11 00:21:37.406', 'Café délices', '1234567889233', '6');
