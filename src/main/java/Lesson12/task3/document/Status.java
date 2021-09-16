package Lesson12.task3.document;

import java.util.Objects;

public class Status {
    private String base;
    private String name;
    private Object extended;
    private Object extendedName;
    private Object comment;

    public Status(String base, String name, Object extended, Object extendedName, Object comment) {
        this.base = base;
        this.name = name;
        this.extended = extended;
        this.extendedName = extendedName;
        this.comment = comment;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtended(Object extended) {
        this.extended = extended;
    }

    public void setExtendedName(Object extendedName) {
        this.extendedName = extendedName;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public String getBase() {
        return base;
    }

    public String getName() {
        return name;
    }

    public Object getExtended() {
        return extended;
    }

    public Object getExtendedName() {
        return extendedName;
    }

    public Object getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(base, status.base) &&
                Objects.equals(name, status.name) &&
                Objects.equals(extended, status.extended) &&
                Objects.equals(extendedName, status.extendedName) &&
                Objects.equals(comment, status.comment);
    }

    @Override
    public int hashCode() {
        int result = base != null ? base.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (extended != null ? extended.hashCode() : 0);
        result = 31 * result + (extendedName != null ? extendedName.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}