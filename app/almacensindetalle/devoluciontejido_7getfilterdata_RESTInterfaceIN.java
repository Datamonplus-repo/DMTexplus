package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "almacensindetalle.devoluciontejido_7getfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class devoluciontejido_7getfilterdata_RESTInterfaceIN
{
   String AV67DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV67DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV67DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV67DDOName = "" ;
      }
      else
      {
         AV67DDOName= Value;
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

