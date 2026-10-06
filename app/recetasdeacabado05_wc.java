package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabado05_wc", "/app.recetasdeacabado05_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetasdeacabado05_wc extends GXWebObjectStub
{
   public recetasdeacabado05_wc( )
   {
   }

   public recetasdeacabado05_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetasdeacabado05_wc.class ));
   }

   public recetasdeacabado05_wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetasdeacabado05_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetasdeacabado05_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla RECMAQ";
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

