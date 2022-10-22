INSERT INTO r2dbc.team(id, team_name) VALUES (1, 'A팀');
INSERT INTO r2dbc.team(id, team_name) VALUES (2, 'B팀');
INSERT INTO r2dbc.team(id, team_name) VALUES (3, 'C팀');


INSERT INTO r2dbc.person(id, name, phone_number, team_id) VALUES (null, 'jerry', '010-222-2222', 1);
INSERT INTO r2dbc.person(id, name, phone_number, team_id) VALUES (null, 'alex', '010-221-2222', 1);
INSERT INTO r2dbc.person(id, name, phone_number, team_id) VALUES (null, 'bill', '010-2234-2222', 2);
INSERT INTO r2dbc.person(id, name, phone_number, team_id) VALUES (null, 'molly', '010-224-2222', 3);