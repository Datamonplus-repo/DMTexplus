package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rminvstk", "/app.rminvstk"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rminvstk extends GXWebObjectStub
{
   public rminvstk( )
   {
   }

   public rminvstk( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rminvstk.class ));
   }

   public rminvstk( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rminvstk_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rminvstk_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Inventario";
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

