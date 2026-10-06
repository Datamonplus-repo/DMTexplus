package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbcomww", "/app.talbcomww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbcomww extends GXWebObjectStub
{
   public talbcomww( )
   {
   }

   public talbcomww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbcomww.class ));
   }

   public talbcomww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbcomww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbcomww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Albaranes Comerciales v01";
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

