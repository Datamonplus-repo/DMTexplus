package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "tdevpie2wwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tdevpie2wwgetfilterdata_RESTInterfaceIN
{
   String AV40DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV40DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV40DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV40DDOName = "" ;
      }
      else
      {
         AV40DDOName= Value;
      }
   }


   String AV38SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV38SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV38SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV38SearchTxt = "" ;
      }
      else
      {
         AV38SearchTxt= Value;
      }
   }


   String AV39SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV39SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV39SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV39SearchTxtTo = "" ;
      }
      else
      {
         AV39SearchTxtTo= Value;
      }
   }


}

