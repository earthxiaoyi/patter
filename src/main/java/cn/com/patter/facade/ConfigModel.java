package cn.com.patter.facade;

public class ConfigModel {
	//生成视图层
	private boolean needGenPresentation=true;
	//生成业务逻辑层
	private boolean needGenBusiness = true;
	//是否需要生成dao
	private boolean needGenDao=true;
	public boolean isNeedGenPresentation() {
		return needGenPresentation;
	}
	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}
	public boolean isNeedGenBusiness() {
		return needGenBusiness;
	}
	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}
	public boolean isNeedGenDao() {
		return needGenDao;
	}
	public void setNeedGenDao(boolean needGenDao) {
		this.needGenDao = needGenDao;
	}
}
