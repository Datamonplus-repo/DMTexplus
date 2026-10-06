package app.calidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidadhtd.calidadhtd_header", "/app.calidadhtd.calidadhtd_header", "/servlet/app.calidadhtd.calidadhtd_header/gxobject", "/app.calidadhtd.calidadhtd_header/gxobject"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calidadhtd_header extends GXWebObjectStub
{
   public calidadhtd_header( )
   {
   }

   public calidadhtd_header( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calidadhtd_header.class ));
   }

   public calidadhtd_header( int remoteHandle ,
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
         new calidadhtd_header_impl(context).doExecute();
      }
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calidadhtd_header_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calidad HTD (header)";
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

