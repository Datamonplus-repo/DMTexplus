package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/WpRcT002GetFilterData")
public final  class wprct002getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.wprct002getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV44DDOName;
      AV44DDOName = entity.getDDOName() ;
      String AV42SearchTxt;
      AV42SearchTxt = entity.getSearchTxt() ;
      String AV43SearchTxtTo;
      AV43SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV48OptionsJson = new String[] { "" };
      String [] AV51OptionsDescJson = new String[] { "" };
      String [] AV53OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("wprct002getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.wprct002getfilterdata worker = new app.wprct002getfilterdata(remoteHandle, context);
         worker.execute(AV44DDOName,AV42SearchTxt,AV43SearchTxtTo,AV48OptionsJson,AV51OptionsDescJson,AV53OptionIndexesJson );
         app.wprct002getfilterdata_RESTInterfaceOUT data = new app.wprct002getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV48OptionsJson[0]);
         data.setOptionsDescJson(AV51OptionsDescJson[0]);
         data.setOptionIndexesJson(AV53OptionIndexesJson[0]);
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

