package app.documentotransporteproduccion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/DocumentoTransporteProduccion/DocumentodeTransporteProduccion_41GetFilterData")
public final  class documentodetransporteproduccion_41getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV25DDOName;
      AV25DDOName = entity.getDDOName() ;
      String AV26SearchTxt;
      AV26SearchTxt = entity.getSearchTxt() ;
      String AV27SearchTxtTo;
      AV27SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV28OptionsJson = new String[] { "" };
      String [] AV29OptionsDescJson = new String[] { "" };
      String [] AV30OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata worker = new app.documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata(remoteHandle, context);
         worker.execute(AV25DDOName,AV26SearchTxt,AV27SearchTxtTo,AV28OptionsJson,AV29OptionsDescJson,AV30OptionIndexesJson );
         app.documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata_RESTInterfaceOUT data = new app.documentotransporteproduccion.documentodetransporteproduccion_41getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV28OptionsJson[0]);
         data.setOptionsDescJson(AV29OptionsDescJson[0]);
         data.setOptionIndexesJson(AV30OptionIndexesJson[0]);
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

