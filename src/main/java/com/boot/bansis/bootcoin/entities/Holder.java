package com.boot.bansis.bootcoin.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Holder {

    @Field("id")
    private String id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;
    
    @Field("id_type")
    private IdType idType;
    
    @Field("id_number")
    private String idNumber;
    
    @Field("mobile_number")
    private String mobileNumber;
    
    @Field("email")
    private String email;

    @Field("created_at")
    @CreatedDate
    private Date createdAt;

    @Field("updated_at")
    @LastModifiedDate
    private Date updatedAt;

}
