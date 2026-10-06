package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ccstks", "/app.ccstks"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ccstks extends GXWebObjectStub
{
   public ccstks( )
   {
   }

   public ccstks( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ccstks.class ));
   }

   public ccstks( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ccstks_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ccstks_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla CCSTKS";
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

