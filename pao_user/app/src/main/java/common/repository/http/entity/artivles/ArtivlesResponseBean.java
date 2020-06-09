package common.repository.http.entity.artivles;

import java.util.List;

import common.repository.http.entity.home.MenuItemBean;
import common.repository.http.param.BaseResponseBean;

/**
 * Created by hpzhan on 2020/2/18.
 */

public class ArtivlesResponseBean extends BaseResponseBean {
    private PageInfoArticleBean pageInfoArticle;
    private List<MenuItemBean> classification;

    public PageInfoArticleBean getPageInfoArticle() {
        return pageInfoArticle;
    }

    public void setPageInfoArticle(PageInfoArticleBean pageInfoArticle) {
        this.pageInfoArticle = pageInfoArticle;
    }

    public List<MenuItemBean> getClassification() {
        return classification;
    }

    public void setClassification(List<MenuItemBean> classification) {
        this.classification = classification;
    }
}
