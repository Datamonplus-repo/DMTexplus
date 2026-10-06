package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "gestionlaboratorio.entradaensayolaboratorioloaddvcombo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class entradaensayolaboratorioloaddvcombo_RESTInterfaceIN
{
   String AV13ComboName;
   @JsonProperty("ComboName")
   public String getComboName( )
   {
      if ( GXutil.strcmp(AV13ComboName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV13ComboName ;
      }
   }

   @JsonProperty("ComboName")
   public void setComboName(  String Value )
   {
      if ( Value == null )
      {
         AV13ComboName = "" ;
      }
      else
      {
         AV13ComboName= Value;
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


   String AV17EmprCod;
   @JsonProperty("EmprCod")
   public String getEmprCod( )
   {
      if ( GXutil.strcmp(AV17EmprCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV17EmprCod ;
      }
   }

   @JsonProperty("EmprCod")
   public void setEmprCod(  String Value )
   {
      if ( Value == null )
      {
         AV17EmprCod = "" ;
      }
      else
      {
         AV17EmprCod= Value;
      }
   }


   String AV18Lb_numero;
   @JsonProperty("Lb_numero")
   public String getLb_numero( )
   {
      return AV18Lb_numero ;
   }

   @JsonProperty("Lb_numero")
   public void setLb_numero(  String Value )
   {
      AV18Lb_numero= Value;
   }


}

