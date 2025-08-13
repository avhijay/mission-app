CREATE TABLE missions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Name_of_Mission VARCHAR(255) NOT NULL,
    Location_of_Mission VARCHAR(255) NOT NULL,
    Terrain_of_mission VARCHAR(255) NOT NULL,
    Weather_at_location VARCHAR(255) NOT NULL,
    Duration_of_Mission INT NOT NULL,
    Mission_Type VARCHAR(255) NOT NULL,
    Equipment_level VARCHAR(255) ,
    operative_name VARCHAR(255),
    Budget DOUBLE,
    Activity_Status VARCHAR(50) NOT NULL   DEFAULT 'active' CHECK (Activity_Status IN ('active', 'nonactive')),
    access_Password VARCHAR(255) NOT NULL,
    Allowed_Clearancelevel INT NOT NULL
     CHECK (Allowed_Clearancelevel IN (
          1,2,3,4,5,6,7
        )
        ),

    Live_Feed_Url VARCHAR(255),
    Is_Live_Enabled BOOLEAN,
    created_by_userid VARCHAR(50) NOT NULL,
    CONSTRAINT fk_created_by_id FOREIGN KEY (created_by_userid) REFERENCES USERS(employment_id)


);

