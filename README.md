# android-tiny-ui
[![Download](https://api.bintray.com/packages/ddnosh/maven/tinyui/images/download.svg) ](https://bintray.com/ddnosh/maven/tinyui/_latestVersion)  
A tiny ui library for android.  

# Solution
1. we use view handler to handle view's AttributeSet

# Function
1. handle with xml;
2. handle with Java code;

# Usage
1. 
``` xml
<com.androidwind.ui.view.TinyTextView
        android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TinyTextView"
        app:background_normal="@color/colorPrimary"
        app:background_pressed="@color/colorPrimaryDark"
        app:corner_radius="6dp" />
```

2.
``` java
public void BtnClick(View view) {
        TinyTextView ttv = findViewById(R.id.ttv);
        //获取Helper
        TinyTextViewHandler handler = ttv.getViewHandler();
        handler.setBackgroundColorNormal(getResources().getColor(android.R.color.holo_red_dark))
                .setBorderColorNormal(getResources().getColor(android.R.color.holo_orange_light))
                .setBorderWidthNormal(12)
                .setCornerRadius(25);
    }
```
