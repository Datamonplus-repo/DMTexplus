package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcop001", "/app.wcwcop001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcop001 extends GXWebObjectStub
{
   public wcwcop001( )
   {
   }

   public wcwcop001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcop001.class ));
   }

   public wcwcop001( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcop001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcop001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Compra (n Proveedores)";
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

