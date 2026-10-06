package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlectorww", "/app.tlectorww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlectorww extends GXWebObjectStub
{
   public tlectorww( )
   {
   }

   public tlectorww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlectorww.class ));
   }

   public tlectorww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlectorww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlectorww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento tabla LECTOR";
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

