package id.ac.polinema.skor.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import id.ac.polinema.skor.models.GoalScorer;
import id.ac.polinema.skor.databinding.FragmentGoalBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class GoalFragment extends Fragment {

	private String requestKey;
	private GoalScorer goalScorer;
	FragmentGoalBinding binding;

	public GoalFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.goalScorer = new GoalScorer();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		binding = FragmentGoalBinding.inflate(inflater,container,false);
		View view = binding.getRoot();
		return view;
	}

	public void onSaveClicked(View view) {


	}

	public void onCancelClicked(View view) {

	}
}