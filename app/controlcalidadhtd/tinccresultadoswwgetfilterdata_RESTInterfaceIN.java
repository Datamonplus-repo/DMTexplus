package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "controlcalidadhtd.tinccresultadoswwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tinccresultadoswwgetfilterdata_RESTInterfaceIN
{
   String AV72DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV72DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV72DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV72DDOName = "" ;
      }
      else
      {
         AV72DDOName= Value;
      }
   }


   String AV73SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV73SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV73SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV73SearchTxt = "" ;
      }
      else
      {
         AV73SearchTxt= Value;
      }
   }


   String AV74SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV74SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV74SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV74SearchTxtTo = "" ;
      }
      else
      {
         AV74SearchTxtTo= Value;
      }
   }


}

