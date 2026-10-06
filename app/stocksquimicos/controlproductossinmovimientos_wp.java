package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.controlproductossinmovimientos_wp", "/app.stocksquimicos.controlproductossinmovimientos_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlproductossinmovimientos_wp extends GXWebObjectStub
{
   public controlproductossinmovimientos_wp( )
   {
   }

   public controlproductossinmovimientos_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlproductossinmovimientos_wp.class ));
   }

   public controlproductossinmovimientos_wp( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlproductossinmovimientos_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlproductossinmovimientos_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Productos sin Movimientos (funciones)";
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

