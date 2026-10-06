package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "tterminwwgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class tterminwwgetfilterdata_RESTInterfaceIN
{
   String AV60DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV60DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV60DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV60DDOName = "" ;
      }
      else
      {
         AV60DDOName= Value;
      }
   }


   String AV58SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV58SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV58SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV58SearchTxt = "" ;
      }
      else
      {
         AV58SearchTxt= Value;
      }
   }


   String AV59SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV59SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV59SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV59SearchTxtTo = "" ;
      }
      else
      {
         AV59SearchTxtTo= Value;
      }
   }


}

