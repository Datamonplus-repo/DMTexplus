package app.albaranes ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "albaranes.albaranguiafaseloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class albaranguiafaseloaddvcombo_RESTInterfaceIN
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


   boolean AV25IsDynamicCall;
   @JsonProperty("IsDynamicCall")
   public boolean getIsDynamicCall( )
   {
      return AV25IsDynamicCall ;
   }

   @JsonProperty("IsDynamicCall")
   public void setIsDynamicCall(  boolean Value )
   {
      AV25IsDynamicCall= Value;
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


   String AV16BarCod;
   @JsonProperty("BarCod")
   public String getBarCod( )
   {
      return AV16BarCod ;
   }

   @JsonProperty("BarCod")
   public void setBarCod(  String Value )
   {
      AV16BarCod= Value;
   }


   byte AV17BarCodReo;
   @JsonProperty("BarCodReo")
   public byte getBarCodReo( )
   {
      return AV17BarCodReo ;
   }

   @JsonProperty("BarCodReo")
   public void setBarCodReo(  byte Value )
   {
      AV17BarCodReo= Value;
   }


   String AV18BarCodPar;
   @JsonProperty("BarCodPar")
   public String getBarCodPar( )
   {
      if ( GXutil.strcmp(AV18BarCodPar, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV18BarCodPar ;
      }
   }

   @JsonProperty("BarCodPar")
   public void setBarCodPar(  String Value )
   {
      if ( Value == null )
      {
         AV18BarCodPar = "" ;
      }
      else
      {
         AV18BarCodPar= Value;
      }
   }


   short AV19GuiFasLin;
   @JsonProperty("GuiFasLin")
   public short getGuiFasLin( )
   {
      return AV19GuiFasLin ;
   }

   @JsonProperty("GuiFasLin")
   public void setGuiFasLin(  short Value )
   {
      AV19GuiFasLin= Value;
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


   int AV30Cond_CliCod;
   @JsonProperty("Cond_CliCod")
   public int getCond_CliCod( )
   {
      return AV30Cond_CliCod ;
   }

   @JsonProperty("Cond_CliCod")
   public void setCond_CliCod(  int Value )
   {
      AV30Cond_CliCod= Value;
   }


   String AV24SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV24SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV24SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV24SearchTxt = "" ;
      }
      else
      {
         AV24SearchTxt= Value;
      }
   }


}

