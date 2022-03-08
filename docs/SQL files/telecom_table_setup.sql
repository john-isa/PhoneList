DROP TABLE IF EXISTS telecom.numbers;
DROP TABLE IF EXISTS telecom.users;

CREATE TABLE IF NOT EXISTS telecom.users (
    user_id      INT             AUTO_INCREMENT PRIMARY KEY,
    first_name   VARCHAR(255)    NOT NULL,
    middle_name  VARCHAR(255)    NOT NULL,
    last_name    VARCHAR(255)    NOT NULL,
    status       ENUM(
                     'active', 
                     'inactive') NOT NULL DEFAULT 'inactive'  -- must be conciously activated!
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS telecom.numbers (
    id           INT             AUTO_INCREMENT PRIMARY KEY,
    user_id      INT,
    phone_type   ENUM(
                     'mobile',
                     'ip',
                     'landline') NOT NULL DEFAULT 'mobile',   -- people usually have mobile phones now
    country_code VARCHAR(3)      NOT NULL DEFAULT '061',      -- Australia
    area_code    VARCHAR(2)      NOT NULL DEFAULT '03',       -- Melbourne, Victoria
    phone_num    VARCHAR(10)     NOT NULL,                    -- handles both land-line and mobile formats
    status       ENUM(
                     'active', 
                     'inactive') NOT NULL DEFAULT 'inactive', -- must be conciously activated!
    FOREIGN KEY (user_id)
        REFERENCES users (user_id)
        ON UPDATE RESTRICT ON DELETE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
