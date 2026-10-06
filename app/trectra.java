package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trectra", "/app.trectra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trectra extends GXWebObjectStub
{
   public trectra( )
   {
   }

   public trectra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trectra.class ));
   }

   public trectra( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trectra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trectra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "recargos estampacion";
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

