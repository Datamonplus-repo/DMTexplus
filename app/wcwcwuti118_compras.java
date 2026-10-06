package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcwuti118_compras", "/app.wcwcwuti118_compras"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_compras extends GXWebObjectStub
{
   public wcwcwuti118_compras( )
   {
   }

   public wcwcwuti118_compras( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_compras.class ));
   }

   public wcwcwuti118_compras( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_compras_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_compras_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla ENTALM";
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

