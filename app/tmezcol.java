package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmezcol", "/app.tmezcol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmezcol extends GXWebObjectStub
{
   public tmezcol( )
   {
   }

   public tmezcol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmezcol.class ));
   }

   public tmezcol( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmezcol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmezcol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMPOSICION COLORES MEZCLAS";
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

