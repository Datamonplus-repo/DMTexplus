package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwconfor3", "/app.webwconfor3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwconfor3 extends GXWebObjectStub
{
   public webwconfor3( )
   {
   }

   public webwconfor3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwconfor3.class ));
   }

   public webwconfor3( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwconfor3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwconfor3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Confirmar Color";
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

