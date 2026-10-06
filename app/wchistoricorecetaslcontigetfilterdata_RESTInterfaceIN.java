package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "wchistoricorecetaslcontigetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wchistoricorecetaslcontigetfilterdata_RESTInterfaceIN
{
   String AV46DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV46DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV46DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV46DDOName = "" ;
      }
      else
      {
         AV46DDOName= Value;
      }
   }


   String AV44SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV44SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV44SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV44SearchTxt = "" ;
      }
      else
      {
         AV44SearchTxt= Value;
      }
   }


   String AV45SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV45SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV45SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV45SearchTxtTo = "" ;
      }
      else
      {
         AV45SearchTxtTo= Value;
      }
   }


}

