package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tformul", "/app.tformul"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tformul extends GXWebObjectStub
{
   public tformul( )
   {
   }

   public tformul( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tformul.class ));
   }

   public tformul( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tformul_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tformul_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO DE FORMULAS";
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

