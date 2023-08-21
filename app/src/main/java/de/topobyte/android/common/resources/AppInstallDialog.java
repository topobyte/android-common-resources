// Copyright 2021 Sebastian Kuerten
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

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import de.topobyte.android.intent.utils.IntentFactory;

public class AppInstallDialog extends DialogFragment
{

  public static final String ARG_APP = "value";

  private AppInfo app;

  public static AppInstallDialog newInstance(AppInfo app)
  {
    AppInstallDialog dialog = new AppInstallDialog();
    Bundle args = new Bundle();
    args.putSerializable(AppInstallDialog.ARG_APP, app);
    dialog.setArguments(args);
    return dialog;
  }

  @Override
  @SuppressLint("InflateParams")
  public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
  {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

    LayoutInflater inflater = getActivity().getLayoutInflater();

    builder.setTitle(R.string.cr_dialog_install_app_title);
    View view = inflater.inflate(R.layout.dialog_install_app, null);
    builder.setView(view);

    Bundle arguments = getArguments();
    app = (AppInfo) arguments.getSerializable(ARG_APP);

    TextView textView = view.findViewById(R.id.textView);

    textView.setText(
        getString(R.string.cr_dialog_install_app_text, app.getTypeName(), app.getCityName()));

    builder.setNegativeButton(android.R.string.cancel,
        (dialog, id) -> {
          // ignore
        });

    Button button = view.findViewById(R.id.button);
    button.setOnClickListener(v -> {
      openGooglePlay();
      dismiss();
    });

    return builder.create();
  }

  private void openGooglePlay()
  {
    Intent intent = IntentFactory.createGooglePlayAppDetailsIntent(app.getAppId());
    startActivity(intent);
  }
}
