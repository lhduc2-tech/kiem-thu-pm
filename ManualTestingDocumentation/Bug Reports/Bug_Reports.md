# BÁO CÁO LỖI (BUG REPORTS)
## Dự án: Website Bán Hàng Online (E-commerce)

| Thông tin | Chi tiết |
|-----------|----------|
| **Phiên bản** | 1.0 |
| **Ngày tạo** | 29/01/2026 |
| **Tổng số Bugs** | 12 |
| **Người báo cáo** | QA Team |

---

## THỐNG KÊ TỔNG QUAN

| Severity | Số lượng | Bug IDs |
|----------|----------|---------|
| 🔴 **Critical** | 3 | BUG_CART_001, BUG_CHECKOUT_001, BUG_AUTH_001 |
| 🟠 **Major** | 5 | BUG_CART_002, BUG_CART_003, BUG_CHECKOUT_002, BUG_AUTH_002, BUG_AUTH_003 |
| 🟡 **Minor** | 4 | BUG_CART_004, BUG_CHECKOUT_003, BUG_AUTH_004, BUG_CART_005 |

| Priority | Số lượng |
|----------|----------|
| High | 5 |
| Medium | 5 |
| Low | 2 |

---

## CHI TIẾT BÁO CÁO LỖI

---

### BUG_AUTH_001 - 🔴 CRITICAL

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_AUTH_001 |
| **Tóm tắt** | Có thể đăng nhập với SQL Injection trong trường email |
| **Module** | Authentication |
| **Phát hiện bởi** | Tester A |
| **Ngày phát hiện** | 12/02/2026 |
| **Test Case liên quan** | TC_AUTH_010 |

**Các bước tái hiện:**
1. Mở trang đăng nhập: http://test.ecommerce.local/login
2. Nhập email: `admin'--`
3. Nhập mật khẩu: bất kỳ
4. Nhấn nút "Đăng nhập"

**Kết quả mong đợi:**
- Đăng nhập thất bại
- Hiển thị thông báo lỗi validation

**Kết quả thực tế:**
- Đăng nhập thành công vào tài khoản admin
- Hệ thống bị bypass authentication

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🔴 Critical |
| **Priority** | High |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Dev Team Lead |

**Ghi chú:**
> Đây là lỗi bảo mật nghiêm trọng. Cần sanitize input và sử dụng parameterized queries ngay lập tức.

---

### BUG_AUTH_002 - 🟠 MAJOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_AUTH_002 |
| **Tóm tắt** | Session không bị hủy sau khi đăng xuất |
| **Module** | Authentication |
| **Phát hiện bởi** | Tester B |
| **Ngày phát hiện** | 13/02/2026 |
| **Test Case liên quan** | TC_AUTH_015 |

**Các bước tái hiện:**
1. Đăng nhập vào tài khoản: user@gmail.com
2. Copy URL trang profile: http://test.ecommerce.local/account/profile
3. Nhấn "Đăng xuất"
4. Paste URL profile vào thanh địa chỉ và Enter

**Kết quả mong đợi:**
- Redirect về trang đăng nhập
- Không thể truy cập trang profile

**Kết quả thực tế:**
- Vẫn có thể truy cập trang profile
- Session cũ vẫn còn hiệu lực

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟠 Major |
| **Priority** | High |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

---

### BUG_AUTH_003 - 🟠 MAJOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_AUTH_003 |
| **Tóm tắt** | Không giới hạn số lần đăng nhập sai - Brute Force Attack |
| **Module** | Authentication |
| **Phát hiện bởi** | Tester A |
| **Ngày phát hiện** | 13/02/2026 |
| **Test Case liên quan** | TC_AUTH_008 |

**Các bước tái hiện:**
1. Mở trang đăng nhập
2. Nhập email hợp lệ: user@gmail.com
3. Nhập mật khẩu sai liên tục 20 lần
4. Quan sát phản hồi của hệ thống

**Kết quả mong đợi:**
- Sau 5 lần đăng nhập sai, tài khoản bị khóa tạm thời
- Hoặc hiển thị CAPTCHA

**Kết quả thực tế:**
- Có thể nhập sai mật khẩu không giới hạn số lần
- Không có cơ chế bảo vệ brute force

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟠 Major |
| **Priority** | Medium |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

---

### BUG_AUTH_004 - 🟡 MINOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_AUTH_004 |
| **Tóm tắt** | Thông báo lỗi không rõ ràng khi đăng nhập thất bại |
| **Module** | Authentication |
| **Phát hiện bởi** | Tester C |
| **Ngày phát hiện** | 14/02/2026 |
| **Test Case liên quan** | TC_AUTH_008, TC_AUTH_009 |

**Các bước tái hiện:**
1. Mở trang đăng nhập
2. Nhập email: user@gmail.com
3. Nhập mật khẩu sai
4. Nhấn "Đăng nhập"

**Kết quả mong đợi:**
- Thông báo chung: "Email hoặc mật khẩu không đúng"

**Kết quả thực tế:**
- Thông báo: "Mật khẩu không đúng"
- Tiết lộ email có tồn tại trong hệ thống (information disclosure)

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟡 Minor |
| **Priority** | Low |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Frontend Developer |

---

### BUG_CART_001 - 🔴 CRITICAL

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CART_001 |
| **Tóm tắt** | Tổng tiền giỏ hàng tính sai khi có nhiều sản phẩm |
| **Module** | Product & Cart |
| **Phát hiện bởi** | Tester B |
| **Ngày phát hiện** | 14/02/2026 |
| **Test Case liên quan** | TC_CART_016 |

**Các bước tái hiện:**
1. Thêm sản phẩm A: 100.000đ x 2 = 200.000đ
2. Thêm sản phẩm B: 150.000đ x 3 = 450.000đ
3. Mở trang giỏ hàng
4. Kiểm tra tổng tiền

**Kết quả mong đợi:**
- Tổng tiền = 200.000 + 450.000 = 650.000đ

**Kết quả thực tế:**
- Tổng tiền hiển thị = 600.000đ
- Thiếu 50.000đ

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🔴 Critical |
| **Priority** | High |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

**Screenshot:**
> [Đính kèm ảnh chụp màn hình giỏ hàng với tổng tiền sai]

---

### BUG_CART_002 - 🟠 MAJOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CART_002 |
| **Tóm tắt** | Có thể thêm sản phẩm hết hàng vào giỏ |
| **Module** | Product & Cart |
| **Phát hiện bởi** | Tester A |
| **Ngày phát hiện** | 15/02/2026 |
| **Test Case liên quan** | TC_CART_012 |

**Các bước tái hiện:**
1. Tìm sản phẩm có trạng thái "Hết hàng" (stock = 0)
2. Mở Developer Tools (F12)
3. Enable nút "Thêm vào giỏ hàng" bằng cách xóa attribute disabled
4. Nhấn nút "Thêm vào giỏ hàng"

**Kết quả mong đợi:**
- Server từ chối request
- Trả về lỗi "Sản phẩm đã hết hàng"

**Kết quả thực tế:**
- Sản phẩm được thêm vào giỏ hàng thành công
- Không có validation phía server

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟠 Major |
| **Priority** | High |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

---

### BUG_CART_003 - 🟠 MAJOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CART_003 |
| **Tóm tắt** | Lọc sản phẩm theo giá không hoạt động đúng |
| **Module** | Product & Cart |
| **Phát hiện bởi** | Tester C |
| **Ngày phát hiện** | 15/02/2026 |
| **Test Case liên quan** | TC_CART_005 |

**Các bước tái hiện:**
1. Mở trang danh sách sản phẩm
2. Chọn bộ lọc giá: 100.000đ - 500.000đ
3. Nhấn "Áp dụng"
4. Kiểm tra các sản phẩm hiển thị

**Kết quả mong đợi:**
- Chỉ hiển thị sản phẩm có giá từ 100.000đ đến 500.000đ

**Kết quả thực tế:**
- Hiển thị cả sản phẩm có giá 50.000đ và 600.000đ
- Bộ lọc không hoạt động đúng

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟠 Major |
| **Priority** | Medium |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

---

### BUG_CART_004 - 🟡 MINOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CART_004 |
| **Tóm tắt** | Hình ảnh sản phẩm không load được trên trang chi tiết |
| **Module** | Product & Cart |
| **Phát hiện bởi** | Tester B |
| **Ngày phát hiện** | 16/02/2026 |
| **Test Case liên quan** | TC_CART_010 |

**Các bước tái hiện:**
1. Mở trang chi tiết sản phẩm ID: 12345
2. Quan sát khu vực hình ảnh sản phẩm

**Kết quả mong đợi:**
- Hình ảnh sản phẩm hiển thị đầy đủ

**Kết quả thực tế:**
- Hiển thị icon ảnh lỗi (broken image)
- Console log: 404 Not Found cho URL hình ảnh

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟡 Minor |
| **Priority** | Medium |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Frontend Developer |

---

### BUG_CART_005 - 🟡 MINOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CART_005 |
| **Tóm tắt** | Icon giỏ hàng không cập nhật số lượng ngay lập tức |
| **Module** | Product & Cart |
| **Phát hiện bởi** | Tester C |
| **Ngày phát hiện** | 16/02/2026 |
| **Test Case liên quan** | TC_CART_011 |

**Các bước tái hiện:**
1. Mở trang chi tiết sản phẩm
2. Nhấn "Thêm vào giỏ hàng"
3. Quan sát icon giỏ hàng trên header

**Kết quả mong đợi:**
- Icon giỏ hàng cập nhật số lượng ngay lập tức

**Kết quả thực tế:**
- Phải refresh trang mới thấy số lượng cập nhật
- Không có real-time update

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟡 Minor |
| **Priority** | Low |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Frontend Developer |

---

### BUG_CHECKOUT_001 - 🔴 CRITICAL

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CHECKOUT_001 |
| **Tóm tắt** | Đơn hàng được tạo nhưng không trừ số lượng tồn kho |
| **Module** | Checkout |
| **Phát hiện bởi** | Tester A |
| **Ngày phát hiện** | 17/02/2026 |
| **Test Case liên quan** | TC_CHECKOUT_007 |

**Các bước tái hiện:**
1. Kiểm tra tồn kho sản phẩm X: 10
2. Đặt hàng sản phẩm X với số lượng: 5
3. Đặt hàng thành công
4. Kiểm tra lại tồn kho sản phẩm X

**Kết quả mong đợi:**
- Tồn kho sản phẩm X = 10 - 5 = 5

**Kết quả thực tế:**
- Tồn kho vẫn = 10
- Không trừ số lượng đã bán

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🔴 Critical |
| **Priority** | High |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

**Impact:**
> Bug này có thể dẫn đến overselling - bán vượt số lượng tồn kho thực tế.

---

### BUG_CHECKOUT_002 - 🟠 MAJOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CHECKOUT_002 |
| **Tóm tắt** | Phí vận chuyển không được tính khi thay đổi địa chỉ |
| **Module** | Checkout |
| **Phát hiện bởi** | Tester B |
| **Ngày phát hiện** | 18/02/2026 |
| **Test Case liên quan** | TC_CHECKOUT_001 |

**Các bước tái hiện:**
1. Tiến hành checkout
2. Nhập địa chỉ: TP. Hồ Chí Minh → Phí ship = 30.000đ
3. Thay đổi địa chỉ thành: Hà Nội
4. Kiểm tra phí vận chuyển

**Kết quả mong đợi:**
- Phí ship được tính lại theo địa chỉ mới (Hà Nội có thể = 50.000đ)

**Kết quả thực tế:**
- Phí ship vẫn = 30.000đ (không đổi)
- Tổng tiền tính sai

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟠 Major |
| **Priority** | Medium |
| **Môi trường** | Chrome 120, Windows 11 |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

---

### BUG_CHECKOUT_003 - 🟡 MINOR

| Trường | Nội dung |
|--------|----------|
| **Bug ID** | BUG_CHECKOUT_003 |
| **Tóm tắt** | Email xác nhận đơn hàng bị sai định dạng tiếng Việt |
| **Module** | Checkout |
| **Phát hiện bởi** | Tester C |
| **Ngày phát hiện** | 18/02/2026 |
| **Test Case liên quan** | TC_CHECKOUT_007 |

**Các bước tái hiện:**
1. Đặt hàng thành công
2. Kiểm tra email xác nhận đơn hàng

**Kết quả mong đợi:**
- Email hiển thị tiếng Việt có dấu đúng chuẩn

**Kết quả thực tế:**
- Email hiển thị ký tự lỗi: "ÄÆ¡n hÃ ng" thay vì "Đơn hàng"
- Encoding không đúng UTF-8

| Thuộc tính | Giá trị |
|------------|---------|
| **Severity** | 🟡 Minor |
| **Priority** | Medium |
| **Môi trường** | Chrome 120, Windows 11, Gmail |
| **Trạng thái** | Open |
| **Assigned to** | Backend Developer |

---

## TỔNG HỢP THEO MODULE

| Module | Critical | Major | Minor | Tổng |
|--------|----------|-------|-------|------|
| Authentication | 1 | 2 | 1 | 4 |
| Product & Cart | 1 | 2 | 2 | 5 |
| Checkout | 1 | 1 | 1 | 3 |
| **Tổng** | **3** | **5** | **4** | **12** |

---

## BIỂU ĐỒ PHÂN BỐ

### Theo Severity
```
Critical  ███████████████ 25% (3)
Major     █████████████████████████ 42% (5)
Minor     ████████████████████ 33% (4)
```

### Theo Priority
```
High      █████████████████████████ 42% (5)
Medium    █████████████████████████ 42% (5)
Low       ████████ 16% (2)
```

### Theo Module
```
Authentication  ████████████████████ 33% (4)
Product & Cart  ████████████████████████ 42% (5)
Checkout        ███████████████ 25% (3)
```

---

*Tài liệu này được tạo theo chuẩn của Software-Testing-Projects (GitHub)*
