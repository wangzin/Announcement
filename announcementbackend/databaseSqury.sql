CREATE TABLE jobdetails (

id IDENTITY,
name VARCHAR(100),
shortDescription VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,
postdate date,
CONSTRAINT pk_jobs_id PRIMARY KEY (id)

);