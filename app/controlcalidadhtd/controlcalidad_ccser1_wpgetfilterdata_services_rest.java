package app.controlcalidadhtd ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ControlCalidadHTD/ControlCalidad_CCSER1_WPGetFilterData")
public final  class controlcalidad_ccser1_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV26DDOName;
      AV26DDOName = entity.getDDOName() ;
      String AV27SearchTxt;
      AV27SearchTxt = entity.getSearchTxt() ;
      String AV28SearchTxtTo;
      AV28SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV29OptionsJson = new String[] { "" };
      String [] AV30OptionsDescJson = new String[] { "" };
      String [] AV31OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata worker = new app.controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV26DDOName,AV27SearchTxt,AV28SearchTxtTo,AV29OptionsJson,AV30OptionsDescJson,AV31OptionIndexesJson );
         app.controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata_RESTInterfaceOUT data = new app.controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV29OptionsJson[0]);
         data.setOptionsDescJson(AV30OptionsDescJson[0]);
         data.setOptionIndexesJson(AV31OptionIndexesJson[0]);
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

