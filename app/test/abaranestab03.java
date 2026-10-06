package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test.abaranestab03", "/app.test.abaranestab03"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abaranestab03 extends GXWebObjectStub
{
   public abaranestab03( )
   {
   }

   public abaranestab03( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abaranestab03.class ));
   }

   public abaranestab03( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abaranestab03_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abaranestab03_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abaranes Tab03";
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

