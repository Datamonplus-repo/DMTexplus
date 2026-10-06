package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/RecetasdeAcabado04_WPGetFilterData")
public final  class recetasdeacabado04_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.recetasdeacabado04_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV22DDOName;
      AV22DDOName = entity.getDDOName() ;
      String AV20SearchTxt;
      AV20SearchTxt = entity.getSearchTxt() ;
      String AV21SearchTxtTo;
      AV21SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV26OptionsJson = new String[] { "" };
      String [] AV29OptionsDescJson = new String[] { "" };
      String [] AV31OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("recetasdeacabado04_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.recetasdeacabado04_wpgetfilterdata worker = new app.recetasdeacabado04_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV22DDOName,AV20SearchTxt,AV21SearchTxtTo,AV26OptionsJson,AV29OptionsDescJson,AV31OptionIndexesJson );
         app.recetasdeacabado04_wpgetfilterdata_RESTInterfaceOUT data = new app.recetasdeacabado04_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV26OptionsJson[0]);
         data.setOptionsDescJson(AV29OptionsDescJson[0]);
         data.setOptionIndexesJson(AV31OptionIndexesJson[0]);
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

