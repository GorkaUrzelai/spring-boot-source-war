INSERT INTO customers (first_name, email, username, password, enabled)
VALUES ('gorka', 'gorkaurzelai2000@gmail.com', 'gurzelai',
        '$2a$04$1phuHnQ6r8yr8qktXpuFCOzd2SimSMbsIppAU4eT2NNGRN.Twlu2K',
        0b1);
INSERT INTO customers (first_name, email, username, password, enabled)
VALUES ('gorka', 'gorkaurzelai2000@gmail.com', 'gurzelai1',
        '$2a$04$1phuHnQ6r8yr8qktXpuFCOzd2SimSMbsIppAU4eT2NNGRN.Twlu2K',
        0b1);
INSERT INTO customers (first_name, email, username, password, enabled)
VALUES ('gorka', 'gorkaurzelai2000@gmail.com', 'gurzelai2',
        '$2a$04$1phuHnQ6r8yr8qktXpuFCOzd2SimSMbsIppAU4eT2NNGRN.Twlu2K',
        0b1);

INSERT INTO authorities (id, authority)
VALUES (1, "ROLE_ADMIN");
INSERT INTO authorities (id, authority)
VALUES (2, "ROLE_CUSTOMER");

INSERT INTO authorities_users (customer_id, authority_id)
VALUES (1, 1);
INSERT INTO authorities_users (customer_id, authority_id)
values (2, 2);