package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class recetadeacabado_cierre_wcgetfilterdata_RESTInterfaceIN
{
   String AV130DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV130DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV130DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV130DDOName = "" ;
      }
      else
      {
         AV130DDOName= Value;
      }
   }


   String AV128SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV128SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV128SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV128SearchTxt = "" ;
      }
      else
      {
         AV128SearchTxt= Value;
      }
   }


   String AV129SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV129SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV129SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV129SearchTxtTo = "" ;
      }
      else
      {
         AV129SearchTxtTo= Value;
      }
   }


}

