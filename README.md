# Parabank Automation Testing

## Chức năng trên Parabank để kiểm thử
### Đăng nhập (Login)

- Gồm các trường: Username và Password.
- Kịch bản kiểm thử:
- Đăng nhập thành công với thông tin hợp lệ.
Thử đăng nhập với thông tin sai.

### Đăng ký tài khoản (Register)

Gồm các trường thông tin: First Name, Last Name, Address, Username, Password. \\
Kịch bản kiểm thử: \\
Điền đúng thông tin và tạo tài khoản. \\
Bỏ trống các trường bắt buộc.\\
Nhập thông tin không hợp lệ (ví dụ: Email sai định dạng). \\

### Chuyển tiền (Transfer Funds)

Nhập số tiền cần chuyển và chọn tài khoản nguồn/đích.
Kịch bản kiểm thử:
Chuyển tiền thành công giữa các tài khoản.
Nhập số tiền âm hoặc vượt quá số dư.

### Kiểm tra số dư tài khoản (Account Overview)

Hiển thị danh sách tài khoản và số dư tương ứng.
Kịch bản kiểm thử:
Đăng nhập và kiểm tra số dư tài khoản có đúng không.
Kiểm tra khi không có tài khoản nào.

### Xem lịch sử giao dịch (Transaction History)

Hiển thị các giao dịch gần đây.
Kịch bản kiểm thử:
Lọc giao dịch theo ngày/tháng.
Kiểm tra tính chính xác của giao dịch.
