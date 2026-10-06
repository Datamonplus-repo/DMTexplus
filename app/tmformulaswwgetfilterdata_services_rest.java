package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TMFormulasWWGetFilterData")
public final  class tmformulaswwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tmformulaswwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV58DDOName;
      AV58DDOName = entity.getDDOName() ;
      String AV56SearchTxt;
      AV56SearchTxt = entity.getSearchTxt() ;
      String AV57SearchTxtTo;
      AV57SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV62OptionsJson = new String[] { "" };
      String [] AV65OptionsDescJson = new String[] { "" };
      String [] AV67OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tmformulaswwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tmformulaswwgetfilterdata worker = new app.tmformulaswwgetfilterdata(remoteHandle, context);
         worker.execute(AV58DDOName,AV56SearchTxt,AV57SearchTxtTo,AV62OptionsJson,AV65OptionsDescJson,AV67OptionIndexesJson );
         app.tmformulaswwgetfilterdata_RESTInterfaceOUT data = new app.tmformulaswwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV62OptionsJson[0]);
         data.setOptionsDescJson(AV65OptionsDescJson[0]);
         data.setOptionIndexesJson(AV67OptionIndexesJson[0]);
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

