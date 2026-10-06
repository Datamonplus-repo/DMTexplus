package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwuti012", "/app.webwuti012"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwuti012 extends GXWebObjectStub
{
   public webwuti012( )
   {
   }

   public webwuti012( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwuti012.class ));
   }

   public webwuti012( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwuti012_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwuti012_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion LOTE Compras Productos";
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

