go fib_sf

-- SQL file: fib_sf_go.sql
-- Adding a new column to existing table t322

-- DDL (Data Definition Language) - ALTER TABLE to add new column
-- Syntax: ALTER TABLE table_name ADD COLUMN column_name data_type [constraints];

-- Example 1: Add a simple column
ALTER TABLE t322 ADD COLUMN new_column_name VARCHAR(255);

-- Example: Add m2i column as CHAR(1) NULL
ALTER TABLE t322 ADD COLUMN m2i CHAR(1) NULL;

-- Example 2: Add a column with constraints
ALTER TABLE t322 ADD COLUMN fib_value INTEGER NOT NULL DEFAULT 0;

-- Example 3: Add a column with specific position (MySQL specific)
-- ALTER TABLE t322 ADD COLUMN status VARCHAR(50) AFTER existing_column_name;

-- Example 4: Add multiple columns at once
ALTER TABLE t322 
ADD COLUMN created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN updated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;

-- Example 5: Add a column for Fibonacci sequence values
ALTER TABLE t322 ADD COLUMN fibonacci_sequence INTEGER;

-- If you need to populate the new column with Fibonacci values, you can use UPDATE statements
-- Note: This is a simple example - for complex Fibonacci calculations, you might need a stored procedure

-- Update examples (uncomment and modify as needed):
-- UPDATE t322 SET fibonacci_sequence = 1 WHERE id = 1;
-- UPDATE t322 SET fibonacci_sequence = 1 WHERE id = 2;
-- UPDATE t322 SET fibonacci_sequence = 2 WHERE id = 3;
-- UPDATE t322 SET fibonacci_sequence = 3 WHERE id = 4;
-- UPDATE t322 SET fibonacci_sequence = 5 WHERE id = 5;

-- To verify the column was added:
-- DESCRIBE t322;
-- or
-- SHOW COLUMNS FROM t322;

-- Common data types for new columns:
-- INTEGER, BIGINT, DECIMAL(precision, scale)
-- VARCHAR(length), TEXT
-- DATE, DATETIME, TIMESTAMP
-- BOOLEAN (or TINYINT(1) in MySQL)
-- JSON (in newer MySQL versions)

-- Remember to consider:
-- 1. Default values for existing rows
-- 2. NOT NULL constraints (may require default values)
-- 3. Indexes if the column will be frequently queried
-- 4. Foreign key constraints if referencing other tables
