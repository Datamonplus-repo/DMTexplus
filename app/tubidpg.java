package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubidpg", "/app.tubidpg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubidpg extends GXWebObjectStub
{
   public tubidpg( )
   {
   }

   public tubidpg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubidpg.class ));
   }

   public tubidpg( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubidpg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubidpg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SALIDAS DE UBICACIONES PLG";
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

