package app.produccion ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "produccion.consultadeproduccion_sdt_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class consultadeproduccion_sdt_wcgetfilterdata_RESTInterfaceIN
{
   String AV27DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV27DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV27DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV27DDOName = "" ;
      }
      else
      {
         AV27DDOName= Value;
      }
   }


   String AV28SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV28SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV28SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV28SearchTxt = "" ;
      }
      else
      {
         AV28SearchTxt= Value;
      }
   }


   String AV29SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV29SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV29SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV29SearchTxtTo = "" ;
      }
      else
      {
         AV29SearchTxtTo= Value;
      }
   }


}

