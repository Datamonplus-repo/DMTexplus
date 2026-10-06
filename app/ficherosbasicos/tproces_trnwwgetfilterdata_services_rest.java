package app.ficherosbasicos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FicherosBasicos/TProces_TRNWWGetFilterData")
public final  class tproces_trnwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.ficherosbasicos.tproces_trnwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV47DDOName;
      AV47DDOName = entity.getDDOName() ;
      String AV48SearchTxt;
      AV48SearchTxt = entity.getSearchTxt() ;
      String AV49SearchTxtTo;
      AV49SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV50OptionsJson = new String[] { "" };
      String [] AV51OptionsDescJson = new String[] { "" };
      String [] AV52OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("ficherosbasicos.tproces_trnwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.ficherosbasicos.tproces_trnwwgetfilterdata worker = new app.ficherosbasicos.tproces_trnwwgetfilterdata(remoteHandle, context);
         worker.execute(AV47DDOName,AV48SearchTxt,AV49SearchTxtTo,AV50OptionsJson,AV51OptionsDescJson,AV52OptionIndexesJson );
         app.ficherosbasicos.tproces_trnwwgetfilterdata_RESTInterfaceOUT data = new app.ficherosbasicos.tproces_trnwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV50OptionsJson[0]);
         data.setOptionsDescJson(AV51OptionsDescJson[0]);
         data.setOptionIndexesJson(AV52OptionIndexesJson[0]);
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

