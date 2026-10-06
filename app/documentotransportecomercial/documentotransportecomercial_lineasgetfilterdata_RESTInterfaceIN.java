package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class documentotransportecomercial_lineasgetfilterdata_RESTInterfaceIN
{
   String AV61DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV61DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV61DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV61DDOName = "" ;
      }
      else
      {
         AV61DDOName= Value;
      }
   }


   String AV62SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV62SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV62SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV62SearchTxt = "" ;
      }
      else
      {
         AV62SearchTxt= Value;
      }
   }


   String AV63SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV63SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV63SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV63SearchTxtTo = "" ;
      }
      else
      {
         AV63SearchTxtTo= Value;
      }
   }


}

