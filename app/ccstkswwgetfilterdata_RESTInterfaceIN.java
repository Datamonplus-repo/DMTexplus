package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "ccstkswwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class ccstkswwgetfilterdata_RESTInterfaceIN
{
   String AV62DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV62DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV62DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV62DDOName = "" ;
      }
      else
      {
         AV62DDOName= Value;
      }
   }


   String AV60SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV60SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV60SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV60SearchTxt = "" ;
      }
      else
      {
         AV60SearchTxt= Value;
      }
   }


   String AV61SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV61SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV61SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV61SearchTxtTo = "" ;
      }
      else
      {
         AV61SearchTxtTo= Value;
      }
   }


}

