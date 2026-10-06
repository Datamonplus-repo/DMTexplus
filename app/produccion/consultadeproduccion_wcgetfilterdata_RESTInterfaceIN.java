package app.produccion ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "produccion.consultadeproduccion_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class consultadeproduccion_wcgetfilterdata_RESTInterfaceIN
{
   String AV442DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV442DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV442DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV442DDOName = "" ;
      }
      else
      {
         AV442DDOName= Value;
      }
   }


   String AV440SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV440SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV440SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV440SearchTxt = "" ;
      }
      else
      {
         AV440SearchTxt= Value;
      }
   }


   String AV441SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV441SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV441SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV441SearchTxtTo = "" ;
      }
      else
      {
         AV441SearchTxtTo= Value;
      }
   }


}

