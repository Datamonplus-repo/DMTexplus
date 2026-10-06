package app.pedidos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Pedidos/Dis_DisColNom_PromptGetFilterData")
public final  class dis_discolnom_promptgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidos.dis_discolnom_promptgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV49DDOName;
      AV49DDOName = entity.getDDOName() ;
      String AV50SearchTxt;
      AV50SearchTxt = entity.getSearchTxt() ;
      String AV51SearchTxtTo;
      AV51SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV52OptionsJson = new String[] { "" };
      String [] AV53OptionsDescJson = new String[] { "" };
      String [] AV54OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidos.dis_discolnom_promptgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidos.dis_discolnom_promptgetfilterdata worker = new app.pedidos.dis_discolnom_promptgetfilterdata(remoteHandle, context);
         worker.execute(AV49DDOName,AV50SearchTxt,AV51SearchTxtTo,AV52OptionsJson,AV53OptionsDescJson,AV54OptionIndexesJson );
         app.pedidos.dis_discolnom_promptgetfilterdata_RESTInterfaceOUT data = new app.pedidos.dis_discolnom_promptgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV52OptionsJson[0]);
         data.setOptionsDescJson(AV53OptionsDescJson[0]);
         data.setOptionIndexesJson(AV54OptionIndexesJson[0]);
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

