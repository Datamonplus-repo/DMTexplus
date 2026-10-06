package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/GxOnPendingEventFailed")
public final  class gxonpendingeventfailed_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.gxonpendingeventfailed_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventList_SynchronizationEventListItem AV8PendingEvent ;
      AV8PendingEvent= (com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventList_SynchronizationEventListItem)entity.getPendingEvent().getSdt();
      String AV9BCName;
      AV9BCName = entity.getBCName() ;
      String AV10BCJson;
      AV10BCJson = entity.getBCJson() ;
      com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventResultList_SynchronizationEventResultListItem AV12EventResult ;
      AV12EventResult= (com.genexuscore.genexus.sd.synchronization.SdtSynchronizationEventResultList_SynchronizationEventResultListItem)entity.getEventResult().getSdt();
      com.genexuscore.genexus.sd.synchronization.SdtSynchronizationInfo GxSyncroInfo ;
      GxSyncroInfo= (com.genexuscore.genexus.sd.synchronization.SdtSynchronizationInfo)entity.getGxSyncroInfo().getSdt();
      boolean [] AV11Continue = new boolean[] { false };
      if ( ! processHeaders("gxonpendingeventfailed",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.gxonpendingeventfailed worker = new app.gxonpendingeventfailed(remoteHandle, context);
         worker.execute(AV8PendingEvent,AV9BCName,AV10BCJson,AV12EventResult,GxSyncroInfo,AV11Continue );
         app.gxonpendingeventfailed_RESTInterfaceOUT data = new app.gxonpendingeventfailed_RESTInterfaceOUT();
         data.setContinue(AV11Continue[0]);
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

