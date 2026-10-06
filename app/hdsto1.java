package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.hdsto1", "/app.hdsto1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hdsto1 extends GXWebObjectStub
{
   public hdsto1( )
   {
   }

   public hdsto1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hdsto1.class ));
   }

   public hdsto1( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hdsto1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hdsto1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla HDSTO1";
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

