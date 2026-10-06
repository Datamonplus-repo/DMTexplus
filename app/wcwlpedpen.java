package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwlpedpen", "/app.wcwlpedpen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwlpedpen extends GXWebObjectStub
{
   public wcwlpedpen( )
   {
   }

   public wcwlpedpen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwlpedpen.class ));
   }

   public wcwlpedpen( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwlpedpen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwlpedpen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla LPEDID";
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

