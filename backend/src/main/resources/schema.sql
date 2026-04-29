CREATE TABLE IF NOT EXISTS elevator (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(64) NOT NULL,
    model VARCHAR(64) NOT NULL,
    location VARCHAR(255),
    status VARCHAR(32)
);

CREATE TABLE IF NOT EXISTS maintenance_plan (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    elevator_id BIGINT NOT NULL,
    plan_date DATE,
    plan_type VARCHAR(32),
    status VARCHAR(32)
);

CREATE TABLE IF NOT EXISTS repair_order (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    elevator_id BIGINT NOT NULL,
    fault_level VARCHAR(32),
    description VARCHAR(512),
    status VARCHAR(32)
);
