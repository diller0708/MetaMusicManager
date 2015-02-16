package richard.metamusicmanager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class BaseListAdaptor extends ArrayAdapter {
   private static final String[] baseItems = {"Artists", "Albums", "Songs", "Genres", "Playlists"};
   private static final int[] baseItemImageSrc = {R.drawable.artist, R.drawable.album, R.drawable.song, R.drawable.genre, R.drawable.playlist};
   private Context context;


    public BaseListAdaptor(Context context){
        super(context, R.layout.base_list_item, baseItems);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.base_list_item, null);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.base_item_image);
        imageView.setImageResource(baseItemImageSrc[position]);

        TextView itemText = (TextView) convertView.findViewById(R.id.base_item_text);
        itemText.setText(baseItems[position]);

        return convertView;
    }

}
