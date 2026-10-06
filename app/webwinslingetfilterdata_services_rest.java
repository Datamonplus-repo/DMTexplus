package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/WebWINSLINGetFilterData")
public final  class webwinslingetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.webwinslingetfilterdata_RESTInterfaceIN entity ) throws Exception
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
      if ( ! processHeaders("webwinslingetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.webwinslingetfilterdata worker = new app.webwinslingetfilterdata(remoteHandle, context);
         worker.execute(AV18DDOName,AV16SearchTxt,AV17SearchTxtTo,AV22OptionsJson,AV25OptionsDescJson,AV27OptionIndexesJson );
         app.webwinslingetfilterdata_RESTInterfaceOUT data = new app.webwinslingetfilterdata_RESTInterfaceOUT();
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

