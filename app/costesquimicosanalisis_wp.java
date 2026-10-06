package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesquimicosanalisis_wp", "/app.costesquimicosanalisis_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesquimicosanalisis_wp extends GXWebObjectStub
{
   public costesquimicosanalisis_wp( )
   {
   }

   public costesquimicosanalisis_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesquimicosanalisis_wp.class ));
   }

   public costesquimicosanalisis_wp( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesquimicosanalisis_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesquimicosanalisis_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Quimicos Analisis";
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

