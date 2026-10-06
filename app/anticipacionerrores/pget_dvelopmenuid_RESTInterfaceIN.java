package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "anticipacionerrores.pget_dvelopmenuid_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class pget_dvelopmenuid_RESTInterfaceIN
{
   String AV14UsurCod;
   @JsonProperty("UsurCod")
   public String getUsurCod( )
   {
      if ( GXutil.strcmp(AV14UsurCod, null) == 0 )
      {
         return "" ;
      }
      else
      {
         return AV14UsurCod ;
      }
   }

   @JsonProperty("UsurCod")
   public void setUsurCod(  String Value )
   {
      if ( Value == null )
      {
         AV14UsurCod = "" ;
      }
      else
      {
         AV14UsurCod= Value;
      }
   }


}

