/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import elasticsearch.Searchable;
import mongo.MongoEntity;
import org.bson.types.ObjectId;

/**
 *
 * @author judu
 */
public class TestSearchJob extends MongoEntity implements Searchable {

   public String getPrintTitle() {
      return "title";
   }

   public String getPrintDesc() {
      return "desc";
   }

   public String getPrintURL() {
      return "url";
   }

   public float getScore() {
      return 0;
   }

   public void setScore(float score) {
   }

   public ObjectId getId() {
      return this.id;
   }

}
