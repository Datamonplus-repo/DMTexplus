package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnotrec", "/app.tnotrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnotrec extends GXWebObjectStub
{
   public tnotrec( )
   {
   }

   public tnotrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnotrec.class ));
   }

   public tnotrec( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnotrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnotrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTAS DE RECLAMACIONES";
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

