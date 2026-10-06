package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "recuentoinven_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class recuentoinven_wcgetfilterdata_RESTInterfaceIN
{
   String AV24DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV24DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV24DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV24DDOName = "" ;
      }
      else
      {
         AV24DDOName= Value;
      }
   }


   String AV22SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV22SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV22SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV22SearchTxt = "" ;
      }
      else
      {
         AV22SearchTxt= Value;
      }
   }


   String AV23SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV23SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV23SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV23SearchTxtTo = "" ;
      }
      else
      {
         AV23SearchTxtTo= Value;
      }
   }


}

