package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetatinte05_wc", "/app.recetatinte05_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetatinte05_wc extends GXWebObjectStub
{
   public recetatinte05_wc( )
   {
   }

   public recetatinte05_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetatinte05_wc.class ));
   }

   public recetatinte05_wc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetatinte05_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetatinte05_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Procesos Quimicos (agregar)";
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

