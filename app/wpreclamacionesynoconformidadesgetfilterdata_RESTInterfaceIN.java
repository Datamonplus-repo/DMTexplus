package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "wpreclamacionesynoconformidadesgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class wpreclamacionesynoconformidadesgetfilterdata_RESTInterfaceIN
{
   String AV104DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV104DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV104DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV104DDOName = "" ;
      }
      else
      {
         AV104DDOName= Value;
      }
   }


   String AV102SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV102SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV102SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV102SearchTxt = "" ;
      }
      else
      {
         AV102SearchTxt= Value;
      }
   }


   String AV103SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV103SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV103SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV103SearchTxtTo = "" ;
      }
      else
      {
         AV103SearchTxtTo= Value;
      }
   }


}

