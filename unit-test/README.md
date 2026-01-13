# Bài tập thực hành kiểm thử với JUnit
## Chủ đề: Phân tích dữ liệu điểm số học sinh

---

## 📋 Mô tả bài toán

Chương trình Java `StudentAnalyzer` cung cấp các phương thức phân tích điểm số học sinh:

### 1. `countExcellentStudents(List<Double> scores)`
- **Mục đích**: Đếm số lượng học sinh đạt loại **Giỏi** (điểm >= 8.0)
- **Quy tắc**:
  - Bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
  - Trả về 0 nếu danh sách rỗng hoặc null

### 2. `calculateValidAverage(List<Double> scores)`
- **Mục đích**: Tính điểm trung bình của các điểm hợp lệ
- **Quy tắc**:
  - Chỉ tính các điểm trong khoảng [0, 10]
  - Trả về 0.0 nếu không có điểm hợp lệ nào

---

## 📁 Cấu trúc thư mục

```
unit-test/
├── src/
│   └── StudentAnalyzer.java      # Mã nguồn chính
├── test/
│   └── StudentAnalyzerTest.java  # Các ca kiểm thử JUnit
├── pom.xml                        # Cấu hình Maven
└── README.md                      # Tài liệu hướng dẫn
```

---

## 🚀 Hướng dẫn chạy chương trình

### Yêu cầu hệ thống
- **Java JDK 17** hoặc cao hơn
- **Apache Maven 3.8+**

### Kiểm tra phiên bản
```bash
java -version
mvn -version
```

### Biên dịch dự án
```bash
cd unit-test
mvn compile
```

### Chạy kiểm thử đơn vị
```bash
cd unit-test
mvn test
```

### Kết quả mong đợi
```
[INFO] Tests run: 19, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

---

## 📝 Danh sách Test Cases

### Test cho `countExcellentStudents()`

| # | Tên Test Case | Mô tả | Kết quả mong đợi |
|---|---------------|-------|------------------|
| 1 | MixedValidInvalid | Danh sách có điểm hợp lệ và không hợp lệ | 2 |
| 2 | AllValidScores | Danh sách toàn bộ điểm hợp lệ | 3 |
| 3 | EmptyList | Danh sách trống | 0 |
| 4 | NullList | Danh sách null | 0 |
| 5 | OnlyZero | Chỉ có điểm 0 | 0 |
| 6 | OnlyTen | Chỉ có điểm 10 | 3 |
| 7 | BoundaryValue8 | Giá trị biên 8.0 | 2 |
| 8 | AllInvalidScores | Toàn bộ điểm không hợp lệ | 0 |
| 9 | NoExcellentStudents | Không có học sinh giỏi | 0 |

### Test cho `calculateValidAverage()`

| # | Tên Test Case | Mô tả | Kết quả mong đợi |
|---|---------------|-------|------------------|
| 1 | MixedValidInvalid | Điểm hợp lệ và không hợp lệ | 8.17 |
| 2 | AllValidScores | Toàn bộ điểm hợp lệ | 8.0 |
| 3 | EmptyList | Danh sách trống | 0.0 |
| 4 | NullList | Danh sách null | 0.0 |
| 5 | OnlyZero | Chỉ có điểm 0 | 0.0 |
| 6 | OnlyTen | Chỉ có điểm 10 | 10.0 |
| 7 | BoundaryValues | Giá trị biên 0 và 10 | 5.0 |
| 8 | AllInvalidScores | Toàn bộ điểm không hợp lệ | 0.0 |
| 9 | SingleValidScore | Một điểm duy nhất | 7.5 |
| 10 | DecimalPrecision | Kiểm tra độ chính xác thập phân | 7.67 |

---

## 🔗 Liên kết Issues

| Issue | Mô tả | Trạng thái |
|-------|-------|------------|
| #1 | Viết hàm `countExcellentStudents()` | ✅ Hoàn thành |
| #2 | Viết hàm `calculateValidAverage()` | ✅ Hoàn thành |
| #3 | Viết test cho 2 hàm trên | ✅ Hoàn thành |
| #4 | Viết tài liệu README.md | ✅ Hoàn thành |

---

## 📊 Commit History

```bash
# Issue 1: Implement countExcellentStudents
git commit -m "feat: implement countExcellentStudents() #1"

# Issue 2: Implement calculateValidAverage  
git commit -m "feat: implement calculateValidAverage() #2"

# Issue 3: Add unit tests
git commit -m "test: add unit tests for both methods #3"

# Issue 4: Update documentation
git commit -m "docs: update README with instructions #4"
```

---

## 👨‍💻 Tác giả

Bài tập thực hành môn Kiểm thử Phần mềm

---

## 📄 License

MIT License
