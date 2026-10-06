package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbaragr", "/app.tbaragr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbaragr extends GXWebObjectStub
{
   public tbaragr( )
   {
   }

   public tbaragr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbaragr.class ));
   }

   public tbaragr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbaragr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbaragr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "AGRUPACION HOJAS RUTA TINTE";
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

