package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpiecopy1", "/app.tdevpiecopy1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpiecopy1 extends GXWebObjectStub
{
   public tdevpiecopy1( )
   {
   }

   public tdevpiecopy1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpiecopy1.class ));
   }

   public tdevpiecopy1( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpiecopy1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpiecopy1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Piezas Copy";
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

