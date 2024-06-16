package org.course.management.entity;import com.fasterxml.jackson.annotation.JsonBackReference;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import com.fasterxml.jackson.annotation.JsonManagedReference;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;import java.sql.Date;import java.util.List;@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "cm_course")public class Course {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "course_id")    private int courseId;    @Column(name = "course_name", columnDefinition = "nvarchar(512)")    private String courseName;    @Column(name = "creation_date")    private Date creationDate;    @Column(name = "course_image")    private String courseImage;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "topic_id")    @JsonBackReference    private Topic topic;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "instructor_id")    @JsonBackReference    private User user;    @OneToMany(mappedBy = "course")    @JsonManagedReference    private List<Lesson> lessons;    @OneToMany(mappedBy = "course")    @JsonManagedReference    private List<Enroll> enrolls;    @OneToMany(mappedBy = "course")    @JsonManagedReference    private List<Rate> rates;}