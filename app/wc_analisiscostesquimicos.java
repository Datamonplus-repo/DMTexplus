package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_analisiscostesquimicos", "/app.wc_analisiscostesquimicos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_analisiscostesquimicos extends GXWebObjectStub
{
   public wc_analisiscostesquimicos( )
   {
   }

   public wc_analisiscostesquimicos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_analisiscostesquimicos.class ));
   }

   public wc_analisiscostesquimicos( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_analisiscostesquimicos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_analisiscostesquimicos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Costes Quimicos";
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

