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

package de.topobyte.android.common.resources.hasviews;

import android.app.Activity;
import android.view.View;

import androidx.annotation.IdRes;

public class ActivityHasViews implements HasViews {

  private Activity activity;

  public ActivityHasViews(Activity activity)
  {
    this.activity = activity;
  }

  @Override
  public <T extends View> T findViewById(@IdRes int id)
  {
    return activity.findViewById(id);
  }

}
