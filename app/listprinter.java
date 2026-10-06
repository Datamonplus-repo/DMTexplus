package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listprinter", "/app.listprinter"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listprinter extends GXWebObjectStub
{
   public listprinter( )
   {
   }

   public listprinter( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listprinter.class ));
   }

   public listprinter( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listprinter_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listprinter_impl(context).cleanup();
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

