package org.course.management.entity;import com.fasterxml.jackson.annotation.JsonBackReference;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;import java.sql.Date;import java.time.LocalDateTime;@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "cm_rate")public class Rate {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "rate_id")    public int rateId;    @Column(name = "number_star")    public Double numberStar;    @Column(name = "comment", columnDefinition = "nvarchar(512)")    public String comment;    @Column(name = "date_comment")    public LocalDateTime dateComment;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "user_id")    @JsonBackReference    private User user;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "course_id")    @JsonBackReference    private Course course;    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})    @JoinColumn(name = "enroll_id")    @JsonBackReference    private Enroll enroll;}