package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "cargasporseccion_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class cargasporseccion_wcgetfilterdata_RESTInterfaceIN
{
   String AV84DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV84DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV84DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV84DDOName = "" ;
      }
      else
      {
         AV84DDOName= Value;
      }
   }


   String AV82SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV82SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV82SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV82SearchTxt = "" ;
      }
      else
      {
         AV82SearchTxt= Value;
      }
   }


   String AV83SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV83SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV83SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV83SearchTxtTo = "" ;
      }
      else
      {
         AV83SearchTxtTo= Value;
      }
   }


}

