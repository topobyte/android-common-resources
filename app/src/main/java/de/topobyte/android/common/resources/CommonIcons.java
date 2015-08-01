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
import android.widget.TextView;

public class CommonIcons {

  private BvgIconUtil iconUtil;

  public CommonIcons(Context context, int isize)
  {
    iconUtil = new BvgIconUtil(context, isize);
  }

  public void setRate(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_rate.bvg");
  }

  public void setEmail(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_email.bvg");
  }

  public void setShare(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_share.bvg");
  }

  public void setCafe(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_cafe.bvg");
  }

  public void setBeer(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_biergarten.bvg");
  }

  public void setCinema(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_cinema.bvg");
  }

  public void setRestaurant(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_restaurant.bvg");
  }

  public void setMap(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_map.bvg");
  }

  public void setNetzplan(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_netzplan.bvg");
  }

  public void setDice(TextView view)
  {
    iconUtil.setIcon(view, "common-icons/item_dice.bvg");
  }

}
