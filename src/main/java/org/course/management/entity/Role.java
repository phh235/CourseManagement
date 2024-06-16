package org.course.management.entity;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;import java.util.List;@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "cm_role")public class Role {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "role_id")    private int roleId;    @Column(name = "role_name")    private String roleName;    @Column(name = "role_desc")    private String roleDescription;    @OneToMany(mappedBy = "role")    private List<User> user;}