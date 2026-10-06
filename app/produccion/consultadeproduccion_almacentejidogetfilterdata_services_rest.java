package app.produccion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Produccion/ConsultadeProduccion_AlmacenTejidoGetFilterData")
public final  class consultadeproduccion_almacentejidogetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.produccion.consultadeproduccion_almacentejidogetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV52DDOName;
      AV52DDOName = entity.getDDOName() ;
      String AV53SearchTxt;
      AV53SearchTxt = entity.getSearchTxt() ;
      String AV54SearchTxtTo;
      AV54SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV55OptionsJson = new String[] { "" };
      String [] AV56OptionsDescJson = new String[] { "" };
      String [] AV57OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("produccion.consultadeproduccion_almacentejidogetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.produccion.consultadeproduccion_almacentejidogetfilterdata worker = new app.produccion.consultadeproduccion_almacentejidogetfilterdata(remoteHandle, context);
         worker.execute(AV52DDOName,AV53SearchTxt,AV54SearchTxtTo,AV55OptionsJson,AV56OptionsDescJson,AV57OptionIndexesJson );
         app.produccion.consultadeproduccion_almacentejidogetfilterdata_RESTInterfaceOUT data = new app.produccion.consultadeproduccion_almacentejidogetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV55OptionsJson[0]);
         data.setOptionsDescJson(AV56OptionsDescJson[0]);
         data.setOptionIndexesJson(AV57OptionIndexesJson[0]);
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

