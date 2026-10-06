package app.core ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "core.tescandloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tescandloaddvcombo_RESTInterfaceIN
{
   String AV16ComboName;
   @JsonProperty("ComboName")
   public String getComboName( )
   {
      if ( GXutil.strcmp(AV16ComboName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV16ComboName ;
      }
   }

   @JsonProperty("ComboName")
   public void setComboName(  String Value )
   {
      if ( Value == null )
      {
         AV16ComboName = "" ;
      }
      else
      {
         AV16ComboName= Value;
      }
   }


   String AV18TrnMode;
   @JsonProperty("TrnMode")
   public String getTrnMode( )
   {
      if ( GXutil.strcmp(AV18TrnMode, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV18TrnMode ;
      }
   }

   @JsonProperty("TrnMode")
   public void setTrnMode(  String Value )
   {
      if ( Value == null )
      {
         AV18TrnMode = "" ;
      }
      else
      {
         AV18TrnMode= Value;
      }
   }


   boolean AV20IsDynamicCall;
   @JsonProperty("IsDynamicCall")
   public boolean getIsDynamicCall( )
   {
      return AV20IsDynamicCall ;
   }

   @JsonProperty("IsDynamicCall")
   public void setIsDynamicCall(  boolean Value )
   {
      AV20IsDynamicCall= Value;
   }


   String AV23EmprCod;
   @JsonProperty("EmprCod")
   public String getEmprCod( )
   {
      if ( GXutil.strcmp(AV23EmprCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV23EmprCod ;
      }
   }

   @JsonProperty("EmprCod")
   public void setEmprCod(  String Value )
   {
      if ( Value == null )
      {
         AV23EmprCod = "" ;
      }
      else
      {
         AV23EmprCod= Value;
      }
   }


   String AV24Workstat;
   @JsonProperty("Workstat")
   public String getWorkstat( )
   {
      if ( GXutil.strcmp(AV24Workstat, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV24Workstat ;
      }
   }

   @JsonProperty("Workstat")
   public void setWorkstat(  String Value )
   {
      if ( Value == null )
      {
         AV24Workstat = "" ;
      }
      else
      {
         AV24Workstat= Value;
      }
   }


   String AV28Cond_EmprCod;
   @JsonProperty("Cond_EmprCod")
   public String getCond_EmprCod( )
   {
      if ( GXutil.strcmp(AV28Cond_EmprCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV28Cond_EmprCod ;
      }
   }

   @JsonProperty("Cond_EmprCod")
   public void setCond_EmprCod(  String Value )
   {
      if ( Value == null )
      {
         AV28Cond_EmprCod = "" ;
      }
      else
      {
         AV28Cond_EmprCod= Value;
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

