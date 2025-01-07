-- Script for SCHEMA CREATION at Run/init for "student", "course", "passport", "review"

CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS course (
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS passport (
    id INT PRIMARY KEY,
    number VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS review (
    id INT PRIMARY KEY,
    rating VARCHAR(10),
    description VARCHAR(255)
);
