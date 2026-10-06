package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tisotb1", "/app.tisotb1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tisotb1 extends GXWebObjectStub
{
   public tisotb1( )
   {
   }

   public tisotb1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tisotb1.class ));
   }

   public tisotb1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tisotb1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tisotb1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLASIFICACION PROVEEDOR";
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

