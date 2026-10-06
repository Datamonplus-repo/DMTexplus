package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnotrecww", "/app.tnotrecww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnotrecww extends GXWebObjectStub
{
   public tnotrecww( )
   {
   }

   public tnotrecww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnotrecww.class ));
   }

   public tnotrecww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnotrecww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnotrecww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " NOTAS DE RECLAMACIONES";
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

