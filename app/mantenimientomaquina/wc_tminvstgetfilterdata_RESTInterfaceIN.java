package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "mantenimientomaquina.wc_tminvstgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wc_tminvstgetfilterdata_RESTInterfaceIN
{
   String AV28DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV28DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV28DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV28DDOName = "" ;
      }
      else
      {
         AV28DDOName= Value;
      }
   }


   String AV26SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV26SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV26SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV26SearchTxt = "" ;
      }
      else
      {
         AV26SearchTxt= Value;
      }
   }


   String AV27SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV27SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV27SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV27SearchTxtTo = "" ;
      }
      else
      {
         AV27SearchTxtTo= Value;
      }
   }


}

