package com.ls.shacak.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.ls.shacak.R;

import java.util.ArrayList;

public class SliderAdapter extends PagerAdapter {
    Context context;
    ArrayList<SliderImageModel> all_list;
    LayoutInflater inflater;

    public SliderAdapter(Context context, ArrayList<SliderImageModel> all_list) {
        this.context = context;
        this.all_list = all_list;

    }

    @Override
    public int getCount() {
        System.out.println("Partha" + all_list.size());
        return all_list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView sliderImage;
        Button btnClose;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.slider_item, container,
                false);

        sliderImage = (ImageView) viewLayout.findViewById(R.id.slider_item_iv);

//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
//        Bitmap bitmap = BitmapFactory.decodeFile(all_list.get(position).getUrl(), options);
//        imgDisplay.setImageBitmap(bitmap);

        // close button click event
//        btnClose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                context.finish();
//            }
//        });

        Glide.with(context)
                .asDrawable()
                .load(all_list.get(position).getDrawableUrl())
                .into(sliderImage);

        ((ViewPager) container).addView(viewLayout);

        return viewLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}
