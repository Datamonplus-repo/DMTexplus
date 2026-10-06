package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipproww", "/app.stocksquimicos.ttipproww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipproww extends GXWebObjectStub
{
   public ttipproww( )
   {
   }

   public ttipproww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipproww.class ));
   }

   public ttipproww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipproww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipproww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Subfamilia Producto Quimico";
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

