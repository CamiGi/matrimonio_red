package matrimonio_red.models;


import jakarta.persistence.*;

@Entity
@Table(name = "Invitati")
public class Invitato {

    @Id
    @SequenceGenerator(name = "invitati_sequence", sequenceName = "invitati_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invitati_sequence")
    @Column(name = "Id", updatable = false)
    private Long id;

    @Column(name = "Name", nullable = false, columnDefinition = "TEXT")
    private String name;

    @Column(name = "Surename", nullable = false, columnDefinition = "TEXT")
    private String surename;
    @Column(name = "Participate", nullable = false, columnDefinition = "boolean")
    private boolean participate;

    @Column(name = "Email", nullable = false, unique = true, columnDefinition = "TEXT")
    private String email;

    @Column(name = "Children", columnDefinition = "integer")
    private int numberOfChildren;


    public Invitato(){}

    public Invitato(String name, String surename, boolean participate, String email, int numberOfChildren){
        this.email = email;
        this.name = name;
        this.surename = surename;
        this.participate = participate;
        this.numberOfChildren = numberOfChildren;
    }

    public Invitato(long id, String name, String surename, boolean participate, String email, int numberOfChildren){
        this.email = email;
        this.name = name;
        this.surename = surename;
        this.participate = participate;
        this.id = id;
        this.numberOfChildren = numberOfChildren;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public boolean isParticipate() {
        return participate;
    }

    public void setParticipate(boolean participate) {
        this.participate = participate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
}
