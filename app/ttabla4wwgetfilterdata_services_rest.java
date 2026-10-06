package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TTABLA4WWGetFilterData")
public final  class ttabla4wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.ttabla4wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV16DDOName;
      AV16DDOName = entity.getDDOName() ;
      String AV14SearchTxt;
      AV14SearchTxt = entity.getSearchTxt() ;
      String AV15SearchTxtTo;
      AV15SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV20OptionsJson = new String[] { "" };
      String [] AV23OptionsDescJson = new String[] { "" };
      String [] AV25OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("ttabla4wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.ttabla4wwgetfilterdata worker = new app.ttabla4wwgetfilterdata(remoteHandle, context);
         worker.execute(AV16DDOName,AV14SearchTxt,AV15SearchTxtTo,AV20OptionsJson,AV23OptionsDescJson,AV25OptionIndexesJson );
         app.ttabla4wwgetfilterdata_RESTInterfaceOUT data = new app.ttabla4wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV20OptionsJson[0]);
         data.setOptionsDescJson(AV23OptionsDescJson[0]);
         data.setOptionIndexesJson(AV25OptionIndexesJson[0]);
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

