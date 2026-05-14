package kr.ac.kopo.tabhosttest;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecJJ = tabHost.newTabSpec("JJ").setIndicator("짱구");
        tabSpecJJ.setContent(R.id.tabJJ);
        tabHost.addTab(tabSpecJJ);

        TabHost.TabSpec tabSpecMM = tabHost.newTabSpec("MM").setIndicator("맹구");
        tabSpecMM.setContent(R.id.tabMM);
        tabHost.addTab(tabSpecMM);

        TabHost.TabSpec tabSpecHH = tabHost.newTabSpec("HH").setIndicator("흰둥이");
        tabSpecHH.setContent(R.id.tabHH);
        tabHost.addTab(tabSpecHH);

        TabHost.TabSpec tabSpecJJ_A = tabHost.newTabSpec("JJ_A").setIndicator("짱아");
        tabSpecJJ_A.setContent(R.id.tabJJ_A);
        tabHost.addTab(tabSpecJJ_A);
    }
}