# CA KIỂM THỬ - MODULE SẢN PHẨM & GIỎ HÀNG (PRODUCT & CART)
## Dự án: Website Bán Hàng Online (E-commerce)

| Thông tin | Chi tiết |
|-----------|----------|
| **Module** | Product & Cart |
| **Phiên bản** | 1.0 |
| **Ngày tạo** | 29/01/2026 |
| **Tổng số Test Cases** | 20 |

---

## TÌM KIẾM SẢN PHẨM (Search)

### TC_CART_001 - Tìm kiếm sản phẩm thành công với từ khóa hợp lệ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_001 |
| **Tiêu đề** | Tìm kiếm sản phẩm với từ khóa chính xác |
| **Điều kiện trước** | - Sản phẩm "Áo thun nam" đã tồn tại trong hệ thống |
| **Các bước** | 1. Mở trang chủ<br>2. Nhập từ khóa "Áo thun nam" vào ô tìm kiếm<br>3. Nhấn nút tìm kiếm hoặc Enter |
| **Kết quả mong đợi** | - Hiển thị danh sách sản phẩm chứa từ khóa "Áo thun nam"<br>- Kết quả được highlight từ khóa tìm kiếm |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R7 |

---

### TC_CART_002 - Tìm kiếm không có kết quả
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_002 |
| **Tiêu đề** | Tìm kiếm với từ khóa không tồn tại |
| **Điều kiện trước** | - Không có sản phẩm nào chứa từ khóa "xyzabc123" |
| **Các bước** | 1. Mở trang chủ<br>2. Nhập từ khóa "xyzabc123" vào ô tìm kiếm<br>3. Nhấn nút tìm kiếm |
| **Kết quả mong đợi** | - Hiển thị thông báo "Không tìm thấy sản phẩm nào"<br>- Có thể gợi ý các từ khóa khác |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative |
| **Requirement** | R7 |

---

### TC_CART_003 - Tìm kiếm với từ khóa rỗng
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_003 |
| **Tiêu đề** | Tìm kiếm khi không nhập từ khóa |
| **Điều kiện trước** | - Trang web đã load |
| **Các bước** | 1. Mở trang chủ<br>2. Để trống ô tìm kiếm<br>3. Nhấn nút tìm kiếm |
| **Kết quả mong đợi** | - Hiển thị thông báo "Vui lòng nhập từ khóa tìm kiếm"<br>- Hoặc hiển thị tất cả sản phẩm |
| **Độ ưu tiên** | Low |
| **Loại test** | Boundary |
| **Requirement** | R7 |

---

### TC_CART_004 - Tìm kiếm với ký tự đặc biệt
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_004 |
| **Tiêu đề** | Tìm kiếm với ký tự đặc biệt (SQL Injection) |
| **Điều kiện trước** | - Trang web đã load |
| **Các bước** | 1. Mở trang chủ<br>2. Nhập từ khóa: "'; DROP TABLE products;--"<br>3. Nhấn nút tìm kiếm |
| **Kết quả mong đợi** | - Không xảy ra lỗi hệ thống<br>- Hiển thị "Không tìm thấy sản phẩm" hoặc xử lý an toàn |
| **Độ ưu tiên** | High |
| **Loại test** | Security / Validation |
| **Requirement** | R7 |

---

## LỌC SẢN PHẨM (Filter)

### TC_CART_005 - Lọc sản phẩm theo khoảng giá
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_005 |
| **Tiêu đề** | Lọc sản phẩm theo khoảng giá 100.000đ - 500.000đ |
| **Điều kiện trước** | - Có sản phẩm trong khoảng giá 100.000đ - 500.000đ |
| **Các bước** | 1. Mở trang danh sách sản phẩm<br>2. Tại bộ lọc giá, chọn khoảng 100.000đ - 500.000đ<br>3. Nhấn "Áp dụng" |
| **Kết quả mong đợi** | - Chỉ hiển thị các sản phẩm có giá trong khoảng 100.000đ - 500.000đ<br>- Số lượng kết quả được cập nhật |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R8 |

---

### TC_CART_006 - Lọc sản phẩm theo danh mục
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_006 |
| **Tiêu đề** | Lọc sản phẩm theo danh mục "Điện thoại" |
| **Điều kiện trước** | - Danh mục "Điện thoại" tồn tại và có sản phẩm |
| **Các bước** | 1. Mở trang danh sách sản phẩm<br>2. Chọn danh mục "Điện thoại" từ bộ lọc<br>3. Nhấn "Áp dụng" hoặc tự động filter |
| **Kết quả mong đợi** | - Chỉ hiển thị sản phẩm thuộc danh mục "Điện thoại"<br>- Breadcrumb hiển thị đường dẫn danh mục |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R8 |

---

### TC_CART_007 - Lọc kết hợp giá và danh mục
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_007 |
| **Tiêu đề** | Lọc sản phẩm kết hợp theo giá và danh mục |
| **Điều kiện trước** | - Có sản phẩm thỏa mãn cả 2 điều kiện lọc |
| **Các bước** | 1. Mở trang danh sách sản phẩm<br>2. Chọn danh mục "Thời trang"<br>3. Chọn khoảng giá 200.000đ - 1.000.000đ<br>4. Nhấn "Áp dụng" |
| **Kết quả mong đợi** | - Hiển thị sản phẩm thuộc danh mục "Thời trang" VÀ giá trong khoảng đã chọn<br>- Filters được hiển thị đang active |
| **Độ ưu tiên** | Medium |
| **Loại test** | Positive |
| **Requirement** | R8 |

---

### TC_CART_008 - Lọc không có kết quả
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_008 |
| **Tiêu đề** | Lọc với điều kiện không có sản phẩm nào thỏa mãn |
| **Điều kiện trước** | - Không có sản phẩm giá dưới 1.000đ |
| **Các bước** | 1. Mở trang danh sách sản phẩm<br>2. Chọn khoảng giá 0đ - 1.000đ<br>3. Nhấn "Áp dụng" |
| **Kết quả mong đợi** | - Hiển thị thông báo "Không có sản phẩm nào trong khoảng giá này"<br>- Có nút xóa bộ lọc |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative |
| **Requirement** | R8 |

---

## XEM CHI TIẾT SẢN PHẨM (Product Detail)

### TC_CART_009 - Xem chi tiết sản phẩm thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_009 |
| **Tiêu đề** | Xem chi tiết sản phẩm từ danh sách |
| **Điều kiện trước** | - Có sản phẩm trong danh sách |
| **Các bước** | 1. Mở trang danh sách sản phẩm<br>2. Click vào một sản phẩm bất kỳ |
| **Kết quả mong đợi** | - Chuyển đến trang chi tiết sản phẩm<br>- Hiển thị đầy đủ: Tên, Giá, Mô tả, Hình ảnh, Số lượng còn lại |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R9 |

---

### TC_CART_010 - Xem hình ảnh sản phẩm (gallery)
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_010 |
| **Tiêu đề** | Xem gallery hình ảnh sản phẩm |
| **Điều kiện trước** | - Sản phẩm có nhiều hình ảnh |
| **Các bước** | 1. Mở trang chi tiết sản phẩm<br>2. Click vào các thumbnail hình ảnh khác nhau<br>3. Click zoom hình ảnh (nếu có) |
| **Kết quả mong đợi** | - Hình ảnh chính thay đổi khi click thumbnail<br>- Có thể zoom để xem chi tiết |
| **Độ ưu tiên** | Medium |
| **Loại test** | Positive |
| **Requirement** | R9 |

---

## THÊM SẢN PHẨM VÀO GIỎ (Add to Cart)

### TC_CART_011 - Thêm sản phẩm vào giỏ hàng thành công
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_011 |
| **Tiêu đề** | Thêm sản phẩm vào giỏ hàng thành công |
| **Điều kiện trước** | - Sản phẩm còn hàng<br>- User đã đăng nhập (nếu yêu cầu) |
| **Các bước** | 1. Mở trang chi tiết sản phẩm<br>2. Chọn số lượng: 2<br>3. Nhấn nút "Thêm vào giỏ hàng" |
| **Kết quả mong đợi** | - Thông báo "Đã thêm vào giỏ hàng"<br>- Icon giỏ hàng cập nhật số lượng<br>- Sản phẩm xuất hiện trong giỏ |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R10 |

---

### TC_CART_012 - Thêm sản phẩm hết hàng
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_012 |
| **Tiêu đề** | Thêm sản phẩm khi hết hàng |
| **Điều kiện trước** | - Sản phẩm có số lượng tồn kho = 0 |
| **Các bước** | 1. Mở trang chi tiết sản phẩm hết hàng<br>2. Thử nhấn nút "Thêm vào giỏ hàng" |
| **Kết quả mong đợi** | - Nút "Thêm vào giỏ hàng" bị disabled hoặc đổi thành "Hết hàng"<br>- Không thể thêm vào giỏ |
| **Độ ưu tiên** | High |
| **Loại test** | Negative |
| **Requirement** | R10 |

---

### TC_CART_013 - Thêm sản phẩm với số lượng vượt tồn kho
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_013 |
| **Tiêu đề** | Thêm sản phẩm với số lượng lớn hơn tồn kho |
| **Điều kiện trước** | - Sản phẩm có số lượng tồn kho = 5 |
| **Các bước** | 1. Mở trang chi tiết sản phẩm (tồn kho = 5)<br>2. Nhập số lượng: 10<br>3. Nhấn "Thêm vào giỏ hàng" |
| **Kết quả mong đợi** | - Thông báo lỗi "Số lượng vượt quá tồn kho"<br>- Hoặc tự động điều chỉnh về số lượng tối đa có thể mua |
| **Độ ưu tiên** | High |
| **Loại test** | Boundary |
| **Requirement** | R10 |

---

### TC_CART_014 - Thêm sản phẩm với số lượng = 0
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_014 |
| **Tiêu đề** | Thêm sản phẩm với số lượng bằng 0 |
| **Điều kiện trước** | - Sản phẩm còn hàng |
| **Các bước** | 1. Mở trang chi tiết sản phẩm<br>2. Nhập số lượng: 0<br>3. Nhấn "Thêm vào giỏ hàng" |
| **Kết quả mong đợi** | - Không cho phép nhập 0<br>- Hoặc hiển thị lỗi "Số lượng phải lớn hơn 0" |
| **Độ ưu tiên** | Medium |
| **Loại test** | Boundary / Negative |
| **Requirement** | R10 |

---

### TC_CART_015 - Thêm sản phẩm với số lượng âm
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_015 |
| **Tiêu đề** | Thêm sản phẩm với số lượng âm |
| **Điều kiện trước** | - Sản phẩm còn hàng |
| **Các bước** | 1. Mở trang chi tiết sản phẩm<br>2. Thử nhập số lượng: -1<br>3. Nhấn "Thêm vào giỏ hàng" |
| **Kết quả mong đợi** | - Không cho phép nhập số âm<br>- Input chỉ chấp nhận số dương |
| **Độ ưu tiên** | Medium |
| **Loại test** | Negative / Validation |
| **Requirement** | R10 |

---

## CẬP NHẬT GIỎ HÀNG (Update Cart)

### TC_CART_016 - Cập nhật số lượng sản phẩm trong giỏ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_016 |
| **Tiêu đề** | Cập nhật tăng số lượng sản phẩm trong giỏ hàng |
| **Điều kiện trước** | - Giỏ hàng có sản phẩm A với số lượng = 1<br>- Sản phẩm A còn tồn kho |
| **Các bước** | 1. Mở trang giỏ hàng<br>2. Tăng số lượng sản phẩm A từ 1 lên 3<br>3. Nhấn "Cập nhật" hoặc tự động cập nhật |
| **Kết quả mong đợi** | - Số lượng được cập nhật thành 3<br>- Tổng tiền được tính lại đúng<br>- Thông báo "Giỏ hàng đã được cập nhật" |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R11 |

---

### TC_CART_017 - Giảm số lượng sản phẩm trong giỏ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_017 |
| **Tiêu đề** | Cập nhật giảm số lượng sản phẩm trong giỏ |
| **Điều kiện trước** | - Giỏ hàng có sản phẩm B với số lượng = 5 |
| **Các bước** | 1. Mở trang giỏ hàng<br>2. Giảm số lượng sản phẩm B từ 5 xuống 2<br>3. Nhấn "Cập nhật" |
| **Kết quả mong đợi** | - Số lượng được cập nhật thành 2<br>- Tổng tiền giảm tương ứng |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R11 |

---

### TC_CART_018 - Cập nhật số lượng vượt tồn kho
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_018 |
| **Tiêu đề** | Cập nhật số lượng vượt quá tồn kho |
| **Điều kiện trước** | - Giỏ hàng có sản phẩm C (tồn kho = 10) |
| **Các bước** | 1. Mở trang giỏ hàng<br>2. Thay đổi số lượng sản phẩm C thành 15<br>3. Nhấn "Cập nhật" |
| **Kết quả mong đợi** | - Thông báo lỗi "Số lượng vượt quá tồn kho (còn 10)"<br>- Số lượng không được cập nhật hoặc tự động điều chỉnh về 10 |
| **Độ ưu tiên** | High |
| **Loại test** | Boundary |
| **Requirement** | R11 |

---

## XÓA SẢN PHẨM KHỎI GIỎ (Remove from Cart)

### TC_CART_019 - Xóa sản phẩm khỏi giỏ hàng
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_019 |
| **Tiêu đề** | Xóa một sản phẩm khỏi giỏ hàng |
| **Điều kiện trước** | - Giỏ hàng có ít nhất 2 sản phẩm |
| **Các bước** | 1. Mở trang giỏ hàng<br>2. Nhấn nút "Xóa" hoặc icon thùng rác bên cạnh sản phẩm muốn xóa<br>3. Xác nhận xóa (nếu có popup) |
| **Kết quả mong đợi** | - Sản phẩm được xóa khỏi giỏ hàng<br>- Danh sách giỏ hàng cập nhật<br>- Tổng tiền được tính lại |
| **Độ ưu tiên** | High |
| **Loại test** | Positive |
| **Requirement** | R12 |

---

### TC_CART_020 - Xóa tất cả sản phẩm khỏi giỏ
| Trường | Nội dung |
|--------|----------|
| **TC_ID** | TC_CART_020 |
| **Tiêu đề** | Xóa tất cả sản phẩm - Giỏ hàng trống |
| **Điều kiện trước** | - Giỏ hàng có ít nhất 1 sản phẩm |
| **Các bước** | 1. Mở trang giỏ hàng<br>2. Xóa từng sản phẩm cho đến khi giỏ trống<br>3. Hoặc nhấn "Xóa tất cả" (nếu có) |
| **Kết quả mong đợi** | - Giỏ hàng trống<br>- Hiển thị thông báo "Giỏ hàng của bạn đang trống"<br>- Có link/nút đến trang mua sắm |
| **Độ ưu tiên** | Medium |
| **Loại test** | Positive |
| **Requirement** | R12 |

---

## TỔNG KẾT MODULE PRODUCT & CART

| Loại Test | Số lượng | Test Case IDs |
|-----------|----------|---------------|
| **Positive** | 11 | TC_CART_001, 005, 006, 007, 009, 010, 011, 016, 017, 019, 020 |
| **Negative** | 5 | TC_CART_002, 008, 012, 014, 015 |
| **Boundary** | 4 | TC_CART_003, 013, 014, 018 |
| **Security/Validation** | 2 | TC_CART_004, 015 |
| **Tổng** | **20** | |

---

*Tài liệu này được tạo theo chuẩn của Software-Testing-Projects (GitHub)*
