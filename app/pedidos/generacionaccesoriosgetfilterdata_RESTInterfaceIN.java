package app.pedidos ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "pedidos.generacionaccesoriosgetfilterdata_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class generacionaccesoriosgetfilterdata_RESTInterfaceIN
{
   String AV42DDOName;
   @JsonProperty("DDOName")
   public String getDDOName( )
   {
      if ( GXutil.strcmp(AV42DDOName, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV42DDOName ;
      }
   }

   @JsonProperty("DDOName")
   public void setDDOName(  String Value )
   {
      if ( Value == null )
      {
         AV42DDOName = "" ;
      }
      else
      {
         AV42DDOName= Value;
      }
   }


   String AV40SearchTxt;
   @JsonProperty("SearchTxt")
   public String getSearchTxt( )
   {
      if ( GXutil.strcmp(AV40SearchTxt, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV40SearchTxt ;
      }
   }

   @JsonProperty("SearchTxt")
   public void setSearchTxt(  String Value )
   {
      if ( Value == null )
      {
         AV40SearchTxt = "" ;
      }
      else
      {
         AV40SearchTxt= Value;
      }
   }


   String AV41SearchTxtTo;
   @JsonProperty("SearchTxtTo")
   public String getSearchTxtTo( )
   {
      if ( GXutil.strcmp(AV41SearchTxtTo, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV41SearchTxtTo ;
      }
   }

   @JsonProperty("SearchTxtTo")
   public void setSearchTxtTo(  String Value )
   {
      if ( Value == null )
      {
         AV41SearchTxtTo = "" ;
      }
      else
      {
         AV41SearchTxtTo= Value;
      }
   }


}

