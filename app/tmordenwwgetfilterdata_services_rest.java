package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TMOrdenWWGetFilterData")
public final  class tmordenwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tmordenwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV56DDOName;
      AV56DDOName = entity.getDDOName() ;
      String AV54SearchTxt;
      AV54SearchTxt = entity.getSearchTxt() ;
      String AV55SearchTxtTo;
      AV55SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV60OptionsJson = new String[] { "" };
      String [] AV63OptionsDescJson = new String[] { "" };
      String [] AV65OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tmordenwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tmordenwwgetfilterdata worker = new app.tmordenwwgetfilterdata(remoteHandle, context);
         worker.execute(AV56DDOName,AV54SearchTxt,AV55SearchTxtTo,AV60OptionsJson,AV63OptionsDescJson,AV65OptionIndexesJson );
         app.tmordenwwgetfilterdata_RESTInterfaceOUT data = new app.tmordenwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV60OptionsJson[0]);
         data.setOptionsDescJson(AV63OptionsDescJson[0]);
         data.setOptionIndexesJson(AV65OptionIndexesJson[0]);
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

