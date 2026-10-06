package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lmacro", "/app.lmacro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lmacro extends GXWebObjectStub
{
   public lmacro( )
   {
   }

   public lmacro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lmacro.class ));
   }

   public lmacro( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lmacro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lmacro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LMACRO";
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

