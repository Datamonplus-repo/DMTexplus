package app.controlcalidadhtd ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ControlCalidadHTD/ControlCalidadNotificacionWWGetFilterData")
public final  class controlcalidadnotificacionwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV30DDOName;
      AV30DDOName = entity.getDDOName() ;
      String AV31SearchTxt;
      AV31SearchTxt = entity.getSearchTxt() ;
      String AV32SearchTxtTo;
      AV32SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV33OptionsJson = new String[] { "" };
      String [] AV34OptionsDescJson = new String[] { "" };
      String [] AV35OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata worker = new app.controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata(remoteHandle, context);
         worker.execute(AV30DDOName,AV31SearchTxt,AV32SearchTxtTo,AV33OptionsJson,AV34OptionsDescJson,AV35OptionIndexesJson );
         app.controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata_RESTInterfaceOUT data = new app.controlcalidadhtd.controlcalidadnotificacionwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV33OptionsJson[0]);
         data.setOptionsDescJson(AV34OptionsDescJson[0]);
         data.setOptionIndexesJson(AV35OptionIndexesJson[0]);
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

