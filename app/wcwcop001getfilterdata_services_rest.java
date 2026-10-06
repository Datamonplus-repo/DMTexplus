package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/WCWcop001GetFilterData")
public final  class wcwcop001getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.wcwcop001getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV18DDOName;
      AV18DDOName = entity.getDDOName() ;
      String AV16SearchTxt;
      AV16SearchTxt = entity.getSearchTxt() ;
      String AV17SearchTxtTo;
      AV17SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV22OptionsJson = new String[] { "" };
      String [] AV25OptionsDescJson = new String[] { "" };
      String [] AV27OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("wcwcop001getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.wcwcop001getfilterdata worker = new app.wcwcop001getfilterdata(remoteHandle, context);
         worker.execute(AV18DDOName,AV16SearchTxt,AV17SearchTxtTo,AV22OptionsJson,AV25OptionsDescJson,AV27OptionIndexesJson );
         app.wcwcop001getfilterdata_RESTInterfaceOUT data = new app.wcwcop001getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV22OptionsJson[0]);
         data.setOptionsDescJson(AV25OptionsDescJson[0]);
         data.setOptionIndexesJson(AV27OptionIndexesJson[0]);
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

