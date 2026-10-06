package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tgascol", "/app.tgascol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgascol extends GXWebObjectStub
{
   public tgascol( )
   {
   }

   public tgascol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgascol.class ));
   }

   public tgascol( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgascol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgascol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ARCHIVO DE COLORES";
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

