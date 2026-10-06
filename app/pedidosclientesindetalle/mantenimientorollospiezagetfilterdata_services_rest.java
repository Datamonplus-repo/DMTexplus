package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/PedidosClienteSinDetalle/MantenimientoRollosPiezaGetFilterData")
public final  class mantenimientorollospiezagetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidosclientesindetalle.mantenimientorollospiezagetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV45DDOName;
      AV45DDOName = entity.getDDOName() ;
      String AV46SearchTxt;
      AV46SearchTxt = entity.getSearchTxt() ;
      String AV47SearchTxtTo;
      AV47SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV48OptionsJson = new String[] { "" };
      String [] AV49OptionsDescJson = new String[] { "" };
      String [] AV50OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidosclientesindetalle.mantenimientorollospiezagetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidosclientesindetalle.mantenimientorollospiezagetfilterdata worker = new app.pedidosclientesindetalle.mantenimientorollospiezagetfilterdata(remoteHandle, context);
         worker.execute(AV45DDOName,AV46SearchTxt,AV47SearchTxtTo,AV48OptionsJson,AV49OptionsDescJson,AV50OptionIndexesJson );
         app.pedidosclientesindetalle.mantenimientorollospiezagetfilterdata_RESTInterfaceOUT data = new app.pedidosclientesindetalle.mantenimientorollospiezagetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV48OptionsJson[0]);
         data.setOptionsDescJson(AV49OptionsDescJson[0]);
         data.setOptionIndexesJson(AV50OptionIndexesJson[0]);
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

