package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwccpoln", "/app.controlcalidadhtd.wwccpoln"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwccpoln extends GXWebObjectStub
{
   public wwccpoln( )
   {
   }

   public wwccpoln( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwccpoln.class ));
   }

   public wwccpoln( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwccpoln_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwccpoln_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AUDITORIA n Controles";
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

