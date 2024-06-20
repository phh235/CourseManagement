package org.course.management.entity;import com.fasterxml.jackson.annotation.JsonBackReference;import com.fasterxml.jackson.annotation.JsonIgnore;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import jakarta.persistence.*;import lombok.AllArgsConstructor;import lombok.Getter;import lombok.NoArgsConstructor;import lombok.Setter;import java.util.List;@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Entity@Table(name = "cm_topic")public class Topic {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "topic_id")    private int topicId;    @Column(name = "topic_name", columnDefinition = "nvarchar(512)")    private String topicName;    @Column(name = "topic_image")    private String topicImage;    @Column(name = "description", columnDefinition = "nvarchar(512)")    private String description;     @OneToMany(mappedBy = "topic")     @JsonIgnore    private List<Course> courses;}