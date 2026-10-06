package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class consultasituacioncoleccion_wcgetfilterdata_RESTInterfaceIN
{
   String AV180DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV180DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV180DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV180DDOName = "" ;
      }
      else
      {
         AV180DDOName= Value;
      }
   }


   String AV178SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV178SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV178SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV178SearchTxt = "" ;
      }
      else
      {
         AV178SearchTxt= Value;
      }
   }


   String AV179SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV179SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV179SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV179SearchTxtTo = "" ;
      }
      else
      {
         AV179SearchTxtTo= Value;
      }
   }


}

