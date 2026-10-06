package app.core ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Core/ManutencionUsuariosGetFilterData")
public final  class manutencionusuariosgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.core.manutencionusuariosgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV29DDOName;
      AV29DDOName = entity.getDDOName() ;
      String AV30SearchTxt;
      AV30SearchTxt = entity.getSearchTxt() ;
      String AV31SearchTxtTo;
      AV31SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV32OptionsJson = new String[] { "" };
      String [] AV33OptionsDescJson = new String[] { "" };
      String [] AV34OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("core.manutencionusuariosgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.core.manutencionusuariosgetfilterdata worker = new app.core.manutencionusuariosgetfilterdata(remoteHandle, context);
         worker.execute(AV29DDOName,AV30SearchTxt,AV31SearchTxtTo,AV32OptionsJson,AV33OptionsDescJson,AV34OptionIndexesJson );
         app.core.manutencionusuariosgetfilterdata_RESTInterfaceOUT data = new app.core.manutencionusuariosgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV32OptionsJson[0]);
         data.setOptionsDescJson(AV33OptionsDescJson[0]);
         data.setOptionIndexesJson(AV34OptionIndexesJson[0]);
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

