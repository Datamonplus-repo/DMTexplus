package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidad", "/app.controlcalidadhtd.controlcalidad", "/servlet/app.controlcalidadhtd.controlcalidad/gxobject", "/app.controlcalidadhtd.controlcalidad/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidad extends GXWebObjectStub
{
   public controlcalidad( )
   {
   }

   public controlcalidad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidad.class ));
   }

   public controlcalidad( int remoteHandle ,
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
         new controlcalidad_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Calidad";
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

