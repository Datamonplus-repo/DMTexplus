package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwem000", "/app.webwem000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwem000 extends GXWebObjectStub
{
   public webwem000( )
   {
   }

   public webwem000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwem000.class ));
   }

   public webwem000( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwem000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwem000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes Entradas Almacen";
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

