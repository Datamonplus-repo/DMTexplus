package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rco0010", "/app.rco0010"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rco0010 extends GXWebObjectStub
{
   public rco0010( )
   {
   }

   public rco0010( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rco0010.class ));
   }

   public rco0010( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rco0010_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rco0010_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "REALIZACION PREPEDIDOS";
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

