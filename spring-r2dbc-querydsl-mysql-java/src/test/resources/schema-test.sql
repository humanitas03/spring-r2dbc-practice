CREATE TABLE IF NOT EXISTS member_tb (
      id        BIGINT NOT NULL AUTO_INCREMENT,
      team_id   BIGINT NOT NULL,
      name     VARCHAR(100),
      email    VARCHAR(100),
      phone_number   VARCHAR(100),
      PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS team_tb (
        id        BIGINT NOT NULL AUTO_INCREMENT,
        name     VARCHAR(100),
        PRIMARY KEY(id)
);