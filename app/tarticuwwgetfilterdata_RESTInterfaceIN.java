package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "tarticuwwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tarticuwwgetfilterdata_RESTInterfaceIN
{
   String AV58DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV58DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV58DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV58DDOName = "" ;
      }
      else
      {
         AV58DDOName= Value;
      }
   }


   String AV56SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV56SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV56SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV56SearchTxt = "" ;
      }
      else
      {
         AV56SearchTxt= Value;
      }
   }


   String AV57SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV57SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV57SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV57SearchTxtTo = "" ;
      }
      else
      {
         AV57SearchTxtTo= Value;
      }
   }


}

