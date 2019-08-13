package com.androidwind.ui;

import com.androidwind.ui.handler.TinyBaseViewHandler;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface ViewHandler<T extends TinyBaseViewHandler> {

    T getViewHandler();
}
