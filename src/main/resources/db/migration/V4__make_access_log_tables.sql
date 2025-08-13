CREATE TABLE mission_access_logs(
id INT AUTO_INCREMENT PRIMARY KEY,
user_id VARCHAR(50) NOT NULL,
name_of_Mission VARCHAR(255) NOT NULL,
access_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
action VARCHAR (50),
access_granted BOOLEAN NOT NULL,
failed_reason VARCHAR(225),
FOREIGN KEY (user_id) REFERENCES users(employment_id),
FOREIGN KEY (name_of_Mission) REFERENCES missions(Name_of_Mission)
);