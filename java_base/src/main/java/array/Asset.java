package array;

public class Asset {

	private String assetNumber;
	private String assetDescription;
	private String assetFrom;
	private String assetTo;
	private String remark;
	public String getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}
	public String getAssetDescription() {
		return assetDescription;
	}
	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}
	public String getAssetFrom() {
		return assetFrom;
	}
	public void setAssetFrom(String assetFrom) {
		this.assetFrom = assetFrom;
	}
	public String getAssetTo() {
		return assetTo;
	}
	public void setAssetTo(String assetTo) {
		this.assetTo = assetTo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "[assetNumber=" + assetNumber + ", assetDescription=" + assetDescription + ", assetFrom="
				+ assetFrom + ", assetTo=" + assetTo + ", remark=" + remark + "]";
	}
	
	
}
