# CA KIỂM THỬ - MODULE XÁC THỰC (AUTHENTICATION)
## Dự án: Website Bán Hàng Online (E-commerce)

| Thông tin | Chi tiết |
|-----------|----------|
| **Module** | Authentication |
| **Phiên bản** | 1.0 |
| **Ngày tạo** | 29/01/2026 |
| **Tổng số Test Cases** | 15 |

---

## ĐĂNG KÝ TÀI KHOẢN (Registration)

### TC_AUTH_001 - Đăng ký thành công với thông tin hợp lệ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_001 |
| **Tiêu đề** | Đăng ký thành công với email và thông tin hợp lệ |
| **Điều kiện trước** | - Trang đăng ký được truy cập<br>- Email chưa được đăng ký trong hệ thống |
| **Các bước** | 1. Mở trang đăng ký (Register)<br>2. Nhập email hợp lệ: test_user01@gmail.com<br>3. Nhập mật khẩu: Password@123 (8+ ký tự)<br>4. Nhập xác nhận mật khẩu: Password@123<br>5. Nhập họ tên: Nguyễn Văn Test<br>6. Nhập số điện thoại: 0901234567<br>7. Nhấn nút "Đăng ký" |
| **Kết quả mong đợi** | - Đăng ký thành công<br>- Hiển thị thông báo "Đăng ký thành công"<br>- Chuyển hướng đến trang đăng nhập hoặc trang chủ |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R1 |

---

### TC_AUTH_002 - Đăng ký thất bại với email sai định dạng
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_002 |
| **Tiêu đề** | Đăng ký thất bại khi nhập email sai định dạng |
| **Điều kiện trước** | - Trang đăng ký được truy cập |
| **Các bước** | 1. Mở trang đăng ký<br>2. Nhập email không hợp lệ: "testuser.com" (thiếu @)<br>3. Nhập các thông tin khác hợp lệ<br>4. Nhấn nút "Đăng ký" |
| **Kết quả mong đợi** | - Đăng ký thất bại<br>- Hiển thị thông báo lỗi "Email không đúng định dạng" |
| **Độ ưu tiên** | High |
| **Loại test** | Negative |
| **Requirement** | R2 |

---

### TC_AUTH_003 - Đăng ký thất bại với email đã tồn tại
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_003 |
| **Tiêu đề** | Đăng ký thất bại khi email đã được sử dụng |
| **Điều kiện trước** | - Email "existing@gmail.com" đã tồn tại trong hệ thống |
| **Các bước** | 1. Mở trang đăng ký<br>2. Nhập email: existing@gmail.com<br>3. Nhập các thông tin khác hợp lệ<br>4. Nhấn nút "Đăng ký" |
| **Kết quả mong đợi** | - Đăng ký thất bại<br>- Hiển thị thông báo "Email đã được sử dụng" |
| **Độ ưu tiên** | High |
| **Loại test** | Negative |
| **Requirement** | R1, R2 |

---

### TC_AUTH_004 - Đăng ký thất bại với mật khẩu dưới 8 ký tự
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_004 |
| **Tiêu đề** | Đăng ký thất bại khi mật khẩu dưới 8 ký tự |
| **Điều kiện trước** | - Trang đăng ký được truy cập |
| **Các bước** | 1. Mở trang đăng ký<br>2. Nhập email hợp lệ: newuser@gmail.com<br>3. Nhập mật khẩu: "Pass123" (7 ký tự)<br>4. Nhập xác nhận mật khẩu: "Pass123"<br>5. Nhấn nút "Đăng ký" |
| **Kết quả mong đợi** | - Đăng ký thất bại<br>- Hiển thị thông báo "Mật khẩu phải có tối thiểu 8 ký tự" |
| **Độ ưu tiên** | High |
| **Loại test** | Boundary |
| **Requirement** | R3 |

---

### TC_AUTH_005 - Đăng ký thành công với mật khẩu đúng 8 ký tự (Boundary)
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_005 |
| **Tiêu đề** | Đăng ký thành công với mật khẩu đúng 8 ký tự |
| **Điều kiện trước** | - Trang đăng ký được truy cập<br>- Email chưa tồn tại |
| **Các bước** | 1. Mở trang đăng ký<br>2. Nhập email: boundary@gmail.com<br>3. Nhập mật khẩu: "Pass1234" (đúng 8 ký tự)<br>4. Nhập xác nhận mật khẩu: "Pass1234"<br>5. Nhập các thông tin khác hợp lệ<br>6. Nhấn nút "Đăng ký" |
| **Kết quả mong đợi** | - Đăng ký thành công<br>- Hiển thị thông báo "Đăng ký thành công" |
| **Độ ưu tiên** | Medium |
| **Loại test** | Boundary |
| **Requirement** | R3 |

---

### TC_AUTH_006 - Đăng ký thất bại khi không nhập thông tin bắt buộc
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_006 |
| **Tiêu đề** | Kiểm tra validation khi bỏ trống các trường bắt buộc |
| **Điều kiện trước** | - Trang đăng ký được truy cập |
| **Các bước** | 1. Mở trang đăng ký<br>2. Để trống tất cả các trường<br>3. Nhấn nút "Đăng ký" |
| **Kết quả mong đợi** | - Đăng ký thất bại<br>- Hiển thị thông báo lỗi cho từng trường bắt buộc |
| **Độ ưu tiên** | High |
| **Loại test** | Negative / Validation |
| **Requirement** | R1, R2, R3 |

---

## ĐĂNG NHẬP (Login)

### TC_AUTH_007 - Đăng nhập thành công với thông tin hợp lệ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_007 |
| **Tiêu đề** | Đăng nhập thành công với email và mật khẩu đúng |
| **Điều kiện trước** | - Tài khoản đã tồn tại: user@gmail.com / Password@123<br>- User chưa đăng nhập |
| **Các bước** | 1. Mở trang đăng nhập<br>2. Nhập email: user@gmail.com<br>3. Nhập mật khẩu: Password@123<br>4. Nhấn nút "Đăng nhập" |
| **Kết quả mong đợi** | - Đăng nhập thành công<br>- Chuyển hướng đến trang chủ<br>- Hiển thị tên user hoặc avatar trên header |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R4 |

---

### TC_AUTH_008 - Đăng nhập thất bại với mật khẩu sai
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_008 |
| **Tiêu đề** | Đăng nhập thất bại khi nhập sai mật khẩu |
| **Điều kiện trước** | - Tài khoản đã tồn tại: user@gmail.com / Password@123 |
| **Các bước** | 1. Mở trang đăng nhập<br>2. Nhập email: user@gmail.com<br>3. Nhập mật khẩu sai: WrongPassword<br>4. Nhấn nút "Đăng nhập" |
| **Kết quả mong đợi** | - Đăng nhập thất bại<br>- Hiển thị thông báo "Email hoặc mật khẩu không đúng"<br>- Không lộ thông tin nào là sai (bảo mật) |
| **Độ ưu tiên** | High |
| **Loại test** | Negative |
| **Requirement** | R5 |

---

### TC_AUTH_009 - Đăng nhập thất bại với email không tồn tại
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_009 |
| **Tiêu đề** | Đăng nhập thất bại khi email không tồn tại trong hệ thống |
| **Điều kiện trước** | - Email "notexist@gmail.com" chưa đăng ký |
| **Các bước** | 1. Mở trang đăng nhập<br>2. Nhập email: notexist@gmail.com<br>3. Nhập mật khẩu: Password@123<br>4. Nhấn nút "Đăng nhập" |
| **Kết quả mong đợi** | - Đăng nhập thất bại<br>- Hiển thị thông báo "Email hoặc mật khẩu không đúng" |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative |
| **Requirement** | R4, R5 |

---

### TC_AUTH_010 - Kiểm tra SQL Injection khi đăng nhập
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_010 |
| **Tiêu đề** | Kiểm tra bảo mật - Chống SQL Injection |
| **Điều kiện trước** | - Trang đăng nhập được truy cập |
| **Các bước** | 1. Mở trang đăng nhập<br>2. Nhập email: ' OR '1'='1<br>3. Nhập mật khẩu: ' OR '1'='1<br>4. Nhấn nút "Đăng nhập" |
| **Kết quả mong đợi** | - Đăng nhập thất bại<br>- Hệ thống không bị tấn công SQL Injection<br>- Hiển thị thông báo lỗi validation hoặc đăng nhập thất bại |
| **Độ ưu tiên** | High |
| **Loại test** | Security / Validation |
| **Requirement** | R4, R5 |

---

### TC_AUTH_011 - Kiểm tra XSS khi đăng nhập
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_011 |
| **Tiêu đề** | Kiểm tra bảo mật - Chống XSS Attack |
| **Điều kiện trước** | - Trang đăng nhập được truy cập |
| **Các bước** | 1. Mở trang đăng nhập<br>2. Nhập email: <script>alert('XSS')</script>@test.com<br>3. Nhập mật khẩu: Password@123<br>4. Nhấn nút "Đăng nhập" |
| **Kết quả mong đợi** | - Không hiển thị popup alert<br>- Script không được thực thi<br>- Hiển thị lỗi validation email hoặc đăng nhập thất bại |
| **Độ ưu tiên** | High |
| **Loại test** | Security / Validation |
| **Requirement** | R4 |

---

## QUÊN MẬT KHẨU (Forgot Password)

### TC_AUTH_012 - Yêu cầu đặt lại mật khẩu thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_012 |
| **Tiêu đề** | Gửi email đặt lại mật khẩu thành công |
| **Điều kiện trước** | - Tài khoản đã tồn tại với email: user@gmail.com |
| **Các bước** | 1. Mở trang đăng nhập<br>2. Nhấn link "Quên mật khẩu"<br>3. Nhập email: user@gmail.com<br>4. Nhấn nút "Gửi yêu cầu" |
| **Kết quả mong đợi** | - Hiển thị thông báo "Email đặt lại mật khẩu đã được gửi"<br>- Email chứa link đặt lại mật khẩu được gửi đến user |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R6 |

---

### TC_AUTH_013 - Yêu cầu đặt lại mật khẩu với email không tồn tại
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_013 |
| **Tiêu đề** | Quên mật khẩu với email không tồn tại trong hệ thống |
| **Điều kiện trước** | - Email "notexist@gmail.com" chưa đăng ký |
| **Các bước** | 1. Mở trang quên mật khẩu<br>2. Nhập email: notexist@gmail.com<br>3. Nhấn nút "Gửi yêu cầu" |
| **Kết quả mong đợi** | - Hiển thị thông báo chung (không tiết lộ email có tồn tại hay không)<br>- Ví dụ: "Nếu email tồn tại, chúng tôi sẽ gửi link đặt lại mật khẩu" |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative / Security |
| **Requirement** | R6 |

---

## ĐĂNG XUẤT (Logout)

### TC_AUTH_014 - Đăng xuất thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_014 |
| **Tiêu đề** | Đăng xuất thành công khi user đã đăng nhập |
| **Điều kiện trước** | - User đã đăng nhập thành công |
| **Các bước** | 1. Đảm bảo user đã đăng nhập<br>2. Click vào avatar/tên user trên header<br>3. Chọn "Đăng xuất" |
| **Kết quả mong đợi** | - Đăng xuất thành công<br>- Session bị hủy<br>- Chuyển hướng về trang chủ hoặc trang đăng nhập<br>- Header hiển thị nút "Đăng nhập" thay vì tên user |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R4 |

---

### TC_AUTH_015 - Kiểm tra session sau khi đăng xuất
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_AUTH_015 |
| **Tiêu đề** | Session bị hủy hoàn toàn sau khi đăng xuất |
| **Điều kiện trước** | - User đã đăng nhập và vừa đăng xuất |
| **Các bước** | 1. Đăng nhập thành công<br>2. Đăng xuất<br>3. Nhấn nút Back của trình duyệt<br>4. Thử truy cập trang cần đăng nhập (ví dụ: /account/profile) |
| **Kết quả mong đợi** | - Không thể truy cập các trang yêu cầu đăng nhập<br>- Chuyển hướng về trang đăng nhập<br>- Session không còn hiệu lực |
| **Độ ưu tiên** | High |
| **Loại test** | Security |
| **Requirement** | R4 |

---

## TỔNG KẾT MODULE AUTHENTICATION

| Loại Test | Số lượng | Test Case IDs |
|-----------|----------|---------------|
| **Positive** | 4 | TC_AUTH_001, 005, 007, 012, 014 |
| **Negative** | 6 | TC_AUTH_002, 003, 004, 006, 008, 009, 013 |
| **Boundary** | 2 | TC_AUTH_004, 005 |
| **Security/Validation** | 5 | TC_AUTH_006, 010, 011, 013, 015 |
| **Tổng** | **15** | |

---

*Tài liệu này được tạo theo chuẩn của Software-Testing-Projects (GitHub)*
