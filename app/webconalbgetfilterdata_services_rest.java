package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/WebCONALBGetFilterData")
public final  class webconalbgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.webconalbgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV70DDOName;
      AV70DDOName = entity.getDDOName() ;
      String AV68SearchTxt;
      AV68SearchTxt = entity.getSearchTxt() ;
      String AV69SearchTxtTo;
      AV69SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV74OptionsJson = new String[] { "" };
      String [] AV77OptionsDescJson = new String[] { "" };
      String [] AV79OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("webconalbgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.webconalbgetfilterdata worker = new app.webconalbgetfilterdata(remoteHandle, context);
         worker.execute(AV70DDOName,AV68SearchTxt,AV69SearchTxtTo,AV74OptionsJson,AV77OptionsDescJson,AV79OptionIndexesJson );
         app.webconalbgetfilterdata_RESTInterfaceOUT data = new app.webconalbgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV74OptionsJson[0]);
         data.setOptionsDescJson(AV77OptionsDescJson[0]);
         data.setOptionIndexesJson(AV79OptionIndexesJson[0]);
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

