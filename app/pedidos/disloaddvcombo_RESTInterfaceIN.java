package app.pedidos ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "pedidos.disloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class disloaddvcombo_RESTInterfaceIN
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


   String AV15DisCod;
   @JsonProperty("DisCod")
   public String getDisCod( )
   {
      return AV15DisCod ;
   }

   @JsonProperty("DisCod")
   public void setDisCod(  String Value )
   {
      AV15DisCod= Value;
   }


}

