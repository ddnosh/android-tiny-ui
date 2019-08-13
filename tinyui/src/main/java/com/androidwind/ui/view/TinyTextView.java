package com.androidwind.ui.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.androidwind.ui.ViewHandler;
import com.androidwind.ui.handler.TinyTextViewHandler;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyTextView extends TextView implements ViewHandler<TinyTextViewHandler> {

    private TinyTextViewHandler handler;

    public TinyTextView(Context context) {
        this(context, null);
    }

    public TinyTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TinyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public TinyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        handler = new TinyTextViewHandler(context, this, attrs);
    }

    @Override
    public TinyTextViewHandler getViewHandler() {
        return handler;
    }
}
