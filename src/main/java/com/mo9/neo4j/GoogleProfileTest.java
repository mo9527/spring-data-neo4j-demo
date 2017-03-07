package com.mo9.neo4j;

import com.mo9.neo4j.config.Neo4jConfig;
import com.mo9.neo4j.service.GoogleProfileService;
import com.mo9.neo4j.domain.GoogleProfile;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

/**
 * @Author wtwei
 * @Date 2017/3/1
 * @Time 14:36
 */
public class GoogleProfileTest {
    public static void main(String[] args) throws Exception {



//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);

       /* GoogleProfileService service = null;
        try {
            service = context.getBean(GoogleProfileService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        // Please uncomment one of the operation section
        // and comment remaining section to test only one operation at a time
        // Here I've uncommented CREATE operation and
        // commented other operations: FIND ONE, FIND ALL, DELETE
        // CREATE Operation
        GoogleProfile profile = createPofile();
//        createProfile(service,profile);


        // FIND ONE
      /*
      GoogleProfile profile = getOneProfileById(service,67515L);
      System.out.println(profile);
      */

        // FIND ALL
//      getAllProfiles(service);

        // DELETE
      /*
      GoogleProfile profile = createPofile();
      deleteProfile(service,profile);
      System.out.println("GoogleProfile deleted successfully.");
      */
        System.out.println("GoogleProfile created successfully.");
    }

    private static GoogleProfile createProfile(GoogleProfileService service, GoogleProfile profile){
        return service.create(profile);
    }

    private static void deleteProfile(GoogleProfileService service,GoogleProfile profile){
        service.delete(profile);
    }

    private static GoogleProfile getOneProfileById(GoogleProfileService service,Long id){
        return service.findById(id);
    }

    private static void getAllProfiles(GoogleProfileService service){
        Iterable<GoogleProfile> result = service.findAll();
        Iterator<GoogleProfile> iterator = result.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getAddress());
        }
    }

    private static GoogleProfile createPofile(){
        GoogleProfile profile = new GoogleProfile();
        profile.setName("wtwei");
        profile.setAddress("Hyderabad");
        profile.setSex("Male");
        profile.setDob("02/02/1980");
        return profile;
    }
}
