package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwmodiflote", "/app.comprasquimicos.webwmodiflote"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmodiflote extends GXWebObjectStub
{
   public webwmodiflote( )
   {
   }

   public webwmodiflote( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmodiflote.class ));
   }

   public webwmodiflote( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmodiflote_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmodiflote_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion de Albaran, Lote Productos";
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

