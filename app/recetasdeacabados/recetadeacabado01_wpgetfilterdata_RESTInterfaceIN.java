package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "recetasdeacabados.recetadeacabado01_wpgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class recetadeacabado01_wpgetfilterdata_RESTInterfaceIN
{
   String AV94DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV94DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV94DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV94DDOName = "" ;
      }
      else
      {
         AV94DDOName= Value;
      }
   }


   String AV95SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV95SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV95SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV95SearchTxt = "" ;
      }
      else
      {
         AV95SearchTxt= Value;
      }
   }


   String AV96SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV96SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV96SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV96SearchTxtTo = "" ;
      }
      else
      {
         AV96SearchTxtTo= Value;
      }
   }


}

