-- Tạo database
CREATE DATABASE WorkerManagement;
GO

-- Sử dụng database
USE WorkerManagement;
GO

-- Tạo bảng Worker
CREATE TABLE Worker (
    WorkerID VARCHAR(10) PRIMARY KEY,
    Name NVARCHAR(100) NOT NULL,
    Age INT CHECK (Age BETWEEN 18 AND 50),
    Salary DECIMAL(18, 2) CHECK (Salary > 0),
    WorkLocation NVARCHAR(100)
);

-- Tạo bảng SalaryHistory
CREATE TABLE SalaryHistory (
    HistoryID INT IDENTITY(1,1) PRIMARY KEY,
    WorkerID VARCHAR(10),
    ChangeAmount DECIMAL(18, 2),
    ChangeType NVARCHAR(10), -- 'Increase' hoặc 'Decrease'
    ChangeDate DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (WorkerID) REFERENCES Worker(WorkerID)
);

-- Thêm dữ liệu mẫu
INSERT INTO Worker VALUES ('W001', 'John Doe', 30, 5000.00, 'New York');
INSERT INTO Worker VALUES ('W002', 'Jane Smith', 25, 4500.00, 'Los Angeles');
