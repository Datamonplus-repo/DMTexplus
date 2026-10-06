package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttvalap", "/app.ttvalap"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttvalap extends GXWebObjectStub
{
   public ttvalap( )
   {
   }

   public ttvalap( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttvalap.class ));
   }

   public ttvalap( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttvalap_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttvalap_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Codigos Valores para Test de APARIENCIA";
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

