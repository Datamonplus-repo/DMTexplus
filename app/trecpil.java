package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trecpil", "/app.trecpil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trecpil extends GXWebObjectStub
{
   public trecpil( )
   {
   }

   public trecpil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trecpil.class ));
   }

   public trecpil( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trecpil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trecpil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECARGOS";
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

