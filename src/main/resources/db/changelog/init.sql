-- liquibase formatted sql

-- changeset Muzaffar-Ashurov:create-shcool-table
-- preconditions onFail:MARK_RAN
-- precondition-sql-check expectedResult:0 select count(*) from information_schema.TABLES where TABLE_NAME='school';
CREATE TABLE school (
  id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255) NOT NULL,
   address VARCHAR(255) NOT NULL,
   CONSTRAINT pk_school PRIMARY KEY (id)
);

  -- changeset Muzaffar-Ashurov:create-group_entity-table
  -- preconditions onFail:MARK_RAN
  -- precondition-sql-check expectedResult:0 select count(*) from information_schema.TABLES where TABLE_NAME='group_entity';

CREATE TABLE group_entity (
  id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255) NOT NULL,
   school_id BIGINT NOT NULL,
   CONSTRAINT pk_group_entity PRIMARY KEY (id)
);
  -- changeset Muzaffar-Ashurov:create-student-table
  -- preconditions onFail:MARK_RAN
  -- precondition-sql-check expectedResult:0 select count(*) from information_schema.TABLES where TABLE_NAME='student';

CREATE TABLE student (
  id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255) NOT NULL,
   sur_name VARCHAR(255) NOT NULL,
   group_id BIGINT NULL,
   school_id BIGINT NULL,
   CONSTRAINT pk_student PRIMARY KEY (id)
);

  -- changeset Muzaffar-Ashurov:create-group_student-table
    -- preconditions onFail:MARK_RAN
    -- precondition-sql-check expectedResult:0 select count(*) from information_schema.TABLES where TABLE_NAME='group_student';

CREATE TABLE group_entity_students (
  group_id BIGINT NOT NULL,
   students_id BIGINT NOT NULL,
   CONSTRAINT pk_group_entity_students PRIMARY KEY (group_id, students_id)
);

ALTER TABLE group_entity_students ADD CONSTRAINT uc_group_entity_students_gridstid UNIQUE (group_id, students_id);

ALTER TABLE group_entity_students ADD CONSTRAINT fk_groentstu_on_group FOREIGN KEY (group_id) REFERENCES group_entity (id);

ALTER TABLE group_entity_students ADD CONSTRAINT fk_groentstu_on_student FOREIGN KEY (students_id) REFERENCES student (id);
