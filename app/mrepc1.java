package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mrepc1", "/app.mrepc1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrepc1 extends GXWebObjectStub
{
   public mrepc1( )
   {
   }

   public mrepc1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrepc1.class ));
   }

   public mrepc1( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrepc1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrepc1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla MRep C1 (Compras, repuestos)";
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

