package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productosnoaplicarnormas_wc", "/app.productosnoaplicarnormas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnoaplicarnormas_wc extends GXWebObjectStub
{
   public productosnoaplicarnormas_wc( )
   {
   }

   public productosnoaplicarnormas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnoaplicarnormas_wc.class ));
   }

   public productosnoaplicarnormas_wc( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnoaplicarnormas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnoaplicarnormas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Productos Quimicos";
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

