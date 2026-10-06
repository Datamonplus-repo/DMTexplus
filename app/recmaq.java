package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recmaq", "/app.recmaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recmaq extends GXWebObjectStub
{
   public recmaq( )
   {
   }

   public recmaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recmaq.class ));
   }

   public recmaq( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recmaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recmaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla RECMAQ";
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

