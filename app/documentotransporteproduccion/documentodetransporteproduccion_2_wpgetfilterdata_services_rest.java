package app.documentotransporteproduccion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/DocumentoTransporteProduccion/DocumentodeTransporteProduccion_2_WPGetFilterData")
public final  class documentodetransporteproduccion_2_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV58DDOName;
      AV58DDOName = entity.getDDOName() ;
      String AV59SearchTxt;
      AV59SearchTxt = entity.getSearchTxt() ;
      String AV60SearchTxtTo;
      AV60SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV61OptionsJson = new String[] { "" };
      String [] AV62OptionsDescJson = new String[] { "" };
      String [] AV63OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata worker = new app.documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV58DDOName,AV59SearchTxt,AV60SearchTxtTo,AV61OptionsJson,AV62OptionsDescJson,AV63OptionIndexesJson );
         app.documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata_RESTInterfaceOUT data = new app.documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV61OptionsJson[0]);
         data.setOptionsDescJson(AV62OptionsDescJson[0]);
         data.setOptionIndexesJson(AV63OptionIndexesJson[0]);
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

