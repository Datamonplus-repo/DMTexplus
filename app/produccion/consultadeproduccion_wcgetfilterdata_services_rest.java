package app.produccion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Produccion/ConsultadeProduccion_WCGetFilterData")
public final  class consultadeproduccion_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.produccion.consultadeproduccion_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV442DDOName;
      AV442DDOName = entity.getDDOName() ;
      String AV440SearchTxt;
      AV440SearchTxt = entity.getSearchTxt() ;
      String AV441SearchTxtTo;
      AV441SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV446OptionsJson = new String[] { "" };
      String [] AV449OptionsDescJson = new String[] { "" };
      String [] AV451OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("produccion.consultadeproduccion_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.produccion.consultadeproduccion_wcgetfilterdata worker = new app.produccion.consultadeproduccion_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV442DDOName,AV440SearchTxt,AV441SearchTxtTo,AV446OptionsJson,AV449OptionsDescJson,AV451OptionIndexesJson );
         app.produccion.consultadeproduccion_wcgetfilterdata_RESTInterfaceOUT data = new app.produccion.consultadeproduccion_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV446OptionsJson[0]);
         data.setOptionsDescJson(AV449OptionsDescJson[0]);
         data.setOptionIndexesJson(AV451OptionIndexesJson[0]);
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

