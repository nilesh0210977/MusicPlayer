// Generated by view binder compiler. Do not edit!
package com.nileshSharma.musicPlayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.nileshSharma.musicPlayer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNowPlayingBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ExtendedFloatingActionButton nextBtnNP;

  @NonNull
  public final ExtendedFloatingActionButton playPauseBtnNP;

  @NonNull
  public final ShapeableImageView songImgNP;

  @NonNull
  public final TextView songNameNP;

  private FragmentNowPlayingBinding(@NonNull RelativeLayout rootView,
      @NonNull ExtendedFloatingActionButton nextBtnNP,
      @NonNull ExtendedFloatingActionButton playPauseBtnNP, @NonNull ShapeableImageView songImgNP,
      @NonNull TextView songNameNP) {
    this.rootView = rootView;
    this.nextBtnNP = nextBtnNP;
    this.playPauseBtnNP = playPauseBtnNP;
    this.songImgNP = songImgNP;
    this.songNameNP = songNameNP;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNowPlayingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNowPlayingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_now_playing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNowPlayingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.nextBtnNP;
      ExtendedFloatingActionButton nextBtnNP = ViewBindings.findChildViewById(rootView, id);
      if (nextBtnNP == null) {
        break missingId;
      }

      id = R.id.playPauseBtnNP;
      ExtendedFloatingActionButton playPauseBtnNP = ViewBindings.findChildViewById(rootView, id);
      if (playPauseBtnNP == null) {
        break missingId;
      }

      id = R.id.songImgNP;
      ShapeableImageView songImgNP = ViewBindings.findChildViewById(rootView, id);
      if (songImgNP == null) {
        break missingId;
      }

      id = R.id.songNameNP;
      TextView songNameNP = ViewBindings.findChildViewById(rootView, id);
      if (songNameNP == null) {
        break missingId;
      }

      return new FragmentNowPlayingBinding((RelativeLayout) rootView, nextBtnNP, playPauseBtnNP,
          songImgNP, songNameNP);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
