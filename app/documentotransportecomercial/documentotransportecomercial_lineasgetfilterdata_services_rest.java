package app.documentotransportecomercial ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/DocumentoTransporteComercial/DocumentoTransporteComercial_LineasGetFilterData")
public final  class documentotransportecomercial_lineasgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV61DDOName;
      AV61DDOName = entity.getDDOName() ;
      String AV62SearchTxt;
      AV62SearchTxt = entity.getSearchTxt() ;
      String AV63SearchTxtTo;
      AV63SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV64OptionsJson = new String[] { "" };
      String [] AV65OptionsDescJson = new String[] { "" };
      String [] AV66OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata worker = new app.documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata(remoteHandle, context);
         worker.execute(AV61DDOName,AV62SearchTxt,AV63SearchTxtTo,AV64OptionsJson,AV65OptionsDescJson,AV66OptionIndexesJson );
         app.documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata_RESTInterfaceOUT data = new app.documentotransportecomercial.documentotransportecomercial_lineasgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV64OptionsJson[0]);
         data.setOptionsDescJson(AV65OptionsDescJson[0]);
         data.setOptionIndexesJson(AV66OptionIndexesJson[0]);
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

