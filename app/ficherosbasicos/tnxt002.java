package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt002", "/app.ficherosbasicos.tnxt002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt002 extends GXWebObjectStub
{
   public tnxt002( )
   {
   }

   public tnxt002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt002.class ));
   }

   public tnxt002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Departamentos";
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

