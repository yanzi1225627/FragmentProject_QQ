package org.yanzi.bean;

public class MessageBean {
	private int PhotoDrawableId;
	private String MessageName;
	private String MessageContent;
	private String MessageTime;
	
	public MessageBean(){
		
	}
	
	public MessageBean(int photoDrawableId, String messageName,
			String messageContent, String messageTime) {
		super();
		PhotoDrawableId = photoDrawableId;
		MessageName = messageName;
		MessageContent = messageContent;
		MessageTime = messageTime;
	}

	public int getPhotoDrawableId() {
		return PhotoDrawableId;
	}
	public void setPhotoDrawableId(int mPhotoDrawableId) {
		this.PhotoDrawableId = mPhotoDrawableId;
	}
	public String getMessageName() {
		return MessageName;
	}
	public void setMessageName(String messageName) {
		MessageName = messageName;
	}
	public String getMessageContent() {
		return MessageContent;
	}
	public void setMessageContent(String messageContent) {
		MessageContent = messageContent;
	}
	public String getMessageTime() {
		return MessageTime;
	}
	public void setMessageTime(String messageTime) {
		MessageTime = messageTime;
	}
	@Override
	public String toString() {
		return "MessageBean [mPhotoDrawableId=" + PhotoDrawableId
				+ ", MessageName=" + MessageName + ", MessageContent="
				+ MessageContent + ", MessageTime=" + MessageTime + "]";
	}
	
	
	
}
