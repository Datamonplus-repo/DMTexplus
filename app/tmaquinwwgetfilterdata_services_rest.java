package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TMAQUINWWGetFilterData")
public final  class tmaquinwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tmaquinwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV48DDOName;
      AV48DDOName = entity.getDDOName() ;
      String AV49SearchTxt;
      AV49SearchTxt = entity.getSearchTxt() ;
      String AV50SearchTxtTo;
      AV50SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV51OptionsJson = new String[] { "" };
      String [] AV52OptionsDescJson = new String[] { "" };
      String [] AV53OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tmaquinwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tmaquinwwgetfilterdata worker = new app.tmaquinwwgetfilterdata(remoteHandle, context);
         worker.execute(AV48DDOName,AV49SearchTxt,AV50SearchTxtTo,AV51OptionsJson,AV52OptionsDescJson,AV53OptionIndexesJson );
         app.tmaquinwwgetfilterdata_RESTInterfaceOUT data = new app.tmaquinwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV51OptionsJson[0]);
         data.setOptionsDescJson(AV52OptionsDescJson[0]);
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

