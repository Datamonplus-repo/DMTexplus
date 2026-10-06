package app.facturacion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Facturacion/AbonosCargosWWGetFilterData")
public final  class abonoscargoswwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.facturacion.abonoscargoswwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV72DDOName;
      AV72DDOName = entity.getDDOName() ;
      String AV73SearchTxt;
      AV73SearchTxt = entity.getSearchTxt() ;
      String AV74SearchTxtTo;
      AV74SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV75OptionsJson = new String[] { "" };
      String [] AV76OptionsDescJson = new String[] { "" };
      String [] AV77OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("facturacion.abonoscargoswwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.facturacion.abonoscargoswwgetfilterdata worker = new app.facturacion.abonoscargoswwgetfilterdata(remoteHandle, context);
         worker.execute(AV72DDOName,AV73SearchTxt,AV74SearchTxtTo,AV75OptionsJson,AV76OptionsDescJson,AV77OptionIndexesJson );
         app.facturacion.abonoscargoswwgetfilterdata_RESTInterfaceOUT data = new app.facturacion.abonoscargoswwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV75OptionsJson[0]);
         data.setOptionsDescJson(AV76OptionsDescJson[0]);
         data.setOptionIndexesJson(AV77OptionIndexesJson[0]);
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

