package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "testcatwwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class testcatwwgetfilterdata_RESTInterfaceIN
{
   String AV42DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV42DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV42DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV42DDOName = "" ;
      }
      else
      {
         AV42DDOName= Value;
      }
   }


   String AV43SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV43SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV43SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV43SearchTxt = "" ;
      }
      else
      {
         AV43SearchTxt= Value;
      }
   }


   String AV44SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV44SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV44SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV44SearchTxtTo = "" ;
      }
      else
      {
         AV44SearchTxtTo= Value;
      }
   }


}

