package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp89", "/app.wcwwkp89"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp89 extends GXWebObjectStub
{
   public wcwwkp89( )
   {
   }

   public wcwwkp89( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp89.class ));
   }

   public wcwwkp89( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp89_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp89_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Productos Quimicos";
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

