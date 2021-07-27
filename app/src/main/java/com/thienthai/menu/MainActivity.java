package com.thienthai.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        //  Khởi tạo menu "onCreateOptionsMenu"
            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.menu.menu, menu);
                return super.onCreateOptionsMenu(menu);
            }

        //    Bất sự kiện menu "onOptionsItemSelected"'

            @Override
            public boolean onOptionsItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.DanhSach_menu:
                    Toast.makeText(this, "Danh sach", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.DiaChi_menu:
                    Toast.makeText(this, "Đia chỉ", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.phone_menu:
                    Toast.makeText(this, "Phone", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.php_memu:
                    Toast.makeText(this, "Php", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Seach_menu:
                    Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Setting_menu:
                    Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
}