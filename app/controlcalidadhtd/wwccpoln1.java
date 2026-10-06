package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwccpoln1", "/app.controlcalidadhtd.wwccpoln1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwccpoln1 extends GXWebObjectStub
{
   public wwccpoln1( )
   {
   }

   public wwccpoln1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwccpoln1.class ));
   }

   public wwccpoln1( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwccpoln1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwccpoln1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Auditoria n Controles";
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

