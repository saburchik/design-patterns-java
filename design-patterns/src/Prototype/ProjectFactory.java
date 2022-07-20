package Prototype;

public class ProjectFactory {
	Project project;
	
	public ProjectFactory(Project project) {
		this.project = project;
	}
	public void setProject(Project projecct) {
		this.project = project;
	}
	Project cloneProject() {
		return (Project) project.copy();
	}
}
