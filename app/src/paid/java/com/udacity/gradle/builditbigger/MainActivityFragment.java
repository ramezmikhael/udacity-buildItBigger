package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

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
    public void executeFinished() {
        progressBar.setVisibility(View.GONE);
    }
}
