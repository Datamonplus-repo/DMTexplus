package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "almacensindetalle.devoluciontejido_1wwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class devoluciontejido_1wwgetfilterdata_RESTInterfaceIN
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


   String AV69SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV69SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV69SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV69SearchTxt = "" ;
      }
      else
      {
         AV69SearchTxt= Value;
      }
   }


   String AV70SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV70SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV70SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV70SearchTxtTo = "" ;
      }
      else
      {
         AV70SearchTxtTo= Value;
      }
   }


}

