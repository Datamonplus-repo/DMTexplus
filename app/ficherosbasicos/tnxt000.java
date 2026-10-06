package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt000", "/app.ficherosbasicos.tnxt000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt000 extends GXWebObjectStub
{
   public tnxt000( )
   {
   }

   public tnxt000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt000.class ));
   }

   public tnxt000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Componentes";
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

