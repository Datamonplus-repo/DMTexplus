package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "mantenimientomaquina.wcmordenesgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wcmordenesgetfilterdata_RESTInterfaceIN
{
   String AV56DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV56DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV56DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV56DDOName = "" ;
      }
      else
      {
         AV56DDOName= Value;
      }
   }


   String AV54SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV54SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV54SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV54SearchTxt = "" ;
      }
      else
      {
         AV54SearchTxt= Value;
      }
   }


   String AV55SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV55SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV55SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV55SearchTxtTo = "" ;
      }
      else
      {
         AV55SearchTxtTo= Value;
      }
   }


}

