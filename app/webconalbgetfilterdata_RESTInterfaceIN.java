package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "webconalbgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class webconalbgetfilterdata_RESTInterfaceIN
{
   String AV70DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV70DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV70DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV70DDOName = "" ;
      }
      else
      {
         AV70DDOName= Value;
      }
   }


   String AV68SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV68SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV68SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV68SearchTxt = "" ;
      }
      else
      {
         AV68SearchTxt= Value;
      }
   }


   String AV69SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV69SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV69SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV69SearchTxtTo = "" ;
      }
      else
      {
         AV69SearchTxtTo= Value;
      }
   }


}

