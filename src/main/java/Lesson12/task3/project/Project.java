package Lesson12.task3.project;

import java.util.List;
import java.util.Objects;

public class Project {
    private Integer id;
    private String startDate;
    private String endDate;
    private String name;
    private List<Integer> childIds;
    private List<Permission> permissions;
    private Project parentProject;

    public Integer getId() {
        return id;
    }

    public Project setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public Project setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public Project setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public Project setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
        return this;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public Project setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public Project getParentProject() {
        return parentProject;
    }

    public Project setParentProject(Project parentProject) {
        this.parentProject = parentProject;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) &&
                Objects.equals(startDate, project.startDate) &&
                Objects.equals(endDate, project.endDate) &&
                Objects.equals(name, project.name) &&
                Objects.equals(childIds, project.childIds) &&
                Objects.equals(permissions, project.permissions) &&
                Objects.equals(parentProject, project.parentProject);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (childIds != null ? childIds.hashCode() : 0);
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        result = 31 * result + (parentProject != null ? parentProject.hashCode() : 0);
        return result;
    }
}