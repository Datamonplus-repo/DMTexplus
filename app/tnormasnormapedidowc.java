package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnormasnormapedidowc", "/app.tnormasnormapedidowc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnormasnormapedidowc extends GXWebObjectStub
{
   public tnormasnormapedidowc( )
   {
   }

   public tnormasnormapedidowc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnormasnormapedidowc.class ));
   }

   public tnormasnormapedidowc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnormasnormapedidowc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnormasnormapedidowc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNORMASNorma Pedido WC";
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

