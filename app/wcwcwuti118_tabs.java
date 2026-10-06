package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcwuti118_tabs", "/app.wcwcwuti118_tabs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_tabs extends GXWebObjectStub
{
   public wcwcwuti118_tabs( )
   {
   }

   public wcwcwuti118_tabs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_tabs.class ));
   }

   public wcwcwuti118_tabs( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_tabs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_tabs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informacion Producto (Recetas, Consumos,Compras,Lavados)";
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

