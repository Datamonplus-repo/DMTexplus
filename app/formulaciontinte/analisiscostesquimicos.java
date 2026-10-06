package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.analisiscostesquimicos", "/app.formulaciontinte.analisiscostesquimicos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscostesquimicos extends GXWebObjectStub
{
   public analisiscostesquimicos( )
   {
   }

   public analisiscostesquimicos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscostesquimicos.class ));
   }

   public analisiscostesquimicos( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscostesquimicos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscostesquimicos_impl(context).cleanup();
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

