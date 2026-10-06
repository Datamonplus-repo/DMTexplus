package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test.abaranestab02", "/app.test.abaranestab02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abaranestab02 extends GXWebObjectStub
{
   public abaranestab02( )
   {
   }

   public abaranestab02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abaranestab02.class ));
   }

   public abaranestab02( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abaranestab02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abaranestab02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abaranes Tab02";
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

