package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcanal", "/app.tcanal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcanal extends GXWebObjectStub
{
   public tcanal( )
   {
   }

   public tcanal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcanal.class ));
   }

   public tcanal( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcanal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcanal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Clientes CANAL";
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

