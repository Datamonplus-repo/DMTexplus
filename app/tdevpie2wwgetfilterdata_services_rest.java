package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TDevPie2WWGetFilterData")
public final  class tdevpie2wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tdevpie2wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV40DDOName;
      AV40DDOName = entity.getDDOName() ;
      String AV38SearchTxt;
      AV38SearchTxt = entity.getSearchTxt() ;
      String AV39SearchTxtTo;
      AV39SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV44OptionsJson = new String[] { "" };
      String [] AV47OptionsDescJson = new String[] { "" };
      String [] AV49OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tdevpie2wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tdevpie2wwgetfilterdata worker = new app.tdevpie2wwgetfilterdata(remoteHandle, context);
         worker.execute(AV40DDOName,AV38SearchTxt,AV39SearchTxtTo,AV44OptionsJson,AV47OptionsDescJson,AV49OptionIndexesJson );
         app.tdevpie2wwgetfilterdata_RESTInterfaceOUT data = new app.tdevpie2wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV44OptionsJson[0]);
         data.setOptionsDescJson(AV47OptionsDescJson[0]);
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

