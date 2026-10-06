package app.albaranes ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "albaranes.albaranguia_promptloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class albaranguia_promptloaddvcombo_RESTInterfaceIN
{
   String AV14ComboName;
   @JsonProperty("ComboName")
   public String getComboName( )
   {
      if ( GXutil.strcmp(AV14ComboName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV14ComboName ;
      }
   }

   @JsonProperty("ComboName")
   public void setComboName(  String Value )
   {
      if ( Value == null )
      {
         AV14ComboName = "" ;
      }
      else
      {
         AV14ComboName= Value;
      }
   }


   String AV15TrnMode;
   @JsonProperty("TrnMode")
   public String getTrnMode( )
   {
      if ( GXutil.strcmp(AV15TrnMode, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV15TrnMode ;
      }
   }

   @JsonProperty("TrnMode")
   public void setTrnMode(  String Value )
   {
      if ( Value == null )
      {
         AV15TrnMode = "" ;
      }
      else
      {
         AV15TrnMode= Value;
      }
   }


   String AV11SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV11SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV11SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV11SearchTxt = "" ;
      }
      else
      {
         AV11SearchTxt= Value;
      }
   }


}

