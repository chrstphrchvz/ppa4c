package topicBrowser;

public class Topic {
	public Topic(String topicNodeString, String topicClassString) {
		setTopicNodeString(topicNodeString);
		setTopicClassString(topicClassString);
	}

	private String topicNodeString;
	private String topicClassString;

	public void setTopicClassString(String topicClassString) {
		this.topicClassString = topicClassString;
	}

	public void setTopicNodeString(String topicNodeString) {
		this.topicNodeString = topicNodeString;
	}

	public String getTopicClassString() {
		return topicClassString;
	}

	public String getTopicNodeString() {
		return topicNodeString;
	}

	public String toString() {
		return getTopicNodeString();
	}

}
