package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "pedidosclientesindetalle.hojaderuta__fases_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class hojaderuta__fases_wcgetfilterdata_RESTInterfaceIN
{
   String AV52DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV52DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV52DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV52DDOName = "" ;
      }
      else
      {
         AV52DDOName= Value;
      }
   }


   String AV53SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV53SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV53SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV53SearchTxt = "" ;
      }
      else
      {
         AV53SearchTxt= Value;
      }
   }


   String AV54SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV54SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV54SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV54SearchTxtTo = "" ;
      }
      else
      {
         AV54SearchTxtTo= Value;
      }
   }


}

