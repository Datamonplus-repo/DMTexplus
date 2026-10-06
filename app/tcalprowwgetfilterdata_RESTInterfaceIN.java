package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "tcalprowwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tcalprowwgetfilterdata_RESTInterfaceIN
{
   String AV44DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV44DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV44DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV44DDOName = "" ;
      }
      else
      {
         AV44DDOName= Value;
      }
   }


   String AV42SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV42SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV42SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV42SearchTxt = "" ;
      }
      else
      {
         AV42SearchTxt= Value;
      }
   }


   String AV43SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV43SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV43SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV43SearchTxtTo = "" ;
      }
      else
      {
         AV43SearchTxtTo= Value;
      }
   }


}

