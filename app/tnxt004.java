package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnxt004", "/app.tnxt004"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt004 extends GXWebObjectStub
{
   public tnxt004( )
   {
   }

   public tnxt004( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt004.class ));
   }

   public tnxt004( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt004_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt004_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Resultados Print Durability";
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

