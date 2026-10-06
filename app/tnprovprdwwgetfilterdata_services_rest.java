package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TnPROVPRDWWGetFilterData")
public final  class tnprovprdwwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tnprovprdwwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV20DDOName;
      AV20DDOName = entity.getDDOName() ;
      String AV18SearchTxt;
      AV18SearchTxt = entity.getSearchTxt() ;
      String AV19SearchTxtTo;
      AV19SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV24OptionsJson = new String[] { "" };
      String [] AV27OptionsDescJson = new String[] { "" };
      String [] AV29OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tnprovprdwwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tnprovprdwwgetfilterdata worker = new app.tnprovprdwwgetfilterdata(remoteHandle, context);
         worker.execute(AV20DDOName,AV18SearchTxt,AV19SearchTxtTo,AV24OptionsJson,AV27OptionsDescJson,AV29OptionIndexesJson );
         app.tnprovprdwwgetfilterdata_RESTInterfaceOUT data = new app.tnprovprdwwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV24OptionsJson[0]);
         data.setOptionsDescJson(AV27OptionsDescJson[0]);
         data.setOptionIndexesJson(AV29OptionIndexesJson[0]);
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

