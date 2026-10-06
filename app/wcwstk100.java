package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwstk100", "/app.wcwstk100"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwstk100 extends GXWebObjectStub
{
   public wcwstk100( )
   {
   }

   public wcwstk100( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwstk100.class ));
   }

   public wcwstk100( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwstk100_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwstk100_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Productos Quimicos";
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

