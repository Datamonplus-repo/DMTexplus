package app.produccion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Produccion/ConsultadeProduccion_SDT_WCGetFilterData")
public final  class consultadeproduccion_sdt_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.produccion.consultadeproduccion_sdt_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV27DDOName;
      AV27DDOName = entity.getDDOName() ;
      String AV28SearchTxt;
      AV28SearchTxt = entity.getSearchTxt() ;
      String AV29SearchTxtTo;
      AV29SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV30OptionsJson = new String[] { "" };
      String [] AV31OptionsDescJson = new String[] { "" };
      String [] AV32OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("produccion.consultadeproduccion_sdt_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.produccion.consultadeproduccion_sdt_wcgetfilterdata worker = new app.produccion.consultadeproduccion_sdt_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV27DDOName,AV28SearchTxt,AV29SearchTxtTo,AV30OptionsJson,AV31OptionsDescJson,AV32OptionIndexesJson );
         app.produccion.consultadeproduccion_sdt_wcgetfilterdata_RESTInterfaceOUT data = new app.produccion.consultadeproduccion_sdt_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV30OptionsJson[0]);
         data.setOptionsDescJson(AV31OptionsDescJson[0]);
         data.setOptionIndexesJson(AV32OptionIndexesJson[0]);
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

