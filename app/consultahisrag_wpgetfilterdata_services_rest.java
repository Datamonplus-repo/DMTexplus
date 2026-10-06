package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ConsultaHisRag_WPGetFilterData")
public final  class consultahisrag_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.consultahisrag_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV44DDOName;
      AV44DDOName = entity.getDDOName() ;
      String AV45SearchTxt;
      AV45SearchTxt = entity.getSearchTxt() ;
      String AV46SearchTxtTo;
      AV46SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV47OptionsJson = new String[] { "" };
      String [] AV48OptionsDescJson = new String[] { "" };
      String [] AV49OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("consultahisrag_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.consultahisrag_wpgetfilterdata worker = new app.consultahisrag_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV44DDOName,AV45SearchTxt,AV46SearchTxtTo,AV47OptionsJson,AV48OptionsDescJson,AV49OptionIndexesJson );
         app.consultahisrag_wpgetfilterdata_RESTInterfaceOUT data = new app.consultahisrag_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV47OptionsJson[0]);
         data.setOptionsDescJson(AV48OptionsDescJson[0]);
         data.setOptionIndexesJson(AV49OptionIndexesJson[0]);
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

