package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "nwdpfasesloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class nwdpfasesloaddvcombo_RESTInterfaceIN
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


   String AV24DisCod;
   @JsonProperty("DisCod")
   public String getDisCod( )
   {
      return AV24DisCod ;
   }

   @JsonProperty("DisCod")
   public void setDisCod(  String Value )
   {
      AV24DisCod= Value;
   }


   String AV25ProCod;
   @JsonProperty("ProCod")
   public String getProCod( )
   {
      if ( GXutil.strcmp(AV25ProCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV25ProCod ;
      }
   }

   @JsonProperty("ProCod")
   public void setProCod(  String Value )
   {
      if ( Value == null )
      {
         AV25ProCod = "" ;
      }
      else
      {
         AV25ProCod= Value;
      }
   }


   String AV29Cond_EmprCod;
   @JsonProperty("Cond_EmprCod")
   public String getCond_EmprCod( )
   {
      if ( GXutil.strcmp(AV29Cond_EmprCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV29Cond_EmprCod ;
      }
   }

   @JsonProperty("Cond_EmprCod")
   public void setCond_EmprCod(  String Value )
   {
      if ( Value == null )
      {
         AV29Cond_EmprCod = "" ;
      }
      else
      {
         AV29Cond_EmprCod= Value;
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

