package app.facturacion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Facturacion/TProMD_lineas_WKPGetFilterData")
public final  class tpromd_lineas_wkpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.facturacion.tpromd_lineas_wkpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV41DDOName;
      AV41DDOName = entity.getDDOName() ;
      String AV42SearchTxt;
      AV42SearchTxt = entity.getSearchTxt() ;
      String AV43SearchTxtTo;
      AV43SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV44OptionsJson = new String[] { "" };
      String [] AV45OptionsDescJson = new String[] { "" };
      String [] AV46OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("facturacion.tpromd_lineas_wkpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.facturacion.tpromd_lineas_wkpgetfilterdata worker = new app.facturacion.tpromd_lineas_wkpgetfilterdata(remoteHandle, context);
         worker.execute(AV41DDOName,AV42SearchTxt,AV43SearchTxtTo,AV44OptionsJson,AV45OptionsDescJson,AV46OptionIndexesJson );
         app.facturacion.tpromd_lineas_wkpgetfilterdata_RESTInterfaceOUT data = new app.facturacion.tpromd_lineas_wkpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV44OptionsJson[0]);
         data.setOptionsDescJson(AV45OptionsDescJson[0]);
         data.setOptionIndexesJson(AV46OptionIndexesJson[0]);
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

