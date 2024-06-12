package org.course.management.entity;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "cm_enroll")public class Enroll {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "enroll_id")    public int enrollId;    @Column(name = "is_access")    public int isAccess;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "course_id")    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})    private Course course;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "user_id")    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})    private User user;}