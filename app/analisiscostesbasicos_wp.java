package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.analisiscostesbasicos_wp", "/app.analisiscostesbasicos_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisiscostesbasicos_wp extends GXWebObjectStub
{
   public analisiscostesbasicos_wp( )
   {
   }

   public analisiscostesbasicos_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisiscostesbasicos_wp.class ));
   }

   public analisiscostesbasicos_wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisiscostesbasicos_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisiscostesbasicos_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analisis Costes Basicos";
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

