package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recuentoinven_wc", "/app.recuentoinven_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recuentoinven_wc extends GXWebObjectStub
{
   public recuentoinven_wc( )
   {
   }

   public recuentoinven_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recuentoinven_wc.class ));
   }

   public recuentoinven_wc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recuentoinven_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recuentoinven_wc_impl(context).cleanup();
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

