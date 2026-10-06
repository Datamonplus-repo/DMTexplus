package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "tcatsuswwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tcatsuswwgetfilterdata_RESTInterfaceIN
{
   String AV22DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV22DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV22DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV22DDOName = "" ;
      }
      else
      {
         AV22DDOName= Value;
      }
   }


   String AV20SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV20SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV20SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV20SearchTxt = "" ;
      }
      else
      {
         AV20SearchTxt= Value;
      }
   }


   String AV21SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV21SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV21SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV21SearchTxtTo = "" ;
      }
      else
      {
         AV21SearchTxtTo= Value;
      }
   }


}

