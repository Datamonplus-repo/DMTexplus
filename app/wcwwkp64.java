package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp64", "/app.wcwwkp64"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp64 extends GXWebObjectStub
{
   public wcwwkp64( )
   {
   }

   public wcwwkp64( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp64.class ));
   }

   public wcwwkp64( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp64_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp64_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Productos Quimicos";
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

