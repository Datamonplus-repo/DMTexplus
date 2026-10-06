package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "listadodehdrs_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class listadodehdrs_wcgetfilterdata_RESTInterfaceIN
{
   String AV48DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV48DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV48DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV48DDOName = "" ;
      }
      else
      {
         AV48DDOName= Value;
      }
   }


   String AV46SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV46SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV46SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV46SearchTxt = "" ;
      }
      else
      {
         AV46SearchTxt= Value;
      }
   }


   String AV47SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV47SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV47SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV47SearchTxtTo = "" ;
      }
      else
      {
         AV47SearchTxtTo= Value;
      }
   }


}

