package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwco0015", "/app.wcwco0015"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwco0015 extends GXWebObjectStub
{
   public wcwco0015( )
   {
   }

   public wcwco0015( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwco0015.class ));
   }

   public wcwco0015( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwco0015_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwco0015_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla PROPRV";
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

