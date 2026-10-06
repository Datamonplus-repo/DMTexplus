package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rmod002", "/app.rmod002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod002 extends GXWebObjectStub
{
   public rmod002( )
   {
   }

   public rmod002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod002.class ));
   }

   public rmod002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SAIDAS DE PRODUCTOS";
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

