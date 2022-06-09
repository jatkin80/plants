create table plant (
  id serial primary key, -- Auto incrementing IDs
  name TEXT,
  type VARCHAR (255),
date_added DATE NOT NULL,
days_to_maturity INT,
notes TEXT
);

INSERT INTO plant (name, date_added)
VALUES('Heirloom Tomato', 'vegetable', '2022-04-07', 45)