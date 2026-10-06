package app.facturacion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Facturacion/PrecioFase__WPGetFilterData")
public final  class preciofase__wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.facturacion.preciofase__wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV38DDOName;
      AV38DDOName = entity.getDDOName() ;
      String AV39SearchTxt;
      AV39SearchTxt = entity.getSearchTxt() ;
      String AV40SearchTxtTo;
      AV40SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV41OptionsJson = new String[] { "" };
      String [] AV42OptionsDescJson = new String[] { "" };
      String [] AV43OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("facturacion.preciofase__wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.facturacion.preciofase__wpgetfilterdata worker = new app.facturacion.preciofase__wpgetfilterdata(remoteHandle, context);
         worker.execute(AV38DDOName,AV39SearchTxt,AV40SearchTxtTo,AV41OptionsJson,AV42OptionsDescJson,AV43OptionIndexesJson );
         app.facturacion.preciofase__wpgetfilterdata_RESTInterfaceOUT data = new app.facturacion.preciofase__wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV41OptionsJson[0]);
         data.setOptionsDescJson(AV42OptionsDescJson[0]);
         data.setOptionIndexesJson(AV43OptionIndexesJson[0]);
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

