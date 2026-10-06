package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "talbcomwwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class talbcomwwgetfilterdata_RESTInterfaceIN
{
   String AV52DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV52DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV52DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV52DDOName = "" ;
      }
      else
      {
         AV52DDOName= Value;
      }
   }


   String AV50SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV50SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV50SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV50SearchTxt = "" ;
      }
      else
      {
         AV50SearchTxt= Value;
      }
   }


   String AV51SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV51SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV51SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV51SearchTxtTo = "" ;
      }
      else
      {
         AV51SearchTxtTo= Value;
      }
   }


}

