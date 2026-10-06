package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test.abaranestab01", "/app.test.abaranestab01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abaranestab01 extends GXWebObjectStub
{
   public abaranestab01( )
   {
   }

   public abaranestab01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abaranestab01.class ));
   }

   public abaranestab01( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abaranestab01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abaranestab01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abaranes Tab01";
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

