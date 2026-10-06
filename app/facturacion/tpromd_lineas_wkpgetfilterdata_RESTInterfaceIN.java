package app.facturacion ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "facturacion.tpromd_lineas_wkpgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tpromd_lineas_wkpgetfilterdata_RESTInterfaceIN
{
   String AV41DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV41DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV41DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV41DDOName = "" ;
      }
      else
      {
         AV41DDOName= Value;
      }
   }


   String AV42SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV42SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV42SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV42SearchTxt = "" ;
      }
      else
      {
         AV42SearchTxt= Value;
      }
   }


   String AV43SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV43SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV43SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV43SearchTxtTo = "" ;
      }
      else
      {
         AV43SearchTxtTo= Value;
      }
   }


}

