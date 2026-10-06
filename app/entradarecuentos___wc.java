package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradarecuentos___wc", "/app.entradarecuentos___wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradarecuentos___wc extends GXWebObjectStub
{
   public entradarecuentos___wc( )
   {
   }

   public entradarecuentos___wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradarecuentos___wc.class ));
   }

   public entradarecuentos___wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradarecuentos___wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradarecuentos___wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Recuentos v.03";
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

