package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.test_v01", "/app.produccion.test_v01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class test_v01 extends GXWebObjectStub
{
   public test_v01( )
   {
   }

   public test_v01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( test_v01.class ));
   }

   public test_v01( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new test_v01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new test_v01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Produccion";
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

