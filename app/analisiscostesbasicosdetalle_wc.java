package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.analisiscostesbasicosdetalle_wc", "/app.analisiscostesbasicosdetalle_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscostesbasicosdetalle_wc extends GXWebObjectStub
{
   public analisiscostesbasicosdetalle_wc( )
   {
   }

   public analisiscostesbasicosdetalle_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscostesbasicosdetalle_wc.class ));
   }

   public analisiscostesbasicosdetalle_wc( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscostesbasicosdetalle_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscostesbasicosdetalle_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla BARFAS";
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

