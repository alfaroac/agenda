
CREATE TABLE Calendar (
                id INT AUTO_INCREMENT NOT NULL,
                weekCalendar VARCHAR(2) NOT NULL,
                dayCalendar VARCHAR(2) NOT NULL,
                dateCalendar DATE NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Users (
                id INT AUTO_INCREMENT NOT NULL,
                userName VARCHAR(40),
                userPassword VARCHAR(60),
                firstName VARCHAR(40) NOT NULL,
                lastName VARCHAR(100) NOT NULL,
                dni VARCHAR(8) NOT NULL,
                sex VARCHAR(20) NOT NULL,
                address VARCHAR(100) NOT NULL,
                telephone VARCHAR(13) NOT NULL,
                email VARCHAR(100),
                state VARCHAR(20) NOT NULL,
                image VARCHAR(100),
                role VARCHAR(40) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Institution (
                id INT AUTO_INCREMENT NOT NULL,
                codeInstitution VARCHAR(20) NOT NULL,
                nameInstitution VARCHAR(100) NOT NULL,
                address VARCHAR(100) NOT NULL,
                latitude VARCHAR(10),
                longitude VARCHAR(10),
                state VARCHAR(20) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Manager (
                id INT AUTO_INCREMENT NOT NULL,
                yearWork VARCHAR(4) NOT NULL,
                state VARCHAR(20) NOT NULL,
                UserId INT NOT NULL,
                InstitutionId INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Files (
                id INT AUTO_INCREMENT NOT NULL,
                nameFile VARCHAR(100) NOT NULL,
                description VARCHAR(300) NOT NULL,
                dateLoad DATETIME NOT NULL,
                institutionId INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Activity (
                id INT AUTO_INCREMENT NOT NULL,
                userInvited VARCHAR(100),
                title VARCHAR(100) NOT NULL,
                description VARCHAR(300),
                place VARCHAR(80) NOT NULL,
                dateEvent DATETIME NOT NULL,
                startHour VARCHAR(5) NOT NULL,
                endHour VARCHAR(5) NOT NULL,
                priority VARCHAR(20) NOT NULL,
                userId INT NOT NULL,
                calendarId INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Evidences (
                id INT AUTO_INCREMENT NOT NULL,
                description VARCHAR(300) NOT NULL,
                fileEvidences VARCHAR(60),
                activityId INT NOT NULL,
                PRIMARY KEY (id)
);


ALTER TABLE Activity ADD CONSTRAINT calendar_activity_fk
FOREIGN KEY (calendarId)
REFERENCES Calendar (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Activity ADD CONSTRAINT users_activity_fk
FOREIGN KEY (userId)
REFERENCES Users (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Manager ADD CONSTRAINT users_director_fk
FOREIGN KEY (UserId)
REFERENCES Users (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Files ADD CONSTRAINT institution_files_fk
FOREIGN KEY (institutionId)
REFERENCES Institution (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Manager ADD CONSTRAINT institution_director_fk
FOREIGN KEY (InstitutionId)
REFERENCES Institution (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Evidences ADD CONSTRAINT activity_evidences_fk
FOREIGN KEY (activityId)
REFERENCES Activity (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
