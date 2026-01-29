# KẾ HOẠCH KIỂM THỬ (TEST PLAN)
## Dự án: Website Bán Hàng Online (E-commerce)

| Thông tin dự án | Chi tiết |
|-----------------|----------|
| **Tên dự án** | E-commerce Website Testing |
| **Phiên bản** | 1.0 |
| **Ngày tạo** | 29/01/2026 |
| **Người tạo** | QA Team |
| **Trạng thái** | Draft |

---

## 1. GIỚI THIỆU (Introduction)

### 1.1 Mục đích tài liệu
Tài liệu này mô tả kế hoạch kiểm thử cho hệ thống Website bán hàng online (E-commerce). Mục đích của kế hoạch kiểm thử là:
- Định nghĩa phạm vi và phương pháp kiểm thử
- Xác định các nguồn lực cần thiết
- Thiết lập tiêu chí vào/ra cho quá trình kiểm thử
- Quản lý rủi ro trong quá trình kiểm thử

### 1.2 Tổng quan hệ thống
Hệ thống E-commerce là một website bán hàng online cho phép người dùng:
- Đăng ký, đăng nhập và quản lý tài khoản
- Tìm kiếm, xem và lọc sản phẩm
- Quản lý giỏ hàng
- Thực hiện thanh toán và theo dõi đơn hàng

### 1.3 Tài liệu tham chiếu
| Tài liệu | Mô tả |
|----------|-------|
| SRS Document | Tài liệu đặc tả yêu cầu phần mềm |
| UI/UX Design | Bản thiết kế giao diện người dùng |
| Requirements List (R1-R16) | Danh sách 16 yêu cầu chức năng |

---

## 2. PHẠM VI KIỂM THỬ (Scope)

### 2.1 Trong phạm vi (In-Scope)

| Module | Chức năng |
|--------|-----------|
| **Authentication** | Đăng ký tài khoản, Đăng nhập, Quên mật khẩu, Đăng xuất |
| **Product & Cart** | Tìm kiếm sản phẩm, Lọc theo giá/danh mục, Xem chi tiết sản phẩm, Thêm/Cập nhật/Xóa sản phẩm trong giỏ |
| **Checkout** | Nhập địa chỉ giao hàng, Chọn phương thức thanh toán, Đặt hàng, Xem lịch sử đơn hàng |

**Loại kiểm thử thực hiện:**
- ✅ Kiểm thử chức năng (Functional Testing)
- ✅ Kiểm thử giao diện cơ bản (UI Testing - Basic)
- ✅ Kiểm thử hồi quy (Regression Testing - Smoke)
- ✅ Kiểm thử tích hợp (Integration Testing)

### 2.2 Ngoài phạm vi (Out-of-Scope)

| Loại kiểm thử | Lý do loại trừ |
|---------------|----------------|
| Performance Testing | Không có yêu cầu cụ thể về hiệu năng |
| Automation Testing | Chỉ thực hiện kiểm thử thủ công |
| Security Testing (nâng cao) | Không thuộc phạm vi dự án |
| Mobile Testing | Chỉ kiểm thử trên trình duyệt desktop |
| API Testing | Chỉ kiểm thử qua giao diện người dùng |

---

## 3. PHƯƠNG PHÁP KIỂM THỬ (Test Approach)

### 3.1 Kiểm thử chức năng (Functional Testing)
- Kiểm tra tất cả các chức năng theo yêu cầu R1-R16
- Sử dụng kỹ thuật:
  - **Positive Testing**: Kiểm tra với dữ liệu hợp lệ
  - **Negative Testing**: Kiểm tra với dữ liệu không hợp lệ
  - **Boundary Testing**: Kiểm tra các giá trị biên

### 3.2 Kiểm thử giao diện (UI Testing)
- Kiểm tra tính nhất quán của giao diện
- Kiểm tra responsive trên các kích thước màn hình khác nhau
- Kiểm tra hiển thị thông báo lỗi/thành công

### 3.3 Kiểm thử hồi quy (Regression Testing)
- Thực hiện smoke test sau mỗi bản build mới
- Đảm bảo các chức năng cũ không bị ảnh hưởng

### 3.4 Phân cấp ưu tiên kiểm thử
| Ưu tiên | Module | Lý do |
|---------|--------|-------|
| High | Authentication | Cổng vào hệ thống |
| High | Checkout | Ảnh hưởng trực tiếp đến doanh thu |
| Medium | Product & Cart | Chức năng cốt lõi |

---

## 4. MÔI TRƯỜNG KIỂM THỬ (Test Environment)

### 4.1 Phần cứng
| Thành phần | Cấu hình |
|------------|----------|
| CPU | Intel Core i5 trở lên |
| RAM | 8GB trở lên |
| Màn hình | Độ phân giải 1920x1080 |

### 4.2 Phần mềm
| Thành phần | Phiên bản |
|------------|-----------|
| Hệ điều hành | Windows 10/11 |
| Trình duyệt chính | Google Chrome (phiên bản mới nhất) |
| Trình duyệt phụ | Firefox, Edge |

### 4.3 Dữ liệu kiểm thử
| Loại dữ liệu | Mô tả |
|--------------|-------|
| Tài khoản test | user_test01@email.com / Password@123 |
| Tài khoản admin | admin@email.com / Admin@123 |
| Sản phẩm mẫu | 50 sản phẩm ở các danh mục khác nhau |
| Thẻ Visa giả lập | 4111 1111 1111 1111 |

### 4.4 URL môi trường
| Môi trường | URL |
|------------|-----|
| Development | http://dev.ecommerce.local |
| Testing | http://test.ecommerce.local |
| Staging | http://staging.ecommerce.local |

---

## 5. ĐIỀU KIỆN VÀO / RA (Entry / Exit Criteria)

### 5.1 Điều kiện vào (Entry Criteria)
- ✅ Yêu cầu phần mềm (SRS) đã được phê duyệt
- ✅ Môi trường kiểm thử đã được thiết lập
- ✅ Test cases đã được review và phê duyệt
- ✅ Dữ liệu kiểm thử đã sẵn sàng
- ✅ Build đã được deploy lên môi trường test
- ✅ Smoke test của Dev team đã pass

### 5.2 Điều kiện ra (Exit Criteria)
- ✅ 100% test cases đã được thực thi
- ✅ Tất cả bug Critical và Major đã được fix và verify
- ✅ Tỷ lệ Pass ≥ 95%
- ✅ Không còn bug Critical nào mở
- ✅ Bug Major còn mở ≤ 2
- ✅ Test Report đã được phê duyệt

### 5.3 Điều kiện tạm dừng (Suspension Criteria)
- ❌ Môi trường test không khả dụng > 4 giờ
- ❌ Phát hiện > 5 bug Critical trong 1 ngày
- ❌ Build không ổn định, crash liên tục

---

## 6. RỦI RO VÀ BIỆN PHÁP GIẢM THIỂU (Risks & Mitigation)

| # | Rủi ro | Mức độ | Xác suất | Biện pháp giảm thiểu |
|---|--------|--------|----------|---------------------|
| 1 | Môi trường test không ổn định | High | Medium | Phối hợp DevOps theo dõi, có backup environment |
| 2 | Thiếu tài nguyên kiểm thử | Medium | Low | Cross-training team members, có kế hoạch backup |
| 3 | Yêu cầu thay đổi giữa chừng | Medium | Medium | Change request process, impact analysis |
| 4 | Dữ liệu test không đầy đủ | Medium | Low | Chuẩn bị data script, review trước khi test |
| 5 | Deadline gấp | High | Medium | Ưu tiên test cases theo risk-based, parallel testing |
| 6 | Bug fix gây ảnh hưởng chức năng khác | Medium | Medium | Regression test sau mỗi bug fix |

---

## 7. VAI TRÒ VÀ TRÁCH NHIỆM (Roles & Responsibilities)

| Vai trò | Người đảm nhận | Trách nhiệm |
|---------|----------------|-------------|
| **QA Lead** | Nguyễn Văn A | - Lập kế hoạch kiểm thử<br>- Phân công công việc<br>- Review test cases<br>- Báo cáo tiến độ |
| **Senior Tester** | Trần Thị B | - Viết test cases cho module Authentication<br>- Execute test<br>- Report bugs |
| **Tester 1** | Lê Văn C | - Viết test cases cho module Product & Cart<br>- Execute test<br>- Verify bug fixes |
| **Tester 2** | Phạm Thị D | - Viết test cases cho module Checkout<br>- Execute test<br>- Hỗ trợ regression test |
| **Developer** | Dev Team | - Fix bugs<br>- Hỗ trợ reproduce issues |
| **Product Owner** | Hoàng Văn E | - Clarify requirements<br>- Accept/Reject test results |

---

## 8. LỊCH TRÌNH KIỂM THỬ (Test Schedule)

### 8.1 Timeline tổng quan

```
Tuần 1 (03/02 - 07/02): Test Preparation
Tuần 2 (10/02 - 14/02): Test Execution - Cycle 1
Tuần 3 (17/02 - 21/02): Bug Fix & Regression
Tuần 4 (24/02 - 28/02): Test Execution - Cycle 2 & Sign-off
```

### 8.2 Chi tiết lịch trình

| Giai đoạn | Ngày bắt đầu | Ngày kết thúc | Hoạt động |
|-----------|--------------|---------------|-----------|
| **Test Preparation** | 03/02/2026 | 07/02/2026 | - Review requirements<br>- Setup environment<br>- Prepare test data<br>- Write test cases |
| **Test Case Review** | 07/02/2026 | 09/02/2026 | - Review và approve test cases<br>- Cập nhật RTM |
| **Cycle 1 Execution** | 10/02/2026 | 14/02/2026 | - Execute all test cases<br>- Log bugs |
| **Bug Fix Period** | 17/02/2026 | 19/02/2026 | - Dev fix bugs<br>- QA verify fixes |
| **Regression Testing** | 20/02/2026 | 21/02/2026 | - Regression test<br>- Smoke test |
| **Cycle 2 Execution** | 24/02/2026 | 26/02/2026 | - Re-test failed cases<br>- Final verification |
| **Test Closure** | 27/02/2026 | 28/02/2026 | - Test report<br>- Metrics analysis<br>- Sign-off |

### 8.3 Milestones

| Milestone | Ngày | Deliverable |
|-----------|------|-------------|
| M1 | 07/02/2026 | Test cases approved |
| M2 | 14/02/2026 | Cycle 1 completed |
| M3 | 21/02/2026 | Regression completed |
| M4 | 28/02/2026 | Test sign-off |

---

## 9. DELIVERABLES (Sản phẩm bàn giao)

| # | Deliverable | Mô tả | Deadline |
|---|-------------|-------|----------|
| 1 | Test Plan | Tài liệu kế hoạch kiểm thử | 03/02/2026 |
| 2 | Test Cases | 45+ test cases | 07/02/2026 |
| 3 | RTM | Ma trận truy vết yêu cầu | 07/02/2026 |
| 4 | Bug Reports | Báo cáo lỗi phát hiện được | Ongoing |
| 5 | Test Report | Báo cáo kết quả kiểm thử | 28/02/2026 |
| 6 | Test Metrics | Các chỉ số kiểm thử | 28/02/2026 |

---

## 10. PHÊ DUYỆT (Approval)

| Vai trò | Họ tên | Chữ ký | Ngày |
|---------|--------|--------|------|
| QA Lead | Nguyễn Văn A | _____________ | __/__/2026 |
| Project Manager | Trần Văn B | _____________ | __/__/2026 |
| Product Owner | Hoàng Văn E | _____________ | __/__/2026 |

---

## 11. LỊCH SỬ THAY ĐỔI (Revision History)

| Phiên bản | Ngày | Người thay đổi | Mô tả thay đổi |
|-----------|------|----------------|----------------|
| 1.0 | 29/01/2026 | QA Team | Tạo mới tài liệu |

---

*Tài liệu này được tạo theo chuẩn của Software-Testing-Projects (GitHub)*
