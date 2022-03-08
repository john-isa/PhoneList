-- #### POST OPERATIONS ####
-- CREATE A NEW CUSTOMER (DEFAULT IS INACTIVE)
INSERT INTO telecom.users (first_name, middle_name, last_name, status)
VALUES 
('John',      '',          'Isailofski', 'inactive'),
('Paul',      'Ringo',     'Beetle',     'inactive'),
('Fenchurch', 'Anne',      'Ethereal',   'inactive'),
('Yolanda',   'Pert',      'Nose',       'inactive'),
('Prithee',   'Parallel',  'Pendragon',  'inactive'),
('Butch',     'Fogart',    'McKenneddy', 'inactive'),
('Samwise',   'Chubster',  'Gangee',     'inactive'),
('Cruella',   'Turncoat',  'Deville',    'inactive'),
('Elizabeth', 'Maree',     'Isailofski', 'inactive'),
('Elizabeth', 'Maree',     'Morgan',     'inactive'),
('Eleanor',   'Elizabeth', 'Morgan',     'inactive'),
('Samuel',    'Heman',     'Morgan',     'inactive'),
('Joshua',    'Phillip',   'Morgan',     'inactive'),
('Butch',     'Fogart',    'McKenneddy', 'inactive'),
('Priscilla', 'Elvira',    'Presley',    'inactive');

-- #### GET OPERATIONS ####
-- GET A LIST OF CUSTOMERS
SELECT * FROM telecom.users;

-- GET A LIST OF CUSTOMERS BY STATUS
SELECT * FROM telecom.users
   WHERE status = 'inactive';                -- status will be parameterised


-- #### PUT OPERATIONS ####
-- ACTIVATE/DE-ACTIVATE AN EXISTING CUSTOMER
UPDATE telecom.users 
   SET status = 'active'                     -- status will be parameterised
   WHERE user_id = 2                         -- user_id will be parameterised

-- DELETE AN EXISTING INACTIVE CUSTOMER
DELETE FROM telecom.users
   SET status = 'inactive'                   -- status will be parameterised
   WHERE user_id = 6                         -- user_id will be parameterised

-- #### DELETE OPERATIONS ####
-- DELETE ALL EXISTING INACTIVE CUSTOMER
DELETE FROM telecom.users
    WHERE status = 'inactive';
