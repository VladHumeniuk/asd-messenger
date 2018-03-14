package lnu.asd.messanger.domain;

import javax.persistence.*;

@Embeddable
public class ParticipatesID {
    @ManyToOne
    @JoinColumn(name="enduser_id", referencedColumnName = "enduser_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="group_id" , referencedColumnName = "group_id", nullable = false)
    private Group group;

    public ParticipatesID() {
    }

    public ParticipatesID(User user, Group group) {
        this.user = user;
        this.group = group;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
