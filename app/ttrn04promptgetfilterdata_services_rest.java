package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TTrn04PromptGetFilterData")
public final  class ttrn04promptgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.ttrn04promptgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV26DDOName;
      AV26DDOName = entity.getDDOName() ;
      String AV24SearchTxt;
      AV24SearchTxt = entity.getSearchTxt() ;
      String AV25SearchTxtTo;
      AV25SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV30OptionsJson = new String[] { "" };
      String [] AV33OptionsDescJson = new String[] { "" };
      String [] AV35OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("ttrn04promptgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.ttrn04promptgetfilterdata worker = new app.ttrn04promptgetfilterdata(remoteHandle, context);
         worker.execute(AV26DDOName,AV24SearchTxt,AV25SearchTxtTo,AV30OptionsJson,AV33OptionsDescJson,AV35OptionIndexesJson );
         app.ttrn04promptgetfilterdata_RESTInterfaceOUT data = new app.ttrn04promptgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV30OptionsJson[0]);
         data.setOptionsDescJson(AV33OptionsDescJson[0]);
         data.setOptionIndexesJson(AV35OptionIndexesJson[0]);
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

