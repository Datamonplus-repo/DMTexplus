package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt001", "/app.ficherosbasicos.tnxt001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt001 extends GXWebObjectStub
{
   public tnxt001( )
   {
   }

   public tnxt001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt001.class ));
   }

   public tnxt001( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Desarrollos";
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

