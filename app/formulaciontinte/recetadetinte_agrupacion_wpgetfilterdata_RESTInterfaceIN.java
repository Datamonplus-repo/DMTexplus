package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class recetadetinte_agrupacion_wpgetfilterdata_RESTInterfaceIN
{
   String AV68DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV68DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV68DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV68DDOName = "" ;
      }
      else
      {
         AV68DDOName= Value;
      }
   }


   String AV66SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV66SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV66SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV66SearchTxt = "" ;
      }
      else
      {
         AV66SearchTxt= Value;
      }
   }


   String AV67SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV67SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV67SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV67SearchTxtTo = "" ;
      }
      else
      {
         AV67SearchTxtTo= Value;
      }
   }


}

