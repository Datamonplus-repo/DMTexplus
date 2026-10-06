package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "anticipacionerrores.mant_filtradogetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class mant_filtradogetfilterdata_RESTInterfaceIN
{
   String AV54DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV54DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV54DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV54DDOName = "" ;
      }
      else
      {
         AV54DDOName= Value;
      }
   }


   String AV55SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV55SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV55SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV55SearchTxt = "" ;
      }
      else
      {
         AV55SearchTxt= Value;
      }
   }


   String AV56SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV56SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV56SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV56SearchTxtTo = "" ;
      }
      else
      {
         AV56SearchTxtTo= Value;
      }
   }


}

