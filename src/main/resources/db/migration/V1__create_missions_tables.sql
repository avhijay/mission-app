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
    Allowed_Clearancelevel VARCHAR(255) NOT NULL
     CHECK (Allowed_Clearancelevel IN (
          '1 STAR', '2 STAR', '3 STAR', '4 STAR', '5 STAR', '6 STAR', '7 STAR'
        )
        ),

    Live_Feed_Url VARCHAR(255),
    Is_Live_Enabled BOOLEAN


);

