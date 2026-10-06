package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rco0002", "/app.rco0002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rco0002 extends GXWebObjectStub
{
   public rco0002( )
   {
   }

   public rco0002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rco0002.class ));
   }

   public rco0002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rco0002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rco0002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ABC PROVEEDORES";
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

