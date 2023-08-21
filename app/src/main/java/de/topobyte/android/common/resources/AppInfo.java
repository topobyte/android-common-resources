// Copyright 2023 Sebastian Kuerten
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

import java.io.Serializable;

public class AppInfo implements Serializable
{

  private String appId;
  private String typeName;
  private String cityName;

  public AppInfo(String appId, String typeName, String cityName)
  {
    this.appId = appId;
    this.typeName = typeName;
    this.cityName = cityName;
  }

  public String getAppId()
  {
    return appId;
  }

  public String getTypeName()
  {
    return typeName;
  }

  public String getCityName()
  {
    return cityName;
  }
}