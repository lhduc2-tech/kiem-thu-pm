# MA TRẬN TRUY VẾT YÊU CẦU (REQUIREMENT TRACEABILITY MATRIX - RTM)
## Dự án: Website Bán Hàng Online (E-commerce)

| Thông tin | Chi tiết |
|-----------|----------|
| **Phiên bản** | 1.0 |
| **Ngày tạo** | 29/01/2026 |
| **Tổng số Requirements** | 16 |
| **Tổng số Test Cases** | 45 |
| **Độ bao phủ (Coverage)** | 100% |

---

## BẢNG MA TRẬN TRUY VẾT

| Req ID | Mô tả yêu cầu | Test Case IDs | Số TC | Trạng thái |
|--------|---------------|---------------|-------|------------|
| **R1** | Người dùng đăng ký bằng email hợp lệ | TC_AUTH_001, TC_AUTH_003, TC_AUTH_006 | 3 | ✅ Covered |
| **R2** | Không cho đăng ký khi email sai định dạng | TC_AUTH_002, TC_AUTH_003, TC_AUTH_006 | 3 | ✅ Covered |
| **R3** | Mật khẩu tối thiểu 8 ký tự | TC_AUTH_004, TC_AUTH_005, TC_AUTH_006 | 3 | ✅ Covered |
| **R4** | Đăng nhập thành công với thông tin hợp lệ | TC_AUTH_007, TC_AUTH_009, TC_AUTH_010, TC_AUTH_011, TC_AUTH_014, TC_AUTH_015 | 6 | ✅ Covered |
| **R5** | Đăng nhập thất bại khi sai mật khẩu | TC_AUTH_008, TC_AUTH_009, TC_AUTH_010 | 3 | ✅ Covered |
| **R6** | Quên mật khẩu gửi email đặt lại | TC_AUTH_012, TC_AUTH_013 | 2 | ✅ Covered |
| **R7** | Tìm kiếm hiển thị đúng kết quả | TC_CART_001, TC_CART_002, TC_CART_003, TC_CART_004 | 4 | ✅ Covered |
| **R8** | Lọc theo giá hoạt động đúng | TC_CART_005, TC_CART_006, TC_CART_007, TC_CART_008 | 4 | ✅ Covered |
| **R9** | Xem chi tiết sản phẩm | TC_CART_009, TC_CART_010 | 2 | ✅ Covered |
| **R10** | Thêm sản phẩm vào giỏ thành công | TC_CART_011, TC_CART_012, TC_CART_013, TC_CART_014, TC_CART_015 | 5 | ✅ Covered |
| **R11** | Cập nhật số lượng trong giỏ | TC_CART_016, TC_CART_017, TC_CART_018 | 3 | ✅ Covered |
| **R12** | Xoá sản phẩm khỏi giỏ | TC_CART_019, TC_CART_020 | 2 | ✅ Covered |
| **R13** | Thanh toán bắt buộc nhập địa chỉ | TC_CHECKOUT_001, TC_CHECKOUT_002, TC_CHECKOUT_003 | 3 | ✅ Covered |
| **R14** | Chọn phương thức thanh toán | TC_CHECKOUT_004, TC_CHECKOUT_005, TC_CHECKOUT_006 | 3 | ✅ Covered |
| **R15** | Đặt hàng thành công | TC_CHECKOUT_007, TC_CHECKOUT_008 | 2 | ✅ Covered |
| **R16** | Lưu lịch sử đơn hàng | TC_CHECKOUT_009, TC_CHECKOUT_010 | 2 | ✅ Covered |

---

## CHI TIẾT THEO MODULE

### Module 1: Authentication (Xác thực)

| Req ID | Yêu cầu | Test Cases | Coverage |
|--------|---------|------------|----------|
| R1 | Đăng ký email hợp lệ | TC_AUTH_001, TC_AUTH_003, TC_AUTH_006 | 100% |
| R2 | Email sai định dạng | TC_AUTH_002, TC_AUTH_003, TC_AUTH_006 | 100% |
| R3 | Mật khẩu >= 8 ký tự | TC_AUTH_004, TC_AUTH_005, TC_AUTH_006 | 100% |
| R4 | Đăng nhập thành công | TC_AUTH_007, TC_AUTH_009, TC_AUTH_010, TC_AUTH_011, TC_AUTH_014, TC_AUTH_015 | 100% |
| R5 | Đăng nhập thất bại | TC_AUTH_008, TC_AUTH_009, TC_AUTH_010 | 100% |
| R6 | Quên mật khẩu | TC_AUTH_012, TC_AUTH_013 | 100% |

**Tổng test cases Module Auth:** 15

---

### Module 2: Product & Cart (Sản phẩm & Giỏ hàng)

| Req ID | Yêu cầu | Test Cases | Coverage |
|--------|---------|------------|----------|
| R7 | Tìm kiếm sản phẩm | TC_CART_001, TC_CART_002, TC_CART_003, TC_CART_004 | 100% |
| R8 | Lọc theo giá/danh mục | TC_CART_005, TC_CART_006, TC_CART_007, TC_CART_008 | 100% |
| R9 | Xem chi tiết sản phẩm | TC_CART_009, TC_CART_010 | 100% |
| R10 | Thêm vào giỏ hàng | TC_CART_011, TC_CART_012, TC_CART_013, TC_CART_014, TC_CART_015 | 100% |
| R11 | Cập nhật số lượng | TC_CART_016, TC_CART_017, TC_CART_018 | 100% |
| R12 | Xóa khỏi giỏ hàng | TC_CART_019, TC_CART_020 | 100% |

**Tổng test cases Module Product & Cart:** 20

---

### Module 3: Checkout (Thanh toán)

| Req ID | Yêu cầu | Test Cases | Coverage |
|--------|---------|------------|----------|
| R13 | Nhập địa chỉ giao hàng | TC_CHECKOUT_001, TC_CHECKOUT_002, TC_CHECKOUT_003 | 100% |
| R14 | Chọn phương thức thanh toán | TC_CHECKOUT_004, TC_CHECKOUT_005, TC_CHECKOUT_006 | 100% |
| R15 | Đặt hàng thành công | TC_CHECKOUT_007, TC_CHECKOUT_008 | 100% |
| R16 | Lịch sử đơn hàng | TC_CHECKOUT_009, TC_CHECKOUT_010 | 100% |

**Tổng test cases Module Checkout:** 10

---

## THỐNG KÊ COVERAGE

### Tổng quan Coverage

```
┌────────────────────────────────────────────────────────────────┐
│                    REQUIREMENT COVERAGE                        │
├────────────────────────────────────────────────────────────────┤
│  Total Requirements:     16                                    │
│  Covered Requirements:   16                                    │
│  Not Covered:            0                                     │
│  Coverage Rate:          100% ✅                               │
└────────────────────────────────────────────────────────────────┘
```

### Coverage theo Module

| Module | Requirements | Covered | Coverage % |
|--------|--------------|---------|------------|
| Authentication | 6 (R1-R6) | 6 | 100% |
| Product & Cart | 6 (R7-R12) | 6 | 100% |
| Checkout | 4 (R13-R16) | 4 | 100% |
| **Tổng** | **16** | **16** | **100%** |

### Số Test Cases per Requirement

| Số TC/Requirement | Số lượng Req | Requirements |
|-------------------|--------------|--------------|
| ≥ 5 Test Cases | 2 | R4, R10 |
| 3-4 Test Cases | 7 | R1, R2, R3, R5, R7, R8, R13, R14 |
| 2 Test Cases | 7 | R6, R9, R12, R15, R16 |
| < 2 Test Cases | 0 | - |

✅ **Tất cả Requirements đều có tối thiểu 2 Test Cases**

---

## MA TRẬN CHÉO TEST CASE - REQUIREMENT

```
              R1  R2  R3  R4  R5  R6  R7  R8  R9  R10 R11 R12 R13 R14 R15 R16
TC_AUTH_001   ✓   
TC_AUTH_002       ✓
TC_AUTH_003   ✓   ✓
TC_AUTH_004           ✓
TC_AUTH_005           ✓
TC_AUTH_006   ✓   ✓   ✓
TC_AUTH_007               ✓
TC_AUTH_008                   ✓
TC_AUTH_009               ✓   ✓
TC_AUTH_010               ✓   ✓
TC_AUTH_011               ✓
TC_AUTH_012                       ✓
TC_AUTH_013                       ✓
TC_AUTH_014               ✓
TC_AUTH_015               ✓
TC_CART_001                           ✓
TC_CART_002                           ✓
TC_CART_003                           ✓
TC_CART_004                           ✓
TC_CART_005                               ✓
TC_CART_006                               ✓
TC_CART_007                               ✓
TC_CART_008                               ✓
TC_CART_009                                   ✓
TC_CART_010                                   ✓
TC_CART_011                                       ✓
TC_CART_012                                       ✓
TC_CART_013                                       ✓
TC_CART_014                                       ✓
TC_CART_015                                       ✓
TC_CART_016                                           ✓
TC_CART_017                                           ✓
TC_CART_018                                           ✓
TC_CART_019                                               ✓
TC_CART_020                                               ✓
TC_CHECKOUT_001                                               ✓
TC_CHECKOUT_002                                               ✓
TC_CHECKOUT_003                                               ✓
TC_CHECKOUT_004                                                   ✓
TC_CHECKOUT_005                                                   ✓
TC_CHECKOUT_006                                                   ✓
TC_CHECKOUT_007                                                       ✓
TC_CHECKOUT_008                                                       ✓
TC_CHECKOUT_009                                                           ✓
TC_CHECKOUT_010                                                           ✓
```

---

## KẾT LUẬN

| Tiêu chí | Yêu cầu | Thực tế | Trạng thái |
|----------|---------|---------|------------|
| Độ bao phủ | ≥ 90% | 100% | ✅ Đạt |
| TC/Requirement | ≥ 2 | Min: 2, Max: 6 | ✅ Đạt |
| Tổng Test Cases | ≥ 45 | 45 | ✅ Đạt |

---

*Tài liệu này được tạo theo chuẩn của Software-Testing-Projects (GitHub)*
