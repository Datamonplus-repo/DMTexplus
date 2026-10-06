package app.recetasdeacabados ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/RecetasDeAcabados/RecetadeAcabado01_WPGetFilterData")
public final  class recetadeacabado01_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.recetasdeacabados.recetadeacabado01_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV94DDOName;
      AV94DDOName = entity.getDDOName() ;
      String AV95SearchTxt;
      AV95SearchTxt = entity.getSearchTxt() ;
      String AV96SearchTxtTo;
      AV96SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV97OptionsJson = new String[] { "" };
      String [] AV98OptionsDescJson = new String[] { "" };
      String [] AV99OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("recetasdeacabados.recetadeacabado01_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.recetasdeacabados.recetadeacabado01_wpgetfilterdata worker = new app.recetasdeacabados.recetadeacabado01_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV94DDOName,AV95SearchTxt,AV96SearchTxtTo,AV97OptionsJson,AV98OptionsDescJson,AV99OptionIndexesJson );
         app.recetasdeacabados.recetadeacabado01_wpgetfilterdata_RESTInterfaceOUT data = new app.recetasdeacabados.recetadeacabado01_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV97OptionsJson[0]);
         data.setOptionsDescJson(AV98OptionsDescJson[0]);
         data.setOptionIndexesJson(AV99OptionIndexesJson[0]);
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

