package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcop002", "/app.wcwcop002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcop002 extends GXWebObjectStub
{
   public wcwcop002( )
   {
   }

   public wcwcop002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcop002.class ));
   }

   public wcwcop002( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcop002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcop002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Compra (Produc)";
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

