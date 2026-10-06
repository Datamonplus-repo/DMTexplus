package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.NONE)
@jakarta.xml.bind.annotation.XmlType(name = "asyncbatch.asyncbatchapi_setparameters__post_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class asyncbatchapi_setparameters__post_RESTInterfaceIN
{
   app.asyncbatch.SdtJobParameterData_RESTInterface AV9JobData;
   @JsonProperty("JobData")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public app.asyncbatch.SdtJobParameterData_RESTInterface getJobData( )
   {
      return AV9JobData ;
   }

   @JsonProperty("JobData")
   public void setJobData(  app.asyncbatch.SdtJobParameterData_RESTInterface Value )
   {
      AV9JobData= Value;
   }


}

