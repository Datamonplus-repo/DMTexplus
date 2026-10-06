package app ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "pget_dvelopmenu_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class pget_dvelopmenu_RESTInterfaceIN
{
   String AV13UsurCod;
   @JsonProperty("UsurCod")
   public String getUsurCod( )
   {
      if ( GXutil.strcmp(AV13UsurCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV13UsurCod ;
      }
   }

   @JsonProperty("UsurCod")
   public void setUsurCod(  String Value )
   {
      if ( Value == null )
      {
         AV13UsurCod = "" ;
      }
      else
      {
         AV13UsurCod= Value;
      }
   }


}

