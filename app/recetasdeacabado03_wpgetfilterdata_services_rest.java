package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/RecetasdeAcabado03_WPGetFilterData")
public final  class recetasdeacabado03_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.recetasdeacabado03_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV42DDOName;
      AV42DDOName = entity.getDDOName() ;
      String AV40SearchTxt;
      AV40SearchTxt = entity.getSearchTxt() ;
      String AV41SearchTxtTo;
      AV41SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV46OptionsJson = new String[] { "" };
      String [] AV49OptionsDescJson = new String[] { "" };
      String [] AV51OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("recetasdeacabado03_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.recetasdeacabado03_wpgetfilterdata worker = new app.recetasdeacabado03_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV42DDOName,AV40SearchTxt,AV41SearchTxtTo,AV46OptionsJson,AV49OptionsDescJson,AV51OptionIndexesJson );
         app.recetasdeacabado03_wpgetfilterdata_RESTInterfaceOUT data = new app.recetasdeacabado03_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV46OptionsJson[0]);
         data.setOptionsDescJson(AV49OptionsDescJson[0]);
         data.setOptionIndexesJson(AV51OptionIndexesJson[0]);
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

