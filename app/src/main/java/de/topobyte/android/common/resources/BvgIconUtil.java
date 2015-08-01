// Copyright 2015 Sebastian Kuerten
//
// This file is part of android-common-resources.
//
// android-common-resources is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// android-common-resources is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with android-common-resources. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.android.common.resources;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import de.topobyte.bvg.android.BvgDrawable;
import de.topobyte.bvg.android.CacheMode;

public class BvgIconUtil {

  private final Context context;
  private final int size;

  public BvgIconUtil(Context context, int isize)
  {
    this.context = context;
    float density = context.getResources().getDisplayMetrics().density;
    size = Math.round(density * isize);
  }

  public void setIcon(TextView view, String path)
  {
    BvgDrawable l = new BvgDrawable(context, path,
        CacheMode.OFFSCREEN);
    l.setBounds(0, 0, size, size);
    view.setCompoundDrawables(l, null, null, null);
  }

  public void setIcon(View view, int itemId, String path)
  {
    TextView textview = view.findViewById(itemId);
    setIcon(textview, path);
  }

  public void setIcon(TextView view, String path, int isize)
  {
    int size = Math.round(context.getResources().getDisplayMetrics().density * isize);
    BvgDrawable l = new BvgDrawable(context, path,
        CacheMode.OFFSCREEN);
    l.setBounds(0, 0, size, size);
    view.setCompoundDrawables(l, null, null, null);
  }

  public void setIcon(View view, int itemId, String path, int isize)
  {
    TextView textview = view.findViewById(itemId);
    setIcon(textview, path, isize);
  }

}
