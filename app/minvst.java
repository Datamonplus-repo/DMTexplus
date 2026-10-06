package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.minvst", "/app.minvst"})
@jakarta.servlet.annotation.MultipartConfig
public final  class minvst extends GXWebObjectStub
{
   public minvst( )
   {
   }

   public minvst( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( minvst.class ));
   }

   public minvst( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new minvst_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new minvst_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla MInv St (Inventarios de Stocks)";
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

