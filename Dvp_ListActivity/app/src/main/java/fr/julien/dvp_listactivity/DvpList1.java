package fr.julien.dvp_listactivity;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class DvpList1 extends AppCompatActivity {

    int[] IMAGES = {R.drawable.ic_strawberry, R.drawable.ic_potatoe, R.drawable.ic_tomatoe, R.drawable.ic_meat};

    String[] PRODUCT = {"Fraise", "Patate", "Tomate", "Viande" };

    String[] QUANTITY = {"1 barquette", "1kg", "3", "500g"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dvp_list1);

        ListView listView = findViewById(R.id.listviewperso);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.affichageitem,null);

            ImageView img = convertView.findViewById(R.id.img);
            TextView Product = convertView.findViewById(R.id.Product);
            TextView Quantity = convertView.findViewById(R.id.Quantity);

            img.setImageResource(IMAGES[position]);
            Product.setText(PRODUCT[position]);
            Quantity.setText(QUANTITY[position]);




            return null;
        }
    }

}
