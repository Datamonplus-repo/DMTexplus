package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.test_v02", "/app.produccion.test_v02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class test_v02 extends GXWebObjectStub
{
   public test_v02( )
   {
   }

   public test_v02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( test_v02.class ));
   }

   public test_v02( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new test_v02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new test_v02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Produccion v02";
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

