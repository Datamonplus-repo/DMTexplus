package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thisrec", "/app.thisrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thisrec extends GXWebObjectStub
{
   public thisrec( )
   {
   }

   public thisrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thisrec.class ));
   }

   public thisrec( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thisrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thisrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO RECETAS (HDR)";
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

