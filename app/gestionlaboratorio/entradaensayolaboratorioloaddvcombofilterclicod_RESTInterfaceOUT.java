package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "gestionlaboratorio.entradaensayolaboratorioloaddvcombofilterclicod_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class entradaensayolaboratorioloaddvcombofilterclicod_RESTInterfaceOUT
{
   String AV12SelectedValue;
   @JsonProperty("SelectedValue")
   public String getSelectedValue( )
   {
      return AV12SelectedValue ;
   }

   @JsonProperty("SelectedValue")
   public void setSelectedValue(  String Value )
   {
      AV12SelectedValue= Value;
   }


   Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> AV10Combo_Data ;
   @JsonProperty("Combo_Data")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> getCombo_Data( )
   {
      return AV10Combo_Data ;
   }

   @JsonProperty("Combo_Data")
   public void setCombo_Data(  Vector<app.wwpbaseobjects.SdtDVB_SDTComboData_Item_RESTInterface> Value )
   {
      AV10Combo_Data= Value;
   }


}

