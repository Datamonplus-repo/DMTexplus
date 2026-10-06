package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productosnocuaderno_wc", "/app.productosnocuaderno_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnocuaderno_wc extends GXWebObjectStub
{
   public productosnocuaderno_wc( )
   {
   }

   public productosnocuaderno_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnocuaderno_wc.class ));
   }

   public productosnocuaderno_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnocuaderno_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnocuaderno_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos";
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

