package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tiva", "/app.tiva"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tiva extends GXWebObjectStub
{
   public tiva( )
   {
   }

   public tiva( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tiva.class ));
   }

   public tiva( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tiva_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tiva_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO IVA";
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

