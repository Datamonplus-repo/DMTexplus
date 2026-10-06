package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "anticipacionerrores.pget_dvelopmenuid_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class pget_dvelopmenuid_RESTInterfaceOUT
{
   Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> AV8DVelop_Menu ;
   @JsonProperty("DVelop_Menu")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> getDVelop_Menu( )
   {
      return AV8DVelop_Menu ;
   }

   @JsonProperty("DVelop_Menu")
   public void setDVelop_Menu(  Vector<app.wwpbaseobjects.SdtDVelop_Menu_Item_RESTInterface> Value )
   {
      AV8DVelop_Menu= Value;
   }


}

