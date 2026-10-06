package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TTproducWWGetFilterData")
public final  class ttproducwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.ttproducwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV52DDOName;
      AV52DDOName = entity.getDDOName() ;
      String AV50SearchTxt;
      AV50SearchTxt = entity.getSearchTxt() ;
      String AV51SearchTxtTo;
      AV51SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV56OptionsJson = new String[] { "" };
      String [] AV59OptionsDescJson = new String[] { "" };
      String [] AV61OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("ttproducwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.ttproducwwgetfilterdata worker = new app.ttproducwwgetfilterdata(remoteHandle, context);
         worker.execute(AV52DDOName,AV50SearchTxt,AV51SearchTxtTo,AV56OptionsJson,AV59OptionsDescJson,AV61OptionIndexesJson );
         app.ttproducwwgetfilterdata_RESTInterfaceOUT data = new app.ttproducwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV56OptionsJson[0]);
         data.setOptionsDescJson(AV59OptionsDescJson[0]);
         data.setOptionIndexesJson(AV61OptionIndexesJson[0]);
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

