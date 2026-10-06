package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "trabajosexternos.tmanufawwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tmanufawwgetfilterdata_RESTInterfaceIN
{
   String AV38DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV38DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV38DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV38DDOName = "" ;
      }
      else
      {
         AV38DDOName= Value;
      }
   }


   String AV36SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV36SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV36SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV36SearchTxt = "" ;
      }
      else
      {
         AV36SearchTxt= Value;
      }
   }


   String AV37SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV37SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV37SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV37SearchTxtTo = "" ;
      }
      else
      {
         AV37SearchTxtTo= Value;
      }
   }


}

