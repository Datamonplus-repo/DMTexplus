package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccdef", "/app.controlcalidadhtd.tccdef", "/servlet/app.controlcalidadhtd.tccdef/gxobject", "/app.controlcalidadhtd.tccdef/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccdef extends GXWebObjectStub
{
   public tccdef( )
   {
   }

   public tccdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccdef.class ));
   }

   public tccdef( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      if ( HttpUtils.isUploadRequest(context) )
      {
         new GXObjectUploadServices().doInternalExecute(context);
      }
      else
      {
         new tccdef_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Definición de Cont. de Calidad";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

