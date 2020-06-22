package ir.parto.libmng.module.users.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "libmng_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_code", unique = true)
    private String identificationCode;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "telephone_number")
    private String telephoneNumber;

    @Column(name = "lib_no", updatable = false, unique = true)
    private Long libNumber;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public Users() {
    }

    public Users(String firstName, String lastName, String identificationCode, String phoneNumber, String telephoneNumber, Long libNumber, Group group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationCode = identificationCode;
        this.phoneNumber = phoneNumber;
        this.telephoneNumber = telephoneNumber;
        this.libNumber = libNumber;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public Users setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Users setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Users setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public Users setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Users setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Users setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public Long getLibNumber() {
        return libNumber;
    }

    public Users setLibNumber(Long libNumber) {
        this.libNumber = libNumber;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public Users setGroup(Group group) {
        this.group = group;
        return this;
    }
}
