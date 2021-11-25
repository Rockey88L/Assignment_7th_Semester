package ex.and.next;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RoleSelection extends AppCompatActivity {

    // declare
    Button btnSeller, btnCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);

        // initialize
        btnSeller = findViewById(R.id.btnSeller);
        btnCustomer = findViewById(R.id.btnCustomer);

        // click listeners
        btnSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(RoleSelection.this, LoginActivity.class);
                startActivity(obj);
            }
        });

        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(RoleSelection.this, LoginActivity.class);
                startActivity(obj);
            }
        });

    }
}