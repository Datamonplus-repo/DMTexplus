package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Calprd_TRNWWGetFilterData")
public final  class calprd_trnwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.calprd_trnwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV62DDOName;
      AV62DDOName = entity.getDDOName() ;
      String AV60SearchTxt;
      AV60SearchTxt = entity.getSearchTxt() ;
      String AV61SearchTxtTo;
      AV61SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV66OptionsJson = new String[] { "" };
      String [] AV69OptionsDescJson = new String[] { "" };
      String [] AV71OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("calprd_trnwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.calprd_trnwwgetfilterdata worker = new app.calprd_trnwwgetfilterdata(remoteHandle, context);
         worker.execute(AV62DDOName,AV60SearchTxt,AV61SearchTxtTo,AV66OptionsJson,AV69OptionsDescJson,AV71OptionIndexesJson );
         app.calprd_trnwwgetfilterdata_RESTInterfaceOUT data = new app.calprd_trnwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV66OptionsJson[0]);
         data.setOptionsDescJson(AV69OptionsDescJson[0]);
         data.setOptionIndexesJson(AV71OptionIndexesJson[0]);
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

