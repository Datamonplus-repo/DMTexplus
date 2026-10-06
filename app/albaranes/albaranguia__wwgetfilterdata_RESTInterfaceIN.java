package app.albaranes ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "albaranes.albaranguia__wwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class albaranguia__wwgetfilterdata_RESTInterfaceIN
{
   String AV76DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV76DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV76DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV76DDOName = "" ;
      }
      else
      {
         AV76DDOName= Value;
      }
   }


   String AV77SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV77SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV77SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV77SearchTxt = "" ;
      }
      else
      {
         AV77SearchTxt= Value;
      }
   }


   String AV78SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV78SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV78SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV78SearchTxtTo = "" ;
      }
      else
      {
         AV78SearchTxtTo= Value;
      }
   }


}

