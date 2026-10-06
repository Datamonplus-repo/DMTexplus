package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.pgrcomm", "/app.albaranescomerciales.pgrcomm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pgrcomm extends GXWebObjectStub
{
   public pgrcomm( )
   {
   }

   public pgrcomm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pgrcomm.class ));
   }

   public pgrcomm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pgrcomm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pgrcomm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "GUIA COMERCIAL";
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

