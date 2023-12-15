-- liquibase formatted sql

-- changeset Muzaffar-Ashurov:populate-school-table
INSERT INTO `myschool`.`school` (name, address) VALUES
('Oxford', 'England, London'),
('Harvard', 'USA, Washington DC');

-- changeset Muzaffar-Ashurov:populate-group_entity-table
INSERT INTO `myschool`.`group_entity` (name, school_id) VALUES
('Junior A', 1),
('Junior B', 1),
('Senior A', 2),
('Junior C', 1);

-- changeset Muzaffar-Ashurov:populate-student-table
INSERT INTO `myschool`.`student` (name, sur_name, group_id, school_id) VALUES
('Bob', 'Marley', 1, 1),
('Jon', 'Dou', 3, 2),
('Nick', 'Eddison', 2, 1),
('Eric', 'Jackson', 4, 1),
('Suzy', 'Hadson', 1, 1),
('Trever', 'Watson', 2, 1),
('Shon', 'Miller', 3, 2);

-- changeset Muzaffar-Ashurov:populate-group_entity_students-table
INSERT INTO `myschool`.`group_entity_students` (school_id, groups_id)
VALUES(1, 1),
(1, 2),
(2, 3),
(1, 4);
