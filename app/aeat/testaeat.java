package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.aeat.testaeat", "/app.aeat.testaeat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testaeat extends GXWebObjectStub
{
   public testaeat( )
   {
   }

   public testaeat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testaeat.class ));
   }

   public testaeat( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testaeat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testaeat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Test Aeat - Panel";
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

