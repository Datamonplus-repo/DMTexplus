package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "anticipacionerrores.mant_detallegetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class mant_detallegetfilterdata_RESTInterfaceIN
{
   String AV62DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV62DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV62DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV62DDOName = "" ;
      }
      else
      {
         AV62DDOName= Value;
      }
   }


   String AV63SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV63SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV63SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV63SearchTxt = "" ;
      }
      else
      {
         AV63SearchTxt= Value;
      }
   }


   String AV64SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV64SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV64SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV64SearchTxtTo = "" ;
      }
      else
      {
         AV64SearchTxtTo= Value;
      }
   }


}

