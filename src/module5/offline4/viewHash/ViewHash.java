package module5.offline4.viewHash;

import module5.offline4.View;

import java.util.Arrays;

public class ViewHash {

    private int currentIndex = 0;
    private View[] views = new View[10];

    public void addView(View view) {
//        if (views != null) {
//            final int length = views.length;
//            View[] tempViews = views;
//            views = new View[length + 1];
//            for (int i = 0; i < tempViews.length; i++) {
//                views[i] = tempViews[i];
//            }
//        }
        views[currentIndex] = view;
        currentIndex++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewHash viewHash = (ViewHash) o;

        if (currentIndex != viewHash.currentIndex) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(views, viewHash.views);

    }

    @Override
    public int hashCode() {
        int result = currentIndex;
        result = 31 * result + Arrays.hashCode(views);
        return result;
    }
}
