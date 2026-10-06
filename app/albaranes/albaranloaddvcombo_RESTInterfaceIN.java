package app.albaranes ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "albaranes.albaranloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class albaranloaddvcombo_RESTInterfaceIN
{
   String AV12ComboName;
   @JsonProperty("ComboName")
   public String getComboName( )
   {
      if ( GXutil.strcmp(AV12ComboName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV12ComboName ;
      }
   }

   @JsonProperty("ComboName")
   public void setComboName(  String Value )
   {
      if ( Value == null )
      {
         AV12ComboName = "" ;
      }
      else
      {
         AV12ComboName= Value;
      }
   }


   String AV13TrnMode;
   @JsonProperty("TrnMode")
   public String getTrnMode( )
   {
      if ( GXutil.strcmp(AV13TrnMode, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV13TrnMode ;
      }
   }

   @JsonProperty("TrnMode")
   public void setTrnMode(  String Value )
   {
      if ( Value == null )
      {
         AV13TrnMode = "" ;
      }
      else
      {
         AV13TrnMode= Value;
      }
   }


   boolean AV21IsDynamicCall;
   @JsonProperty("IsDynamicCall")
   public boolean getIsDynamicCall( )
   {
      return AV21IsDynamicCall ;
   }

   @JsonProperty("IsDynamicCall")
   public void setIsDynamicCall(  boolean Value )
   {
      AV21IsDynamicCall= Value;
   }


   String AV14EmprCod;
   @JsonProperty("EmprCod")
   public String getEmprCod( )
   {
      if ( GXutil.strcmp(AV14EmprCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV14EmprCod ;
      }
   }

   @JsonProperty("EmprCod")
   public void setEmprCod(  String Value )
   {
      if ( Value == null )
      {
         AV14EmprCod = "" ;
      }
      else
      {
         AV14EmprCod= Value;
      }
   }


   String AV15AlbProCod;
   @JsonProperty("AlbProCod")
   public String getAlbProCod( )
   {
      return AV15AlbProCod ;
   }

   @JsonProperty("AlbProCod")
   public void setAlbProCod(  String Value )
   {
      AV15AlbProCod= Value;
   }


   String AV26Cond_EmprCod;
   @JsonProperty("Cond_EmprCod")
   public String getCond_EmprCod( )
   {
      if ( GXutil.strcmp(AV26Cond_EmprCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV26Cond_EmprCod ;
      }
   }

   @JsonProperty("Cond_EmprCod")
   public void setCond_EmprCod(  String Value )
   {
      if ( Value == null )
      {
         AV26Cond_EmprCod = "" ;
      }
      else
      {
         AV26Cond_EmprCod= Value;
      }
   }


   int AV25Cond_GuiRemCli;
   @JsonProperty("Cond_GuiRemCli")
   public int getCond_GuiRemCli( )
   {
      return AV25Cond_GuiRemCli ;
   }

   @JsonProperty("Cond_GuiRemCli")
   public void setCond_GuiRemCli(  int Value )
   {
      AV25Cond_GuiRemCli= Value;
   }


   String AV20SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV20SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV20SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV20SearchTxt = "" ;
      }
      else
      {
         AV20SearchTxt= Value;
      }
   }


}

