package app.asyncbatch ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/{asyncbatch :(?i)asyncbatch}/{asyncbatchapi :(?i)asyncbatchapi}")
public final  class asyncbatchapi_services_rest extends GxRestService
{
   public static  class Gxep_setparameters__postparm
   {
      public String  JobData ;
   }

   @jakarta.ws.rs.Path("/{setparameters :(?i)setparameters}")
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response gxep_setparameters__post( app.asyncbatch.asyncbatchapi_setparameters__post_RESTInterfaceIN gxep_setparameters__postparm ) throws Exception
   {
      super.init( "POST" );
      if ( ! processHeaders("asyncbatch.asyncbatchapi",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      app.asyncbatch.SdtJobParameterData AV9JobData = new app.asyncbatch.SdtJobParameterData(remoteHandle, context);
      AV9JobData = (app.asyncbatch.SdtJobParameterData)gxep_setparameters__postparm.getJobData().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV8Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         app.asyncbatch.asyncbatchapi worker = new app.asyncbatch.asyncbatchapi(remoteHandle, context);
         worker.gxep_setparameters__post(AV9JobData,AV8Messages );
         app.asyncbatch.asyncbatchapi_setparameters__post_RESTInterfaceOUT data = new app.asyncbatch.asyncbatchapi_setparameters__post_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV8Messages[0]));
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

   @jakarta.ws.rs.Path("/{setparameters :(?i)setparameters}")
   @jakarta.ws.rs.OPTIONS
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response GetOptionsSetParameters__post( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.okWrapped();
      builder.header("Access-Control-Request-Headers", "Content-Type");
      builder.header("Access-Control-Allow-Methods", "OPTIONS,HEAD,POST");
      builder.header( "Access-Control-Allow-Origin",  "*");
      return (jakarta.ws.rs.core.Response) builder.build() ;
   }

   private Vector<com.genexus.SdtMessages_Message_RESTInterface> SdtMessages_Message_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.genexus.SdtMessages_Message> collection )
   {
      Vector<com.genexus.SdtMessages_Message_RESTInterface> result = new Vector<com.genexus.SdtMessages_Message_RESTInterface>();
      for (int i = 0; i < collection.size(); i++)
      {
         result.addElement(new com.genexus.SdtMessages_Message_RESTInterface((com.genexus.SdtMessages_Message)collection.elementAt(i)));
      }
      return result ;
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

