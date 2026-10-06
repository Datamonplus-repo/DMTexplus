package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradarecuentos__wc", "/app.entradarecuentos__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradarecuentos__wc extends GXWebObjectStub
{
   public entradarecuentos__wc( )
   {
   }

   public entradarecuentos__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradarecuentos__wc.class ));
   }

   public entradarecuentos__wc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradarecuentos__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradarecuentos__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Recuento";
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

