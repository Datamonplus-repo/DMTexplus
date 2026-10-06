package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/ColorProductosVariables_WPGetFilterData")
public final  class colorproductosvariables_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.colorproductosvariables_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV36DDOName;
      AV36DDOName = entity.getDDOName() ;
      String AV37SearchTxt;
      AV37SearchTxt = entity.getSearchTxt() ;
      String AV38SearchTxtTo;
      AV38SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV39OptionsJson = new String[] { "" };
      String [] AV40OptionsDescJson = new String[] { "" };
      String [] AV41OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.colorproductosvariables_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.colorproductosvariables_wpgetfilterdata worker = new app.formulaciontinte.colorproductosvariables_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV36DDOName,AV37SearchTxt,AV38SearchTxtTo,AV39OptionsJson,AV40OptionsDescJson,AV41OptionIndexesJson );
         app.formulaciontinte.colorproductosvariables_wpgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.colorproductosvariables_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV39OptionsJson[0]);
         data.setOptionsDescJson(AV40OptionsDescJson[0]);
         data.setOptionIndexesJson(AV41OptionIndexesJson[0]);
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

