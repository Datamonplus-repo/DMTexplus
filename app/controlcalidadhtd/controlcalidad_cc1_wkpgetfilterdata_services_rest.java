package app.controlcalidadhtd ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ControlCalidadHTD/ControlCalidad_CC1_WKPGetFilterData")
public final  class controlcalidad_cc1_wkpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV36DDOName;
      AV36DDOName = entity.getDDOName() ;
      String AV37SearchTxt;
      AV37SearchTxt = entity.getSearchTxt() ;
      String AV38SearchTxtTo;
      AV38SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV39OptionsJson = new String[] { "" };
      String [] AV40OptionsDescJson = new String[] { "" };
      String [] AV41OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata worker = new app.controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata(remoteHandle, context);
         worker.execute(AV36DDOName,AV37SearchTxt,AV38SearchTxtTo,AV39OptionsJson,AV40OptionsDescJson,AV41OptionIndexesJson );
         app.controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata_RESTInterfaceOUT data = new app.controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV39OptionsJson[0]);
         data.setOptionsDescJson(AV40OptionsDescJson[0]);
         data.setOptionIndexesJson(AV41OptionIndexesJson[0]);
         builder = Response.okWrapped(data);
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

