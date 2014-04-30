package org.openntf.maven;

import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "UpdateSite")
public class UpdateSite {

	public UpdateSite() {
		// TODO Auto-generated constructor stub
	}

	public String getPath() {
		return m_Path;
	}

	public void setPath(String path) {
		m_Path = path;
	}

	public String getVersion() {
		return m_Version;
	}

	public void setVersion(String version) {
		m_Version = version;
	}

	public String getFeatureID() {
		return m_FeatureID;
	}

	public void setFeatureID(String featureID) {
		m_FeatureID = featureID;
	}

	@Parameter(property = "ddehd.path")
	private String m_Path;
	@Parameter(property = "ddehd.featureID")
	private String m_FeatureID;
	@Parameter(property = "ddehd.version")
	private String m_Version;

}
