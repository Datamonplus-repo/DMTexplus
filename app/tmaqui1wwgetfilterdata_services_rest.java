package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TMAQUI1WWGetFilterData")
public final  class tmaqui1wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tmaqui1wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV54DDOName;
      AV54DDOName = entity.getDDOName() ;
      String AV52SearchTxt;
      AV52SearchTxt = entity.getSearchTxt() ;
      String AV53SearchTxtTo;
      AV53SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV58OptionsJson = new String[] { "" };
      String [] AV61OptionsDescJson = new String[] { "" };
      String [] AV63OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tmaqui1wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tmaqui1wwgetfilterdata worker = new app.tmaqui1wwgetfilterdata(remoteHandle, context);
         worker.execute(AV54DDOName,AV52SearchTxt,AV53SearchTxtTo,AV58OptionsJson,AV61OptionsDescJson,AV63OptionIndexesJson );
         app.tmaqui1wwgetfilterdata_RESTInterfaceOUT data = new app.tmaqui1wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV58OptionsJson[0]);
         data.setOptionsDescJson(AV61OptionsDescJson[0]);
         data.setOptionIndexesJson(AV63OptionIndexesJson[0]);
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

