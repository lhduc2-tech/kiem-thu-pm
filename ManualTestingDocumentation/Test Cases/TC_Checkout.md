# CA KIỂM THỬ - MODULE THANH TOÁN (CHECKOUT)
## Dự án: Website Bán Hàng Online (E-commerce)

| Thông tin | Chi tiết |
|-----------|----------|
| **Module** | Checkout |
| **Phiên bản** | 1.0 |
| **Ngày tạo** | 29/01/2026 |
| **Tổng số Test Cases** | 10 |

---

## NHẬP ĐỊA CHỈ GIAO HÀNG (Shipping Address)

### TC_CHECKOUT_001 - Nhập địa chỉ giao hàng thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_001 |
| **Tiêu đề** | Nhập đầy đủ thông tin địa chỉ giao hàng |
| **Điều kiện trước** | - User đã đăng nhập<br>- Giỏ hàng có ít nhất 1 sản phẩm<br>- Đang ở trang Checkout |
| **Các bước** | 1. Nhấn "Tiến hành thanh toán" từ giỏ hàng<br>2. Nhập Họ tên: Nguyễn Văn A<br>3. Nhập Số điện thoại: 0901234567<br>4. Nhập Địa chỉ: 123 Đường ABC, Phường 1<br>5. Chọn Quận/Huyện: Quận 1<br>6. Chọn Tỉnh/Thành phố: TP. Hồ Chí Minh<br>7. Nhấn "Tiếp tục" |
| **Kết quả mong đợi** | - Thông tin địa chỉ được lưu<br>- Chuyển đến bước chọn phương thức thanh toán<br>- Phí vận chuyển được tính dựa trên địa chỉ |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R13 |

---

### TC_CHECKOUT_002 - Checkout không nhập địa chỉ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_002 |
| **Tiêu đề** | Thanh toán khi không nhập địa chỉ giao hàng |
| **Điều kiện trước** | - User đã đăng nhập<br>- Giỏ hàng có sản phẩm<br>- Đang ở trang Checkout |
| **Các bước** | 1. Mở trang Checkout<br>2. Để trống tất cả các trường địa chỉ<br>3. Nhấn "Tiếp tục" hoặc "Đặt hàng" |
| **Kết quả mong đợi** | - Không cho phép tiếp tục<br>- Hiển thị thông báo lỗi cho các trường bắt buộc:<br>  + "Vui lòng nhập họ tên"<br>  + "Vui lòng nhập số điện thoại"<br>  + "Vui lòng nhập địa chỉ" |
| **Độ ưu tiên** | High |
| **Loại test** | Negative / Validation |
| **Requirement** | R13 |

---

### TC_CHECKOUT_003 - Nhập số điện thoại sai định dạng
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_003 |
| **Tiêu đề** | Nhập số điện thoại không hợp lệ |
| **Điều kiện trước** | - Đang ở trang nhập địa chỉ giao hàng |
| **Các bước** | 1. Mở trang Checkout<br>2. Nhập Số điện thoại: "abcdefghij" (chữ cái)<br>3. Nhập các thông tin khác hợp lệ<br>4. Nhấn "Tiếp tục" |
| **Kết quả mong đợi** | - Hiển thị lỗi "Số điện thoại không hợp lệ"<br>- Không cho phép tiếp tục |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative / Validation |
| **Requirement** | R13 |

---

## CHỌN PHƯƠNG THỨC THANH TOÁN (Payment Method)

### TC_CHECKOUT_004 - Chọn thanh toán COD (Tiền mặt)
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_004 |
| **Tiêu đề** | Chọn phương thức thanh toán COD |
| **Điều kiện trước** | - Đã nhập địa chỉ giao hàng<br>- Đang ở bước chọn phương thức thanh toán |
| **Các bước** | 1. Tại bước chọn phương thức thanh toán<br>2. Chọn "Thanh toán khi nhận hàng (COD)"<br>3. Nhấn "Tiếp tục" |
| **Kết quả mong đợi** | - Phương thức COD được chọn<br>- Hiển thị tổng tiền cần thanh toán khi nhận hàng<br>- Chuyển đến bước xác nhận đơn hàng |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R14 |

---

### TC_CHECKOUT_005 - Chọn thanh toán bằng thẻ Visa (Giả lập)
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_005 |
| **Tiêu đề** | Thanh toán bằng thẻ Visa giả lập thành công |
| **Điều kiện trước** | - Đã nhập địa chỉ giao hàng<br>- Đang ở bước chọn phương thức thanh toán |
| **Các bước** | 1. Chọn "Thanh toán bằng thẻ Visa"<br>2. Nhập số thẻ: 4111 1111 1111 1111<br>3. Nhập ngày hết hạn: 12/28<br>4. Nhập CVV: 123<br>5. Nhập tên chủ thẻ: NGUYEN VAN A<br>6. Nhấn "Thanh toán" |
| **Kết quả mong đợi** | - Thanh toán thành công (giả lập)<br>- Chuyển đến trang xác nhận đơn hàng<br>- Trạng thái thanh toán: "Đã thanh toán" |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R14 |

---

### TC_CHECKOUT_006 - Thanh toán thẻ thất bại (CVV sai)
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_006 |
| **Tiêu đề** | Thanh toán thẻ thất bại do CVV không hợp lệ |
| **Điều kiện trước** | - Đang ở bước nhập thông tin thẻ |
| **Các bước** | 1. Chọn thanh toán bằng thẻ Visa<br>2. Nhập số thẻ hợp lệ: 4111 1111 1111 1111<br>3. Nhập CVV sai: 999 (giả lập thẻ không hợp lệ)<br>4. Nhấn "Thanh toán" |
| **Kết quả mong đợi** | - Thanh toán thất bại<br>- Hiển thị thông báo "Thông tin thẻ không hợp lệ" hoặc "Giao dịch bị từ chối"<br>- Cho phép nhập lại thông tin |
| **Độ ưu tiên** | High |
| **Loại test** | Negative |
| **Requirement** | R14 |

---

## ĐẶT HÀNG (Place Order)

### TC_CHECKOUT_007 - Đặt hàng thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_007 |
| **Tiêu đề** | Đặt hàng thành công với đầy đủ thông tin |
| **Điều kiện trước** | - Đã nhập địa chỉ giao hàng<br>- Đã chọn phương thức thanh toán (COD)<br>- Đang ở bước xác nhận đơn hàng |
| **Các bước** | 1. Kiểm tra thông tin đơn hàng (sản phẩm, giá, địa chỉ)<br>2. Tick chấp nhận điều khoản (nếu có)<br>3. Nhấn nút "Đặt hàng" |
| **Kết quả mong đợi** | - Đơn hàng được tạo thành công<br>- Hiển thị mã đơn hàng (Order ID)<br>- Hiển thị thông báo "Đặt hàng thành công"<br>- Gửi email xác nhận đơn hàng |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R15 |

---

### TC_CHECKOUT_008 - Đặt hàng với giỏ hàng trống
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_008 |
| **Tiêu đề** | Không cho phép checkout khi giỏ hàng trống |
| **Điều kiện trước** | - User đã đăng nhập<br>- Giỏ hàng đang trống |
| **Các bước** | 1. Mở trang giỏ hàng (đang trống)<br>2. Thử nhấn nút "Tiến hành thanh toán" |
| **Kết quả mong đợi** | - Nút "Tiến hành thanh toán" bị disabled hoặc ẩn<br>- Hiển thị thông báo "Giỏ hàng trống, vui lòng thêm sản phẩm" |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative |
| **Requirement** | R15 |

---

## XEM LỊCH SỬ ĐƠN HÀNG (Order History)

### TC_CHECKOUT_009 - Xem lịch sử đơn hàng thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_009 |
| **Tiêu đề** | Xem danh sách lịch sử đơn hàng |
| **Điều kiện trước** | - User đã đăng nhập<br>- User đã có ít nhất 1 đơn hàng |
| **Các bước** | 1. Đăng nhập vào tài khoản<br>2. Truy cập "Tài khoản" → "Lịch sử đơn hàng"<br>3. Xem danh sách đơn hàng |
| **Kết quả mong đợi** | - Hiển thị danh sách tất cả đơn hàng đã đặt<br>- Mỗi đơn hàng hiển thị: Mã đơn, Ngày đặt, Tổng tiền, Trạng thái<br>- Có thể click để xem chi tiết đơn hàng |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R16 |

---

### TC_CHECKOUT_010 - Xem chi tiết đơn hàng
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CHECKOUT_010 |
| **Tiêu đề** | Xem chi tiết một đơn hàng cụ thể |
| **Điều kiện trước** | - User đã đăng nhập<br>- User có đơn hàng trong lịch sử |
| **Các bước** | 1. Truy cập trang lịch sử đơn hàng<br>2. Click vào một đơn hàng để xem chi tiết |
| **Kết quả mong đợi** | - Hiển thị đầy đủ thông tin đơn hàng:<br>  + Mã đơn hàng<br>  + Danh sách sản phẩm (tên, số lượng, giá)<br>  + Địa chỉ giao hàng<br>  + Phương thức thanh toán<br>  + Tổng tiền<br>  + Trạng thái đơn hàng |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R16 |

---

## TỔNG KẾT MODULE CHECKOUT

| Loại Test | Số lượng | Test Case IDs |
|-----------|----------|---------------|
| **Positive** | 6 | TC_CHECKOUT_001, 004, 005, 007, 009, 010 |
| **Negative** | 4 | TC_CHECKOUT_002, 003, 006, 008 |
| **Validation** | 2 | TC_CHECKOUT_002, 003 |
| **Tổng** | **10** | |

---

## TỔNG KẾT TẤT CẢ CÁC MODULE

| Module | Số lượng Test Cases | Positive | Negative | Boundary | Security/Validation |
|--------|---------------------|----------|----------|----------|---------------------|
| Authentication | 15 | 5 | 6 | 2 | 5 |
| Product & Cart | 20 | 11 | 5 | 4 | 2 |
| Checkout | 10 | 6 | 4 | 0 | 2 |
| **Tổng** | **45** | **22** | **15** | **6** | **9** |

---

*Tài liệu này được tạo theo chuẩn của Software-Testing-Projects (GitHub)*
