package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.setprinter", "/app.setprinter"})
@jakarta.servlet.annotation.MultipartConfig
public final  class setprinter extends GXWebObjectStub
{
   public setprinter( )
   {
   }

   public setprinter( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( setprinter.class ));
   }

   public setprinter( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new setprinter_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new setprinter_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Impressora";
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

