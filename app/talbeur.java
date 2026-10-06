package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbeur", "/app.talbeur"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbeur extends GXWebObjectStub
{
   public talbeur( )
   {
   }

   public talbeur( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbeur.class ));
   }

   public talbeur( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbeur_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbeur_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRASPASO ALBARANES ENTRADA";
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

