package com.yaya25001.dagger2copy.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yaya25001.dagger2copy.R;
import com.yaya25001.dagger2copy.ToastUtil;
import com.yaya25001.dagger2copy.di.components.MainFragmentComponent;
import com.yaya25001.dagger2copy.presenter.IUserView;
import com.yaya25001.dagger2copy.presenter.MainPresenter;

import javax.inject.Inject;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class MainFragment extends BaseFragment implements IUserView {


    @Inject
    MainPresenter mainPresenter;

    @Inject
    ToastUtil toastUtil;

    private MainFragmentComponent mainFragmentComponent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        view.findViewById(R.id.show_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastUtil.showToast("依赖注入获取到的toast");
            }
        });
        view.findViewById(R.id.get_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.getUser();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: 2017/4/6
//        toastUtil = new ToastUtil(getActivity());
//        mainPresenter = new MainPresenter(new GetUserData());

        if (getActivity() instanceof MainActivity) {

            mainFragmentComponent = ((MainActivity)getActivity()).getMainComponent()
                    .mainFragmentComponent();
            mainFragmentComponent.inject(this);

            mainPresenter.setUserView(this);

        }

    }

    @Override
    public void setUserName(String name) {
        ((TextView)getView().findViewById(R.id.user_info)).setText(name);
    }
}
