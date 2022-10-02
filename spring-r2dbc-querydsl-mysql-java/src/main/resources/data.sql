truncate table r2dbc.team_tb;
truncate table r2dbc.member_tb;

INSERT INTO r2dbc.team_tb (id, name) VALUES (1, 'alpha');
INSERT INTO r2dbc.team_tb (id, name) VALUES (2, 'beta');
INSERT INTO r2dbc.team_tb (id, name) VALUES (3, 'gamma');

INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 1, 'alex', 'alex123@test.com', '010-1111-1111');
INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 1, 'kate', 'kate123@test.com', '010-1111-1112');
INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 1, 'john', 'john123@test.com', '010-1111-1113');

INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 2, 'ben', 'ben123@test.com', '010-2111-1111');
INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 2, 'sally', 'sally123@test.com', '010-2111-1112');
INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 2, 'jake', 'jake123@test.com', '010-2111-1113');

INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 3, 'tom', 'tom123@test.com', '010-1111-3111');
INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 3, 'jerry', 'jerry123@test.com', '010-1111-3112');
INSERT INTO r2dbc.member_tb (id, team_id, name, email, phone_number) VALUES (null, 3, 'annie', 'annie13@test.com', '010-1111-3113');