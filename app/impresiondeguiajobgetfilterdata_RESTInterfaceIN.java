package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "impresiondeguiajobgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class impresiondeguiajobgetfilterdata_RESTInterfaceIN
{
   String AV121DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV121DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV121DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV121DDOName = "" ;
      }
      else
      {
         AV121DDOName= Value;
      }
   }


   String AV122SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV122SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV122SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV122SearchTxt = "" ;
      }
      else
      {
         AV122SearchTxt= Value;
      }
   }


   String AV123SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV123SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV123SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV123SearchTxtTo = "" ;
      }
      else
      {
         AV123SearchTxtTo= Value;
      }
   }


}

