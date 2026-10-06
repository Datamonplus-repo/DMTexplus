package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productosnonormas_wc", "/app.productosnonormas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnonormas_wc extends GXWebObjectStub
{
   public productosnonormas_wc( )
   {
   }

   public productosnonormas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnonormas_wc.class ));
   }

   public productosnonormas_wc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnonormas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnonormas_wc_impl(context).cleanup();
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

