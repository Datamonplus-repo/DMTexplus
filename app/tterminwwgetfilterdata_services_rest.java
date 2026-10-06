package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TTERMINWWGetFilterData")
public final  class tterminwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tterminwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV60DDOName;
      AV60DDOName = entity.getDDOName() ;
      String AV58SearchTxt;
      AV58SearchTxt = entity.getSearchTxt() ;
      String AV59SearchTxtTo;
      AV59SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV64OptionsJson = new String[] { "" };
      String [] AV67OptionsDescJson = new String[] { "" };
      String [] AV69OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tterminwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tterminwwgetfilterdata worker = new app.tterminwwgetfilterdata(remoteHandle, context);
         worker.execute(AV60DDOName,AV58SearchTxt,AV59SearchTxtTo,AV64OptionsJson,AV67OptionsDescJson,AV69OptionIndexesJson );
         app.tterminwwgetfilterdata_RESTInterfaceOUT data = new app.tterminwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV64OptionsJson[0]);
         data.setOptionsDescJson(AV67OptionsDescJson[0]);
         data.setOptionIndexesJson(AV69OptionIndexesJson[0]);
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

