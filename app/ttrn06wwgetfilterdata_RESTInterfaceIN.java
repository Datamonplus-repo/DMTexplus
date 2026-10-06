package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "ttrn06wwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class ttrn06wwgetfilterdata_RESTInterfaceIN
{
   String AV26DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV26DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV26DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV26DDOName = "" ;
      }
      else
      {
         AV26DDOName= Value;
      }
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


   String AV25SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV25SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV25SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV25SearchTxtTo = "" ;
      }
      else
      {
         AV25SearchTxtTo= Value;
      }
   }


}

