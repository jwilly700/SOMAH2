package eps.somah2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rernande on 21/10/2016.
 */

public class NamedTopicAdapter extends ArrayAdapter<NamedTopic>
{
    public NamedTopicAdapter(Context context, int resource, List<NamedTopic> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.topic, null);

        final ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);
        final TextView textView = (TextView) view.findViewById(R.id.textView);
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.imageView2);

        NamedTopic namedTopic = getItem(position);
        int [] arrayColors={Color.parseColor("#00bfff"), Color.parseColor("#ff6600"), Color.parseColor("#00cc99"), Color.parseColor("#ffcc00"), Color.parseColor("#0066cc"), Color.parseColor("#ff0066"), Color.parseColor("#00bfff"), Color.parseColor("#ff6600"), Color.parseColor("#00cc99"), Color.parseColor("#ffcc00"), Color.parseColor("#0066cc"), Color.parseColor("#ff0066")};
        Bitmap bitmap = BitmapFactory.decodeByteArray(namedTopic.getImage(), 0, namedTopic.getImage().length);
        imageView1.setImageBitmap(bitmap);
        textView.setText(namedTopic.getName());
        imageView2.setBackgroundColor(arrayColors[position]);

        return view;
    }
}
