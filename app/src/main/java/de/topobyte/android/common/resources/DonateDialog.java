// Copyright 2023 Sebastian Kuerten
//
// This file is part of stadtplan-app.
//
// stadtplan-app is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// stadtplan-app is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with stadtplan-app. If not, see <http://www.gnu.org/licenses/>.

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

import de.topobyte.android.intent.utils.ThankOption;
import de.topobyte.android.intent.utils.TopobyteIntentFactory;

public class DonateDialog extends DialogFragment
{

  public static final String ARG_VALUE = "value";

  private ThankOption value;

  public static DonateDialog donateDialog(ThankOption value)
  {
    DonateDialog dialog = new DonateDialog();
    Bundle args = new Bundle();
    args.putSerializable(DonateDialog.ARG_VALUE, value);
    dialog.setArguments(args);
    return dialog;
  }

  @Override
  @SuppressLint("InflateParams")
  public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
  {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

    LayoutInflater inflater = getActivity().getLayoutInflater();

    builder.setTitle(R.string.cr_support_us);
    View view = inflater.inflate(R.layout.dialog_donate, null);
    builder.setView(view);

    Bundle arguments = getArguments();
    value = (ThankOption) arguments.get(ARG_VALUE);

    builder.setNegativeButton(android.R.string.cancel,
        (dialog, id) -> {
          // ignore
        });

    CommonIcons commonIcons = new CommonIcons(getContext(), 36);
    TextView textView = view.findViewById(R.id.textView2);
    switch (value) {
      default:
      case THANK_RATE:
        // should not happen here.
        break;
      case THANK_1:
        commonIcons.setCafe(textView);
        textView.setText(R.string.fb_donate1);
        break;
      case THANK_2:
        commonIcons.setBeer(textView);
        textView.setText(R.string.fb_donate2);
        break;
      case THANK_5:
        commonIcons.setCinema(textView);
        textView.setText(R.string.fb_donate5);
        break;
      case THANK_10:
        commonIcons.setRestaurant(textView);
        textView.setText(R.string.fb_donate10);
        break;
    }


    Button button = view.findViewById(R.id.button);
    button.setOnClickListener(v -> {
      openGooglePlay();
      dismiss();
    });

    return builder.create();
  }

  private void openGooglePlay()
  {
    Intent intent = TopobyteIntentFactory.createThanksAppDetailIntent(value);
    startActivity(intent);
  }
}
