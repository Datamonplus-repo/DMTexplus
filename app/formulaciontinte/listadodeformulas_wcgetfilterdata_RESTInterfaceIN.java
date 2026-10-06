package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "formulaciontinte.listadodeformulas_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class listadodeformulas_wcgetfilterdata_RESTInterfaceIN
{
   String AV136DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV136DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV136DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV136DDOName = "" ;
      }
      else
      {
         AV136DDOName= Value;
      }
   }


   String AV134SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV134SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV134SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV134SearchTxt = "" ;
      }
      else
      {
         AV134SearchTxt= Value;
      }
   }


   String AV135SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV135SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV135SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV135SearchTxtTo = "" ;
      }
      else
      {
         AV135SearchTxtTo= Value;
      }
   }


}

