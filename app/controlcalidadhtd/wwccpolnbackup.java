package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwccpolnbackup", "/app.controlcalidadhtd.wwccpolnbackup"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwccpolnbackup extends GXWebObjectStub
{
   public wwccpolnbackup( )
   {
   }

   public wwccpolnbackup( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwccpolnbackup.class ));
   }

   public wwccpolnbackup( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwccpolnbackup_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwccpolnbackup_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Elaborar Relatórios CQ";
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

