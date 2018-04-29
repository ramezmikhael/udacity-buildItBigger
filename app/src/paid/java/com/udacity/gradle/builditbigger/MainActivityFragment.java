package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.jokedisplay.JokeActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements EndpointsAsyncTask.PostExecuteListener {

    private ProgressBar progressBar;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        progressBar = root.findViewById(R.id.progressBar);
        Button tellJoke = root.findViewById(R.id.btnTellJoke);
        tellJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tellJoke();
            }
        });
        return root;
    }

    private void tellJoke() {
        progressBar.setVisibility(View.VISIBLE);
        EndpointsAsyncTask task = new EndpointsAsyncTask(this);
        task.execute(getActivity());
    }

    @Override
    public void executeFinished(String result) {
        progressBar.setVisibility(View.GONE);

        Intent intent = new Intent(getActivity(), JokeActivity.class);
        intent.putExtra(JokeActivity.ARG_JOKE, result);
        getActivity().startActivity(intent);
    }
}
