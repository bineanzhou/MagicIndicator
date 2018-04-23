package net.lucode.hackware.tabindicator.abs;

/**
 * 抽象的ViewPager导航器
 * 博客: http://hackware.lucode.net
 * Created by hackware on 2016/6/26.
 */
public interface IPagerNavigator {

    ///////////////////////// ViewPager的3个回调
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);
    /////////////////////////

    /**
     * 当IPagerNavigator被添加到Tabindicator时调用
     */
    void onAttachToTabindicator();

    /**
     * 当IPagerNavigator从Tabindicator上移除时调用
     */
    void onDetachFromTabindicator();

    /**
     * ViewPager内容改变时需要先调用此方法，自定义的IPagerNavigator应当遵守此约定
     */
    void notifyDataSetChanged();
}
