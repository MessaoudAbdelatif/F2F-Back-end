package com.dzdevsoft.f2f.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Deal implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "influencer_id")
  private Influencer influencer;

  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;

  @NotNull
  private String title;

  @Column(columnDefinition = "TEXT")
  private String offer;

  private Boolean state;

  private Boolean isActive;

  private Double price;

  @CreationTimestamp
  @Column(updatable = false)
  private Timestamp createdDate;

  @OneToOne
  private Product product;
}
