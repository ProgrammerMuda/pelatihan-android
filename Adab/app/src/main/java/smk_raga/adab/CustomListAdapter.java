package smk_raga.adab;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import smk_raga.adab.R;

/**
 * Created by RAGA on 03/12/2017.
 */

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] namaadab;
    private final String[] subtitle;
    private final Integer[] gambaradab;

    public CustomListAdapter(Activity context, String[] namaadab, String[] subtitle, Integer[] gambaradab) {
        super(context, R.layout.list_item, namaadab);
        this.context = context;
        this.namaadab = namaadab;
        this.subtitle = subtitle;
        this.gambaradab = gambaradab;
    }
    public View getView (int posisi, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item,null,true);
        TextView title = (TextView)rowView.findViewById(R.id.text1);
        TextView Subtitle = (TextView)rowView.findViewById(R.id.tex22);
        ImageView picture = (ImageView)rowView.findViewById(R.id.image1);
        title.setText(namaadab[posisi]);
        Subtitle.setText(subtitle[posisi]);
        picture.setImageResource(gambaradab[posisi]);

        return  rowView;
    }
}
